package gov.epa.ccte.api.bioactivity.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.OffsetDateTime;

/**
 * 
 * @author arashid
 * Create at 2022-09-26 18:46
 */
@Entity
@Table(name = "bioactivity", schema = "ms")
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Bioactivity {

    /**
     * 
     */
    @Column(name = "id")
    @Id
    private Long id;

    /**
     * 
     */
    @Column(name = "num")
    private Long num;

    /**
     * 
     */
    @Column(name = "m4id")
    private Long m4id;

    /**
     * 
     */
    @Column(name = "sample_id", length = 50)
    private String sampleId;

    /**
     * 
     */
    @Column(name = "mc4_bmad")
    private Double mc4Bmad;

    /**
     * 
     */
    @Column(name = "mc4_resp_max")
    private Double mc4RespMax;

    /**
     * 
     */
    @Column(name = "resp_min")
    private Double respMin;

    /**
     * 
     */
    @Column(name = "max_mean_val")
    private Double maxMeanVal;

    /**
     * 
     */
    @Column(name = "max_mean_conc")
    private Double maxMeanConc;

    /**
     * 
     */
    @Column(name = "max_med_val")
    private Double maxMedVal;

    /**
     * 
     */
    @Column(name = "max_med_conc")
    private Double maxMedConc;

    /**
     * 
     */
    @Column(name = "logc_max")
    private Double logcMax;

    /**
     * 
     */
    @Column(name = "logc_min")
    private Double logcMin;

    /**
     * 
     */
    @Column(name = "cnst_flag")
    private Boolean cnstFlag;

    /**
     * 
     */
    @Column(name = "hill_flag")
    private Boolean hillFlag;

    /**
     * 
     */
    @Column(name = "hcov_flag")
    private Boolean hcovFlag;

    /**
     * 
     */
    @Column(name = "gnls_flag")
    private Boolean gnlsFlag;

    /**
     * 
     */
    @Column(name = "gcov_flag")
    private Boolean gcovFlag;

    /**
     * 
     */
    @Column(name = "mc4_cnst_error")
    private Double mc4CnstError;

    /**
     * 
     */
    @Column(name = "mc4_cnst_aic")
    private Double mc4CnstAic;

    /**
     * 
     */
    @Column(name = "cnst_rmse")
    private Double cnstRmse;

    /**
     * 
     */
    @Column(name = "cnst_prob")
    private Double cnstProb;

    /**
     * 
     */
    @Column(name = "hill_tp")
    private Double hillTp;

    /**
     * 
     */
    @Column(name = "hill_tp_sd")
    private Double hillTpSd;

    /**
     * 
     */
    @Column(name = "hill_ga")
    private Double hillGa;

    /**
     * 
     */
    @Column(name = "hill_ga_sd")
    private Double hillGaSd;

    /**
     * 
     */
    @Column(name = "hill_gw")
    private Double hillGw;

    /**
     * 
     */
    @Column(name = "hill_gw_sd")
    private Double hillGwSd;

    /**
     * 
     */
    @Column(name = "hill_er")
    private Double hillEr;

    /**
     * 
     */
    @Column(name = "hill_er_sd")
    private Double hillErSd;

    /**
     * 
     */
    @Column(name = "hill_aic")
    private Double hillAic;

    /**
     * 
     */
    @Column(name = "hill_rmse")
    private Double hillRmse;

    /**
     * 
     */
    @Column(name = "hill_prob")
    private Double hillProb;

    /**
     * 
     */
    @Column(name = "gnls_tp")
    private Double gnlsTp;

    /**
     * 
     */
    @Column(name = "gnls_lw")
    private Double gnlsLw;

    /**
     * 
     */
    @Column(name = "gnls_la")
    private Double gnlsLa;

    /**
     * 
     */
    @Column(name = "gnls_lw_sd")
    private Double gnlsLwSd;

    /**
     * 
     */
    @Column(name = "gnls_la_sd")
    private Double gnlsLaSd;

    /**
     * 
     */
    @Column(name = "gnls_tp_sd")
    private Double gnlsTpSd;

    /**
     * 
     */
    @Column(name = "gnls_ga")
    private Double gnlsGa;

    /**
     * 
     */
    @Column(name = "gnls_ga_sd")
    private Double gnlsGaSd;

    /**
     * 
     */
    @Column(name = "gnls_gw")
    private Double gnlsGw;

    /**
     * 
     */
    @Column(name = "gnls_gw_sd")
    private Double gnlsGwSd;

    /**
     * 
     */
    @Column(name = "gnls_er")
    private Double gnlsEr;

    /**
     * 
     */
    @Column(name = "gnls_er_sd")
    private Double gnlsErSd;

    /**
     * 
     */
    @Column(name = "gnls_aic")
    private Double gnlsAic;

    /**
     * 
     */
    @Column(name = "gnls_rmse")
    private Double gnlsRmse;

    /**
     * 
     */
    @Column(name = "gnls_prob")
    private Double gnlsProb;

    /**
     * 
     */
    @Column(name = "nconc")
    private Long nconc;

    /**
     * 
     */
    @Column(name = "npts")
    private Long npts;

    /**
     * 
     */
    @Column(name = "nrep")
    private Double nrep;

    /**
     * 
     */
    @Column(name = "nmed_gtbl")
    private Long nmedGtbl;

    /**
     * 
     */
    @Column(name = "tmpi")
    private Long tmpi;

    /**
     * 
     */
    @Column(name = "mc4_mthd_id")
    private Long mc4MthdId;

    /**
     * 
     */
    @Column(name = "exec_ordr")
    private Long execOrdr;

    /**
     * 
     */
    @Column(name = "mc4_mthd", length = 50)
    private String mc4Mthd;

    /**
     * 
     */
    @Column(name = "mc4_method_description")
    private String mc4MethodDescription;

    /**
     * 
     */
    @Column(name = "total_chemical_cnt")
    private Integer totalChemicalCnt;

    /**
     * 
     */
    @Column(name = "active_chemical_cnt")
    private Integer activeChemicalCnt;

    /**
     * 
     */
    @Column(name = "mc4_chid")
    private Integer mc4Chid;

    /**
     * 
     */
    @Column(name = "dtxsid", length = 45)
    private String dtxsid;

    /**
     * 
     */
    @Column(name = "logc_agg")
    private String logcAgg;

    /**
     * 
     */
    @Column(name = "resp_agg")
    private String respAgg;

    /**
     * 
     */
    @Column(name = "pval_agg")
    private Double pvalAgg;

    /**
     * 
     */
    @Column(name = "bval_agg")
    private Double bvalAgg;

    /**
     * 
     */
    @Column(name = "mc6_flag_agg")
    private String mc6FlagAgg;

    /**
     * 
     */
    @Column(name = "source_chid_rep")
    private Integer sourceChidRep;

    /**
     * 
     */
    @Column(name = "modl", length = 4)
    private String modl;

    /**
     * 
     */
    @Column(name = "hitc")
    private Integer hitc;

    /**
     * 
     */
    @Column(name = "coff")
    private Double coff;

    /**
     * 
     */
    @Column(name = "actp")
    private Double actp;

    /**
     * 
     */
    @Column(name = "modl_er")
    private Double modlEr;

    /**
     * 
     */
    @Column(name = "modl_tp")
    private Double modlTp;

    /**
     * 
     */
    @Column(name = "modl_ga")
    private Double modlGa;

    /**
     * 
     */
    @Column(name = "modl_gw")
    private Double modlGw;

    /**
     * 
     */
    @Column(name = "modl_la")
    private Double modlLa;

    /**
     * 
     */
    @Column(name = "modl_lw")
    private Double modlLw;

    /**
     * 
     */
    @Column(name = "modl_prob")
    private Double modlProb;

    /**
     * 
     */
    @Column(name = "modl_rmse")
    private Double modlRmse;

    /**
     * 
     */
    @Column(name = "modl_acc")
    private Double modlAcc;

    /**
     * 
     */
    @Column(name = "modl_acb")
    private Double modlAcb;

    /**
     * 
     */
    @Column(name = "modl_ac10")
    private Double modlAc10;

    /**
     * 
     */
    @Column(name = "model_type")
    private Integer modelType;

    /**
     * 
     */
    @Column(name = "fitc")
    private Long fitc;

    /**
     * 
     */
    @Column(name = "parent_fitc")
    private Long parentFitc;

    /**
     * 
     */
    @Column(name = "fit_catg_name", length = 30)
    private String fitCatgName;

    /**
     * 
     */
    @Column(name = "xloc")
    private Double xloc;

    /**
     * 
     */
    @Column(name = "yloc")
    private Double yloc;

    /**
     * 
     */
    @Column(name = "assay_component_endp_nm")
    private String assayComponentEndpNm;

    /**
     * 
     */
    @Column(name = "export_ready_ind")
    private Integer exportReadyInd;

    /**
     * 
     */
    @Column(name = "internal_ready_ind")
    private Integer internalReadyInd;

    /**
     * 
     */
    @Column(name = "assay_component_endp_desc")
    private String assayComponentEndpDesc;

    /**
     * 
     */
    @Column(name = "assay_function_typ_cd", length = 50)
    private String assayFunctionTypCd;

    /**
     * 
     */
    @Column(name = "normalized_data_typ_cd", length = 50)
    private String normalizedDataTypCd;

    /**
     * 
     */
    @Column(name = "analysis_direction_cd", length = 20)
    private String analysisDirectionCd;

    /**
     * 
     */
    @Column(name = "burst_assay_ind")
    private Integer burstAssayInd;

    /**
     * 
     */
    @Column(name = "positive_control_key", length = 100)
    private String positiveControlKey;

    /**
     * 
     */
    @Column(name = "signal_direction_cd", length = 20)
    private String signalDirectionCd;

    /**
     * 
     */
    @Column(name = "intended_tgt_typ_cd", length = 50)
    private String intendedTgtTypCd;

    /**
     * 
     */
    @Column(name = "intended_tgt_sub_typ_cd", length = 100)
    private String intendedTgtSubTypCd;

    /**
     * 
     */
    @Column(name = "intended_tgt_fam_tx", length = 50)
    private String intendedTgtFamTx;

    /**
     * 
     */
    @Column(name = "intended_tgt_fam_sub_tx", length = 50)
    private String intendedTgtFamSubTx;

    /**
     * 
     */
    @Column(name = "fit_all_ind")
    private Integer fitAllInd;

    /**
     * 
     */
    @Column(name = "cell_viability_assay_ind")
    private Integer cellViabilityAssayInd;

    /**
     * 
     */
    @Column(name = "data_usability_ind")
    private Integer dataUsabilityInd;

    /**
     * 
     */
    @Column(name = "assay_ttl", length = 1024)
    private String assayTtl;

    /**
     * 
     */
    @Column(name = "biological_response_tx")
    private String biologicalResponseTx;

    /**
     * 
     */
    @Column(name = "analytical_desc")
    private String analyticalDesc;

    /**
     * 
     */
    @Column(name = "source_tgt_id")
    private Integer sourceTgtId;

    /**
     * 
     */
    @Column(name = "intended_target_src", length = 50)
    private String intendedTargetSrc;

    /**
     * 
     */
    @Column(name = "source_assay_list_id")
    private Integer sourceAssayListId;

    /**
     * 
     */
    @Column(name = "assay_list_nm", length = 64)
    private String assayListNm;

    /**
     * 
     */
    @Column(name = "assay_list_desc", length = 2048)
    private String assayListDesc;

    /**
     * 
     */
    @Column(name = "m5id")
    private Long m5id;

    /**
     * 
     */
    @Column(name = "mc5_chid_rep")
    private Integer mc5ChidRep;

    /**
     * 
     */
    @Column(name = "mc5_hitc")
    private Integer mc5Hitc;

    /**
     * 
     */
    @Column(name = "mc5_coff")
    private Double mc5Coff;

    /**
     * 
     */
    @Column(name = "mc5_fitc")
    private Long mc5Fitc;

    /**
     * 
     */
    @Column(name = "mc5_modl", length = 4)
    private String mc5Modl;

    /**
     * 
     */
    @Column(name = "mc5_actp")
    private Double mc5Actp;

    /**
     * 
     */
    @Column(name = "mc5_modl_error")
    private Double mc5ModlError;

    /**
     * 
     */
    @Column(name = "mc5_modl_tp")
    private Double mc5ModlTp;

    /**
     * 
     */
    @Column(name = "mc5_modl_ga")
    private Double mc5ModlGa;

    /**
     * 
     */
    @Column(name = "mc5_modl_gw")
    private Double mc5ModlGw;

    /**
     * 
     */
    @Column(name = "mc5_modl_la")
    private Double mc5ModlLa;

    /**
     * 
     */
    @Column(name = "mc5_modl_lw")
    private Double mc5ModlLw;

    /**
     * 
     */
    @Column(name = "mc5_modl_prob")
    private Double mc5ModlProb;

    /**
     * 
     */
    @Column(name = "mc5_modl_rmse")
    private Double mc5ModlRmse;

    /**
     * 
     */
    @Column(name = "mc5_mdl_acc")
    private Double mc5MdlAcc;

    /**
     * 
     */
    @Column(name = "mc5_modl_acb")
    private Double mc5ModlAcb;

    /**
     * 
     */
    @Column(name = "mc5_modl_ac10")
    private Double mc5ModlAc10;

    /**
     * 
     */
    @Column(name = "stkc")
    private Double stkc;

    /**
     * 
     */
    @Column(name = "aeid")
    private Integer aeid;

    /**
     * 
     */
    @Column(name = "assay_name")
    private String assayName;

    /**
     * 
     */
    @Column(name = "assay_component_name")
    private String assayComponentName;

    /**
     * 
     */
    @Column(name = "source")
    private String source;

    /**
     * 
     */
    @Column(name = "source_description")
    private String sourceDescription;

    /**
     * 
     */
    @Column(name = "source_long_description")
    private String sourceLongDescription;

    /**
     * 
     */
    @Column(name = "source_long_name")
    private String sourceLongName;

    /**
     * 
     */
    @Column(name = "assay_format_type")
    private String assayFormatType;

    /**
     * 
     */
    @Column(name = "biological_process_target", length = 200)
    private String biologicalProcessTarget;

    /**
     * 
     */
    @Column(name = "detection_tec_cd", length = 200)
    private String detectionTecCd;

    /**
     * 
     */
    @Column(name = "tissue")
    private String tissue;

    /**
     * 
     */
    @Column(name = "assay_description")
    private String assayDescription;

    /**
     * 
     */
    @Column(name = "gene_info")
    private String geneInfo;

    /**
     * 
     */
    @Column(name = "ext_uniprot_accesn_num", length = 32)
    private String extUniprotAccesnNum;

    /**
     * 
     */
    @Column(name = "created_dt")
    private OffsetDateTime createdDt;
}