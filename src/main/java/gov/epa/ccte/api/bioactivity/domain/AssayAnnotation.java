package gov.epa.ccte.api.bioactivity.domain;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Schema(description = "US EPA's Toxicity Forecaster (ToxCast) program makes invitro medium- and high-throughput screening assay data publicly available for prioritization and hazard characterization. Given ToxCast includes a heterogeneous set of assays across a diverse biological space, annotations in the database help flexibly aggregate and differentiate processed data. The definition of an “assay” is, in ToxCast, broken into 4 assay elements: assay source: the vendor/origination of the data, assay: the procedure to generate the component data, assay component: the raw data readout(s), assay component endpoint: the normalized component data. The assay element annotations are often short in a standardized format or use a controlled term list. Assay” resource endpoints provide assay metadata for specific or all invitrodb ‘aeids’ (assay endpoint ids). These include annotations from invitrodb’s assay, assay_component, assay_component_endpoint, assay_list, assay_source, and gene tables, all returned in a by-aeid format. Regular ToxCast/invitrodb users may find it easier to use the tcpl R package, which has integrated to make API data retrievable in a familiar format. See the tcpl vignette regarding data retrieval via API for more information.")
@Entity
@Table(name = "v_assay_annotation", schema = "bio4_1")
public class AssayAnnotation {
    @Id
    @Column(name = "aeid", nullable = false)
    @Schema(description = "Assay component endpoint ID")
    private Integer aeid;

    @Size(max = 255)
    @Column(name = "assay_component_endpoint_name")
    @Schema(description = "Assay component endpoint name (abbreviated 'aenm' within the package)")
    private String assayComponentEndpointName;

    @Column(name = "export_ready")
    @Schema(description = "Indicator of data readiness for public release, where (1) indicates the data is ready for export or (0) still in progress")
    private Integer exportReady;

    @Column(name = "internal_ready")
    @Schema(description = "Indicator of data readiness for internal use, where (1) indicates the data ready for internal users or (0) not ready for public release")
    private Integer internalReady;

    @Column(name = "assay_component_endpoint_desc", length = Integer.MAX_VALUE)
    @Schema(description = "Assay component endpoint description")
    private String assayComponentEndpointDesc;

    @Size(max = 255)
    @Column(name = "assay_function_type")
    @Schema(description = "Description of targeted mechanism and the purpose of the analyzed readout in relation to others from the same assay")
    private String assayFunctionType;

    @Size(max = 255)
    @Column(name = "normalized_data_type")
    @Schema(description = "Normalization approach for which the data is displayed")
    private String normalizedDataType;

    @Column(name = "burst_assay")
    @Schema(description = "Indicator if endpoint is included in the burst distribution (1) or not (0); Burst phenomenon can describe confounding activity, such as cytotoxicity due to non-specific activation of many targets at certain concentrations")
    private Integer burstAssay;

    @Size(max = 255)
    @Column(name = "key_positive_control")
    @Schema(description = "Tested chemical sample expected to produce activity; Used to assess assay validity")
    private String keyPositiveControl;

    @Size(max = 255)
    @Column(name = "signal_direction")
    @Schema(description = "Directionality of raw data signals from assay (gain or loss); Defines analysis direction")
    private String signalDirection;

    @Size(max = 255)
    @Column(name = "intended_target_type")
    @Schema(description = "General group of intended targets measured")
    private String intendedTargetType;

    @Size(max = 255)
    @Column(name = "intended_target_type_sub")
    @Schema(description = "Specific subgroup of intended targets measured")
    private String intendedTargetTypeSub;

    @Size(max = 255)
    @Column(name = "intended_target_family")
    @Schema(description = "Family of intended target measured; Populated on ToxCast chemical activity plot within CompTox dashboard")
    private String intendedTargetFamily;

    @Size(max = 255)
    @Column(name = "intended_target_family_sub")
    @Schema(description = "Specific subfamily of intended target measured")
    private String intendedTargetFamilySub;

    @Column(name = "cell_viability_assay")
    @Schema(description = "Indicator of the impact of cytotoxicity in confounding (1) or no cytotoxic impact (0)")
    private Integer cellViabilityAssay;

    @Column(name = "data_usability")
    @Schema(description = "Indicator of the usability of data (1) or no (0)")
    private Integer dataUsability;

    @Column(name = "acid")
    @Schema(description = "Assay component ID")
    private Integer acid;

    @Size(max = 255)
    @Column(name = "assay_component_name")
    @Schema(description = "Assay component name (abbreviated 'acnm' within the package)")
    private String assayComponentName;

    @Column(name = "assay_component_desc", length = Integer.MAX_VALUE)
    @Schema(description = "Assay component description")
    private String assayComponentDesc;

    @Column(name = "assay_component_target_desc", length = Integer.MAX_VALUE)
    @Schema(description = "Assay component target description. Generally includes information about mechanism of action with assay target, how disruption is detected, or significance of target disruption.")
    private String assayComponentTargetDesc;

    @Size(max = 255)
    @Column(name = "parameter_readout_type")
    @Schema(description = "Description of parameters measured")
    private String parameterReadoutType;

    @Size(max = 255)
    @Column(name = "assay_design_type")
    @Schema(description = "General description of the biological or physical process is translated into a detectable signal by assay mechanism")
    private String assayDesignType;

    @Size(max = 255)
    @Column(name = "assay_design_type_sub")
    @Schema(description = "Specific description of method through which a biological or physical process is translated into a detectable signal measured")
    private String assayDesignTypeSub;

