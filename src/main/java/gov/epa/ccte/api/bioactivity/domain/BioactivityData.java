package gov.epa.ccte.api.bioactivity.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.math.BigDecimal;
import java.util.Map;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "v_bioactivity_data", schema = "bio4_1")
public class BioactivityData {
    @Id
    @Column(name = "m4id")
    private Integer m4id;

    @Column(name = "aeid")
    private Integer aeid;

    @Size(max = 50)
    @Column(name = "spid", length = 50)
    private String spid;

    @Column(name = "chid")
    private Integer chid;

    @Size(max = 45)
    @Column(name = "casn", length = 45)
    private String casn;

    @Size(max = 255)
    @Column(name = "chnm")
    private String chnm;

    @Size(max = 255)
    @Column(name = "dsstox_substance_id")
    private String dtxsid;

    @Column(name = "bmad")
    private Double bmad;

    @Column(name = "resp_max")
    private Double respMax;

    @Column(name = "resp_min")
    private Double respMin;

    @Column(name = "max_mean")
    private Double maxMean;

    @Column(name = "max_mean_conc")
    private Double maxMeanConc;

    @Column(name = "max_med")
    private Double maxMed;

    @Column(name = "max_med_conc")
    private Double maxMedConc;

    @Column(name = "logc_max")
    private Double logcMax;

    @Column(name = "logc_min")
    private Double logcMin;

    @Column(name = "nconc")
    private Integer nconc;

    @Column(name = "npts")
    private Integer npts;

    @Column(name = "nrep")
    private Double nrep;

    @Column(name = "nmed_gtbl")
    private Integer nmedGtbl;

    @Column(name = "tmpi")
    private Integer tmpi;

    @Column(name = "m5id")
    private Long m5id;

    @Size(max = 5)
    @Column(name = "modl", length = 5)
    private String modl;

    @Column(name = "hitc")
    private Double hitc;

    @Column(name = "fitc")
    private Short fitc;

    @Column(name = "coff")
    private Double coff;

    @Column(name = "actp")
    private Double actp;

    @Column(name = "model_type")
    private Short modelType;

    @Column(name = "chid_rep")
    private Short chidRep;

    @Column(name = "stkc")
    private Double stkc;

    @Size(max = 50)
    @Column(name = "stkc_unit", length = 50)
    private String stkcUnit;

    @Size(max = 50)
    @Column(name = "tested_conc_unit", length = 50)
    private String testedConcUnit;

    @Column(name = "mc3_param")
    @JdbcTypeCode(SqlTypes.JSON)
    private Mc3Param mc3Param;

    @Column(name = "mc4_param")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, BigDecimal> mc4Param;

    @Column(name = "mc5_param")
    @JdbcTypeCode(SqlTypes.JSON)
    private Map<String, BigDecimal> mc5Param;

    @Column(name = "mc6_param")
    @JdbcTypeCode(SqlTypes.JSON)
    private Mc6Param mc6Param;

}