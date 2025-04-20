package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.BioactivityData;
import gov.epa.ccte.api.bioactivity.projection.data.AedRawDataProjection;

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
    	    SELECT b.dsstox_substance_id AS dsstoxSubstanceId,
    	           d.preferred_name AS preferredName,
    	           b.aeid AS aeid,
    	           b.mc7_param AS mc7Param
    	    FROM invitro.mv_bioactivity b
    	    JOIN ch.v_chemical_details d ON b.dsstox_substance_id = d.dtxsid
    	    WHERE b.dsstox_substance_id = :dtxsid
    	""", nativeQuery = true)
    	List<AedRawDataProjection> findAedDataByDtxsid(@Param("dtxsid") String dtxsid);
    
    @Query(value = """
    	    SELECT b.dsstox_substance_id AS dsstoxSubstanceId,
    	           d.preferred_name AS preferredName,
    	           b.aeid AS aeid,
    	           b.mc7_param AS mc7Param
    	    FROM invitro.mv_bioactivity b
    	    JOIN ch.v_chemical_details d ON b.dsstox_substance_id = d.dtxsid
    	    WHERE b.dsstox_substance_id IN (:dtxsids)
    	    ORDER BY b.dsstox_substance_id
    	""", nativeQuery = true)
    	List<AedRawDataProjection> findAedDataByDtxsidIn(@Param("dtxsids") List<String> dtxsids);


}