    @Size(max = 255)
    @Column(name = "biological_process_target")
    @Schema(description = "General biological process being chemically disrupted")
    private String biologicalProcessTarget;

    @Size(max = 255)
    @Column(name = "detection_technology_type")
    @Schema(description = "General description of assay platform or detection signals measured")
    private String detectionTechnologyType;

    @Size(max = 255)
    @Column(name = "detection_technology_type_sub")
    @Schema(description = "Description of signals measured in assay platform")
    private String detectionTechnologyTypeSub;

    @Size(max = 255)
    @Column(name = "detection_technology")
    @Schema(description = "Specific description of assay platform used")
    private String detectionTechnology;

    @Size(max = 255)
    @Column(name = "key_assay_reagent_type")
    @Schema(description = "Type of critical reactant being measured")
    private String keyAssayReagentType;

    @Size(max = 255)
    @Column(name = "key_assay_reagent")
    @Schema(description = "Critical reactant measured")
    private String keyAssayReagent;

    @Size(max = 255)
    @Column(name = "technological_target_type")
    @Schema(description = "General description of technological target measured in assay platform")
    private String technologicalTargetType;

    @Size(max = 255)
    @Column(name = "technological_target_type_sub")
    @Schema(description = "Specific description of technological target measured in assay platform")
    private String technologicalTargetTypeSub;

    @Column(name = "aid")
    @Schema(description = "Assay ID")
    private Integer aid;

    @Size(max = 255)
    @Column(name = "assay_name")
    @Schema(description = "Assay name (abbreviated 'anm' within the package)")
    private String assayName;

    @Column(name = "assay_desc", length = Integer.MAX_VALUE)
    @Schema(description = "Assay description")
    private String assayDesc;

    @Column(name = "timepoint_hr")
    @Schema(description = "Treatment duration in hours")
    private Double timepointHr;

    @Column(name = "organism_id")
    @Schema(description = "NCBI taxonomic identifier, available here https://www.ncbi.nlm.nih.gov/taxonomy")
    private Integer organismId;

    @Size(max = 255)
    @Column(name = "organism")
    @Schema(description = "Organism of origin")
    private String organism;

    @Size(max = 255)
    @Column(name = "tissue")
    @Schema(description = "Tissue of origin")
    private String tissue;

    @Size(max = 255)
    @Column(name = "cell_format")
    @Schema(description = "Description of cell format")
    private String cellFormat;

    @Size(max = 255)
    @Column(name = "cell_free_component_source")
    @Schema(description = "Description of source for targeted cell-free components")
    private String cellFreeComponentSource;

    @Size(max = 255)
    @Column(name = "cell_short_name")
    @Schema(description = "Abbreviation of cell line")
    private String cellShortName;

    @Size(max = 255)
    @Column(name = "cell_growth_mode")
    @Schema(description = "Cell growth modality")
    private String cellGrowthMode;

    @Size(max = 255)
    @Column(name = "assay_footprint")
    @Schema(description = "Microtiter plate size")
    private String assayFootprint;

    @Size(max = 255)
    @Column(name = "assay_format_type")
    @Schema(description = "General description of assay format")
    private String assayFormatType;

    @Size(max = 255)
    @Column(name = "assay_format_type_sub")
    @Schema(description = "Specific description of assay format")
    private String assayFormatTypeSub;

    @Size(max = 255)
    @Column(name = "content_readout_type")
    @Schema(description = "Description of well characteristics being measured")
    private String contentReadoutType;

    @Size(max = 255)
    @Column(name = "dilution_solvent")
    @Schema(description = "Solvent used in sample dilution")
    private String dilutionSolvent;

    @Column(name = "dilution_solvent_percent_max")
    @Schema(description = "Maximum percent of dilution solvent used, from 0 to 1.")
    private Double dilutionSolventPercentMax;

    @Column(name = "asid")
    @Schema(description = "Assay source ID")
    private Integer asid;

    @Size(max = 255)
    @Column(name = "assay_source_name")
    @Schema(description = "Assay source name (typically an abbreviation of the assay_source_long_name, abbreviated 'asnm' within the package)")
    private String assaySourceName;

    @Size(max = 255)
    @Column(name = "assay_source_long_name")
    @Schema(description = "Full assay source name")
    private String assaySourceLongName;

    @Size(max = 255)
    @Column(name = "assay_source_desc")
    @Schema(description = "Assay source description")
    private String assaySourceDesc;

    @Column(name = "gene")
    @JdbcTypeCode(SqlTypes.JSON)
    @Schema(description = "JSON object containing gene mappings")
    private List<Gene> gene;

    @Column(name = "assay_list")
    @JdbcTypeCode(SqlTypes.JSON)
    @Schema(description = "JSON object containing curated groupings of endpoints anchored by use in CCTE publications and/or projects")
    private List<AssayList> assayList;

    @Column(name = "citations")
    @JdbcTypeCode(SqlTypes.JSON)
    @Schema(description = "JSON object containing references to assay-specific publications describing assay design or results")
    private List<Citation> citations;

    @NotNull
    @Column(name = "export_date", nullable = false)
    @Schema(description = "Date view was exported")
    private LocalDate exportDate;

    @Size(max = 28)
    @NotNull
    @ColumnDefault("''")
    @Column(name = "version", nullable = false, length = 28)
    @Schema(description = "Version of invitrodb data")
    private String version;

    @ColumnDefault("CURRENT_DATE")
    @Column(name = "import_date")
    @Schema(description = "Date imported to API")
    private LocalDate importDate;

}