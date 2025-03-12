package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.AssayAnnotation;
import gov.epa.ccte.api.bioactivity.domain.AssayAnnotationAgg;
import gov.epa.ccte.api.bioactivity.domain.Gene;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayCitation;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayGene;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("unused")
@RepositoryRestResource(exported = false)
public interface AssayAnnotationAggRepository extends JpaRepository<AssayAnnotationAgg, Integer> {

	@Query(value = """
			SELECT DISTINCT aeid, assay_component_endpoint_name, assay_component_endpoint_desc, assay_function_type,
			       normalized_data_type, burst_assay, key_positive_control, signal_direction, intended_target_type,
			       intended_target_type_sub, intended_target_family, intended_target_family_sub, assay_component_name,
			       assay_component_desc, assay_component_target_desc, parameter_readout_type, assay_design_type,
			       assay_design_type_sub, biological_process_target, detection_technology, detection_technology_type,
			       detection_technology_type_sub, key_assay_reagent_type, key_assay_reagent, technological_target_type,
			       technological_target_type_sub, assay_name, assay_desc, timepoint_hr, organism, tissue, cell_format,
			       cell_free_component_source, cell_short_name, cell_growth_mode, assay_footprint, assay_format_type,
			       assay_format_type_sub, content_readout_type, dilution_solvent, dilution_solvent_percent_max,
			       assay_source_name, assay_source_long_name, assay_source_desc
			FROM invitro.mv_assay_annotation
			WHERE aeid = :aeid
			""", nativeQuery = true)
	List<AssayAnnotationAgg> findAnnotationByAeid(@Param("aeid") Integer aeid);

	@Query(value = """
			    SELECT aeid,
			           assay_component_endpoint_name,
			           element ->> 'pmid'      AS pmid,
			           element ->> 'author'    AS author,
			           element ->> 'citation'  AS citation,
			           element ->> 'doi'       AS doi,
			           element ->> 'other_id'  AS otherId,
			           element ->> 'oth_sourc' AS otherSource,
			           element ->> 'title'     AS title,
			           element ->> 'url'       AS url
			    FROM invitro.mv_assay_annotation maa,
			         jsonb_array_elements(maa.citations\\:\\:jsonb) AS element
			    WHERE maa.citations IS NOT NULL AND aeid = :aeid
			""", nativeQuery = true)
	List<AssayCitation> findCitationsByAeid(@Param("aeid") Integer aeid);

	@Query(value = """
			    SELECT aeid,
			           element ->> 'entrez_gene_id' AS entrezGeneId,
			           element ->> 'gene_name'      AS geneName,
			           element ->> 'gene_symbol'    AS geneSymbol
			    FROM invitro.mv_assay_annotation maa,
			         jsonb_array_elements(maa.gene\\:\\:jsonb) AS element
			    WHERE gene IS NOT NULL AND aeid = :aeid
			""", nativeQuery = true)
	List<AssayGene> findGeneByAeid(@Param("aeid") Integer aeid);

}