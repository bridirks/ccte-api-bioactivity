package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.BioactivityData;
import gov.epa.ccte.api.bioactivity.projection.data.SummaryByTissue;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("unused")
@RepositoryRestResource(exported = false)
public interface BioactivityDataRepository extends JpaRepository<BioactivityData, Long> {
    @Transactional(readOnly = true)
    <T>List<T> findByDtxsid(String dtxsid, Class<T> type);
    
    @Transactional(readOnly = true)
    <T>List<T> findByDtxsidInOrderByDtxsidAsc(String[] dtxsids, Class<T> type);

    @Transactional(readOnly = true)
    <T> T findByM4id(Integer m4id, Class<T> type);

    @Transactional(readOnly = true)
    <T>List<T> findByM4idInOrderByM4idAsc(String[] spids, Class<T> type);

    @Transactional(readOnly = true)
    <T>List<T> findByAeid(Integer aeid, Class<T> type);
    
    @Transactional(readOnly = true)
    <T>List<T> findByAeidInOrderByAeidAsc(String[] aeids, Class<T> type);

    @Transactional(readOnly = true)
    <T>List<T> findBySpid(String spid, Class<T> type);
    
    @Transactional(readOnly = true)
    <T>List<T> findBySpidInOrderBySpidAsc(String[] spids, Class<T> type);


    @Query(value = """
    		SELECT
                bio.chnm AS chemicalName,
                bio.dsstox_substance_id AS dtxsid,
                bio_elem->>'top' AS top,
                bio_elem->>'ac50' AS AC50,
                bio_elem->>'acc' AS ACC,
                bio.max_med_conc AS maxMedConc,
                bio.coff AS cutOff,
                maa.intended_target_family AS intendedTargetFamily,
                maa.tissue AS tissue,
                bio.hitc AS continuousHitCall,
                        CASE
            WHEN bio_elem->>'ac50' IS NOT NULL THEN LOG(CAST(bio_elem->>'ac50' AS float))
            END AS logAC50,
            CASE
                WHEN bio.hitc >= 0.9 THEN 'Active'
                Else 'Inactive'
            END AS hitCall
            FROM 
                invitro.mv_bioactivity bio
            JOIN 
                invitro.mv_assay_annotation maa 
            ON 
                bio.aeid = maa.aeid, 
                json_array_elements(json_build_array(bio.mc5_param)) AS bio_elem
            WHERE
                bio.dsstox_substance_id = :dtxsid AND maa.tissue = :tissue
            ORDER BY bio.hitc DESC;
    		""", nativeQuery = true)
    List<SummaryByTissue> findByDtxsidAndTissue(@Param("dtxsid")String dtxsid, @Param("tissue")String tissue);
}
