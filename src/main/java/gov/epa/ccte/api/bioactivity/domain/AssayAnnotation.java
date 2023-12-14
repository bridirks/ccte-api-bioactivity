package gov.epa.ccte.api.bioactivity.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "v_assay_annotation", schema = "bio4_1")
public class AssayAnnotation {
    @Id
    @Column(name = "aeid", nullable = false)
    private Integer aeid;

    @Size(max = 255)
    @Column(name = "assay_component_endpoint_name")
    private String assayComponentEndpointName;

    @Column(name = "export_ready")
    private Integer exportReady;

    @Column(name = "internal_ready")
    private Integer internalReady;

    @Column(name = "assay_component_endpoint_desc", length = Integer.MAX_VALUE)
    private String assayComponentEndpointDesc;

    @Size(max = 255)
    @Column(name = "assay_function_type")
    private String assayFunctionType;

    @Size(max = 255)
    @Column(name = "normalized_data_type")
    private String normalizedDataType;

    @Column(name = "burst_assay")
    private Integer burstAssay;

    @Size(max = 255)
    @Column(name = "key_positive_control")
    private String keyPositiveControl;

    @Size(max = 255)
    @Column(name = "signal_direction")
    private String signalDirection;

    @Size(max = 255)
    @Column(name = "intended_target_type")
    private String intendedTargetType;

    @Size(max = 255)
    @Column(name = "intended_target_type_sub")
    private String intendedTargetTypeSub;

    @Size(max = 255)
    @Column(name = "intended_target_family")
    private String intendedTargetFamily;

    @Size(max = 255)
    @Column(name = "intended_target_family_sub")
    private String intendedTargetFamilySub;

    @Column(name = "cell_viability_assay")
    private Integer cellViabilityAssay;

    @Column(name = "data_usability")
    private Integer dataUsability;

    @Column(name = "acid")
    private Integer acid;

    @Size(max = 255)
    @Column(name = "assay_component_name")
    private String assayComponentName;

    @Column(name = "assay_component_desc", length = Integer.MAX_VALUE)
    private String assayComponentDesc;

    @Column(name = "assay_component_target_desc", length = Integer.MAX_VALUE)
    private String assayComponentTargetDesc;

    @Size(max = 255)
    @Column(name = "parameter_readout_type")
    private String parameterReadoutType;

    @Size(max = 255)
    @Column(name = "assay_design_type")
    private String assayDesignType;

    @Size(max = 255)
    @Column(name = "assay_design_type_sub")
    private String assayDesignTypeSub;

    @Size(max = 255)
    @Column(name = "biological_process_target")
    private String biologicalProcessTarget;

    @Size(max = 255)
    @Column(name = "detection_technology_type")
    private String detectionTechnologyType;

    @Size(max = 255)
    @Column(name = "detection_technology_type_sub")
    private String detectionTechnologyTypeSub;

    @Size(max = 255)
    @Column(name = "detection_technology")
    private String detectionTechnology;

    @Size(max = 255)
    @Column(name = "key_assay_reagent_type")
    private String keyAssayReagentType;

    @Size(max = 255)
    @Column(name = "key_assay_reagent")
    private String keyAssayReagent;

    @Size(max = 255)
    @Column(name = "technological_target_type")
    private String technologicalTargetType;

    @Size(max = 255)
    @Column(name = "technological_target_type_sub")
    private String technologicalTargetTypeSub;

    @Column(name = "aid")
    private Integer aid;

    @Size(max = 255)
    @Column(name = "assay_name")
    private String assayName;

    @Column(name = "assay_desc", length = Integer.MAX_VALUE)
    private String assayDesc;

    @Column(name = "timepoint_hr")
    private Double timepointHr;

    @Column(name = "organism_id")
    private Integer organismId;

    @Size(max = 255)
    @Column(name = "organism")
    private String organism;

    @Size(max = 255)
    @Column(name = "tissue")
    private String tissue;

    @Size(max = 255)
    @Column(name = "cell_format")
    private String cellFormat;

    @Size(max = 255)
    @Column(name = "cell_free_component_source")
    private String cellFreeComponentSource;

    @Size(max = 255)
    @Column(name = "cell_short_name")
    private String cellShortName;

    @Size(max = 255)
    @Column(name = "cell_growth_mode")
    private String cellGrowthMode;

    @Size(max = 255)
    @Column(name = "assay_footprint")
    private String assayFootprint;

    @Size(max = 255)
    @Column(name = "assay_format_type")
    private String assayFormatType;

    @Size(max = 255)
    @Column(name = "assay_format_type_sub")
    private String assayFormatTypeSub;

    @Size(max = 255)
    @Column(name = "content_readout_type")
    private String contentReadoutType;

    @Size(max = 255)
    @Column(name = "dilution_solvent")
    private String dilutionSolvent;

    @Column(name = "dilution_solvent_percent_max")
    private Double dilutionSolventPercentMax;

    @Column(name = "asid")
    private Integer asid;

    @Size(max = 255)
    @Column(name = "assay_source_name")
    private String assaySourceName;

    @Size(max = 255)
    @Column(name = "assay_source_long_name")
    private String assaySourceLongName;

    @Size(max = 255)
    @Column(name = "assay_source_desc")
    private String assaySourceDesc;

    @Column(name = "gene")
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Gene> gene;

    @Column(name = "assay_list")
    @JdbcTypeCode(SqlTypes.JSON)
    private List<AssayList> assayList;

    @Column(name = "citations")
    @JdbcTypeCode(SqlTypes.JSON)
    private List<Citation> citations;

}