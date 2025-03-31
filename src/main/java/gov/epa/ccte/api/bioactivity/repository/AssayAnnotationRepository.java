package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.AssayAnnotation;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayAll;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("unused")
@RepositoryRestResource(exported = false)
public interface AssayAnnotationRepository extends JpaRepository<AssayAnnotation, Long> {
    <T> T findByAeid(Integer aeid, Class<T> type);
    
    @Transactional(readOnly = true)
    <T> List<T> findByAeidInOrderByAeidAsc(String[] aeids, Class<T> type);
    
    <T> List<T> findBy(Class<T> type);
    
    @Query(value = """
            SELECT 
                maa.assay_source_name AS vendorKey,
                maa.assay_source_desc AS vendorName,
                maa.assay_name AS assayName,
                maa.aeid AS aeid,
                maa.assay_component_name AS assayComponentName,
                maa.assay_component_endpoint_name AS assayComponentEndpointName,
                maa.assay_component_endpoint_desc AS assayComponentEndpointDesc,
                maa.assay_desc || '<br>' || maa.assay_component_desc || '<br>' || maa.assay_component_endpoint_desc AS ccdAssayDetail,
                gene_elem->>'entrez_gene_id' AS entrezGeneId,
                gene_elem->>'gene_name' AS geneName,
                gene_elem->>'gene_symbol' AS geneSymbol,
                maa.common_name AS commonName,
                maa.taxon_name AS taxonName,
                agg.active_sc AS singleConcChemicalCountActive,
                agg.total_sc AS singleConcChemicalCountTotal,
                agg.active_mc AS multiConcChemicalCountActive,
                agg.total_mc AS multiConcChemicalCountTotal
            FROM 
                invitro.mv_assay_annotation maa
            JOIN 
                invitro.mv_assay_agg agg 
            ON 
                maa.aeid = agg.aeid, 
                json_array_elements(maa.gene) AS gene_elem
            """, nativeQuery = true)
        <T> List<T> findAssayAnnotations(Class<T> type);

}