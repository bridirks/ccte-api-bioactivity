package gov.epa.ccte.api.bioactivity.domain;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import java.time.Instant;

@Entity
@Table(name = "bioactivity")
public class Bioactivity {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "num")
    private Long num;

    @Column(name = "m4id")
    private Long m4id;

    @Size(max = 50)
    @Column(name = "sample_id", length = 50)
    private String sampleId;

    @Column(name = "mc4_bmad")
    private Double mc4Bmad;

    @Column(name = "mc4_resp_max")
    private Double mc4RespMax;

    @Column(name = "resp_min")
    private Double respMin;

    @Column(name = "max_mean_val")
    private Double maxMeanVal;

    @Column(name = "max_mean_conc")
    private Double maxMeanConc;

    @Column(name = "max_med_val")
    private Double maxMedVal;

    @Column(name = "max_med_conc")
    private Double maxMedConc;

    @Column(name = "logc_max")
    private Double logcMax;

    @Column(name = "logc_min")
    private Double logcMin;

    @Column(name = "cnst_flag")
    private Boolean cnstFlag;

    @Column(name = "hill_flag")
    private Boolean hillFlag;

    @Column(name = "hcov_flag")
    private Boolean hcovFlag;

    @Column(name = "gnls_flag")
    private Boolean gnlsFlag;

    @Column(name = "gcov_flag")
    private Boolean gcovFlag;

    @Column(name = "mc4_cnst_error")
    private Double mc4CnstError;

    @Column(name = "mc4_cnst_aic")
    private Double mc4CnstAic;

    @Column(name = "cnst_rmse")
    private Double cnstRmse;

    @Column(name = "cnst_prob")
    private Double cnstProb;

    @Column(name = "hill_tp")
    private Double hillTp;

    @Column(name = "hill_tp_sd")
    private Double hillTpSd;

    @Column(name = "hill_ga")
    private Double hillGa;

    @Column(name = "hill_ga_sd")
    private Double hillGaSd;

    @Column(name = "hill_gw")
    private Double hillGw;

    @Column(name = "hill_gw_sd")
    private Double hillGwSd;

    @Column(name = "hill_er")
    private Double hillEr;

    @Column(name = "hill_er_sd")
    private Double hillErSd;

    @Column(name = "hill_aic")
    private Double hillAic;

    @Column(name = "hill_rmse")
    private Double hillRmse;

    @Column(name = "hill_prob")
    private Double hillProb;

    @Column(name = "gnls_tp")
    private Double gnlsTp;

    @Column(name = "gnls_lw")
    private Double gnlsLw;

    @Column(name = "gnls_la")
    private Double gnlsLa;

    @Column(name = "gnls_lw_sd")
    private Double gnlsLwSd;

    @Column(name = "gnls_la_sd")
    private Double gnlsLaSd;

    @Column(name = "gnls_tp_sd")
    private Double gnlsTpSd;

    @Column(name = "gnls_ga")
    private Double gnlsGa;

    @Column(name = "gnls_ga_sd")
    private Double gnlsGaSd;

    @Column(name = "gnls_gw")
    private Double gnlsGw;

    @Column(name = "gnls_gw_sd")
    private Double gnlsGwSd;

    @Column(name = "gnls_er")
    private Double gnlsEr;

    @Column(name = "gnls_er_sd")
    private Double gnlsErSd;

    @Column(name = "gnls_aic")
    private Double gnlsAic;

    @Column(name = "gnls_rmse")
    private Double gnlsRmse;

    @Column(name = "gnls_prob")
    private Double gnlsProb;

    @Column(name = "nconc")
    private Long nconc;

    @Column(name = "npts")
    private Long npts;

    @Column(name = "nrep")
    private Double nrep;

    @Column(name = "nmed_gtbl")
    private Long nmedGtbl;

    @Column(name = "tmpi")
    private Long tmpi;

    @Column(name = "mc4_mthd_id")
    private Long mc4MthdId;

    @Column(name = "exec_ordr")
    private Long execOrdr;

    @Size(max = 50)
    @Column(name = "mc4_mthd", length = 50)
    private String mc4Mthd;

    @Size(max = 255)
    @Column(name = "mc4_method_description")
    private String mc4MethodDescription;

    @Column(name = "total_chemical_cnt")
    private Integer totalChemicalCnt;

    @Column(name = "active_chemical_cnt")
    private Integer activeChemicalCnt;

    @Column(name = "mc4_chid")
    private Integer mc4Chid;

    @Size(max = 45)
    @Column(name = "dtxsid", length = 45)
    private String dtxsid;

    @Column(name = "logc_agg")
    @Type(type = "org.hibernate.type.TextType")
    private String logcAgg;

    @Column(name = "resp_agg")
    @Type(type = "org.hibernate.type.TextType")
    private String respAgg;

    @Column(name = "pval_agg")
    private Double pvalAgg;

    @Column(name = "bval_agg")
    private Double bvalAgg;

    @Column(name = "mc6_flag_agg")
    @Type(type = "org.hibernate.type.TextType")
    private String mc6FlagAgg;

    @Column(name = "source_chid_rep")
    private Short sourceChidRep;

    @Size(max = 4)
    @Column(name = "modl", length = 4)
    private String modl;

    @Column(name = "hitc")
    private Short hitc;

    @Column(name = "coff")
    private Double coff;

    @Column(name = "actp")
    private Double actp;

    @Column(name = "modl_er")
    private Double modlEr;

    @Column(name = "modl_tp")
    private Double modlTp;

    @Column(name = "modl_ga")
    private Double modlGa;

    @Column(name = "modl_gw")
    private Double modlGw;

    @Column(name = "modl_la")
    private Double modlLa;

    @Column(name = "modl_lw")
    private Double modlLw;

    @Column(name = "modl_prob")
    private Double modlProb;

    @Column(name = "modl_rmse")
    private Double modlRmse;

    @Column(name = "modl_acc")
    private Double modlAcc;

    @Column(name = "modl_acb")
    private Double modlAcb;

    @Column(name = "modl_ac10")
    private Double modlAc10;

    @Column(name = "model_type")
    private Short modelType;

    @Column(name = "fitc")
    private Long fitc;

    @Column(name = "parent_fitc")
    private Long parentFitc;

    @Size(max = 30)
    @Column(name = "fit_catg_name", length = 30)
    private String fitCatgName;

    @Column(name = "xloc")
    private Double xloc;

    @Column(name = "yloc")
    private Double yloc;

    @Size(max = 255)
    @Column(name = "assay_component_endp_nm")
    private String assayComponentEndpNm;

    @Column(name = "export_ready_ind")
    private Short exportReadyInd;

    @Column(name = "internal_ready_ind")
    private Short internalReadyInd;

    @Column(name = "assay_component_endp_desc")
    @Type(type = "org.hibernate.type.TextType")
    private String assayComponentEndpDesc;

    @Size(max = 50)
    @Column(name = "assay_function_typ_cd", length = 50)
    private String assayFunctionTypCd;

    @Size(max = 50)
    @Column(name = "normalized_data_typ_cd", length = 50)
    private String normalizedDataTypCd;

    @Size(max = 20)
    @Column(name = "analysis_direction_cd", length = 20)
    private String analysisDirectionCd;

    @Column(name = "burst_assay_ind")
    private Short burstAssayInd;

    @Size(max = 100)
    @Column(name = "positive_control_key", length = 100)
    private String positiveControlKey;

    @Size(max = 20)
    @Column(name = "signal_direction_cd", length = 20)
    private String signalDirectionCd;

    @Size(max = 50)
    @Column(name = "intended_tgt_typ_cd", length = 50)
    private String intendedTgtTypCd;

    @Size(max = 100)
    @Column(name = "intended_tgt_sub_typ_cd", length = 100)
    private String intendedTgtSubTypCd;

    @Size(max = 50)
    @Column(name = "intended_tgt_fam_tx", length = 50)
    private String intendedTgtFamTx;

    @Size(max = 50)
    @Column(name = "intended_tgt_fam_sub_tx", length = 50)
    private String intendedTgtFamSubTx;

    @Column(name = "fit_all_ind")
    private Short fitAllInd;

    @Column(name = "cell_viability_assay_ind")
    private Short cellViabilityAssayInd;

    @Column(name = "data_usability_ind")
    private Short dataUsabilityInd;

    @Size(max = 1024)
    @Column(name = "assay_ttl", length = 1024)
    private String assayTtl;

    @Column(name = "biological_response_tx")
    @Type(type = "org.hibernate.type.TextType")
    private String biologicalResponseTx;

    @Column(name = "analytical_desc")
    @Type(type = "org.hibernate.type.TextType")
    private String analyticalDesc;

    @Column(name = "source_tgt_id")
    private Integer sourceTgtId;

    @Size(max = 50)
    @Column(name = "intended_target_src", length = 50)
    private String intendedTargetSrc;

    @Column(name = "source_assay_list_id")
    private Integer sourceAssayListId;

    @Size(max = 64)
    @Column(name = "assay_list_nm", length = 64)
    private String assayListNm;

    @Size(max = 2048)
    @Column(name = "assay_list_desc", length = 2048)
    private String assayListDesc;

    @Column(name = "m5id")
    private Long m5id;

    @Column(name = "mc5_chid_rep")
    private Short mc5ChidRep;

    @Column(name = "mc5_hitc")
    private Short mc5Hitc;

    @Column(name = "mc5_coff")
    private Double mc5Coff;

    @Column(name = "mc5_fitc")
    private Long mc5Fitc;

    @Size(max = 4)
    @Column(name = "mc5_modl", length = 4)
    private String mc5Modl;

    @Column(name = "mc5_actp")
    private Double mc5Actp;

    @Column(name = "mc5_modl_error")
    private Double mc5ModlError;

    @Column(name = "mc5_modl_tp")
    private Double mc5ModlTp;

    @Column(name = "mc5_modl_ga")
    private Double mc5ModlGa;

    @Column(name = "mc5_modl_gw")
    private Double mc5ModlGw;

    @Column(name = "mc5_modl_la")
    private Double mc5ModlLa;

    @Column(name = "mc5_modl_lw")
    private Double mc5ModlLw;

    @Column(name = "mc5_modl_prob")
    private Double mc5ModlProb;

    @Column(name = "mc5_modl_rmse")
    private Double mc5ModlRmse;

    @Column(name = "mc5_mdl_acc")
    private Double mc5MdlAcc;

    @Column(name = "mc5_modl_acb")
    private Double mc5ModlAcb;

    @Column(name = "mc5_modl_ac10")
    private Double mc5ModlAc10;

    @Column(name = "stkc")
    private Double stkc;

    @Column(name = "aeid")
    private Integer aeid;

    @Size(max = 255)
    @Column(name = "assay_name")
    private String assayName;

    @Size(max = 255)
    @Column(name = "assay_component_name")
    private String assayComponentName;

    @Size(max = 255)
    @Column(name = "source")
    private String source;

    @Size(max = 255)
    @Column(name = "source_description")
    private String sourceDescription;

    @Size(max = 255)
    @Column(name = "source_long_description")
    private String sourceLongDescription;

    @Size(max = 255)
    @Column(name = "source_long_name")
    private String sourceLongName;

    @Size(max = 255)
    @Column(name = "assay_format_type")
    private String assayFormatType;

    @Size(max = 200)
    @Column(name = "biological_process_target", length = 200)
    private String biologicalProcessTarget;

    @Size(max = 200)
    @Column(name = "detection_tec_cd", length = 200)
    private String detectionTecCd;

    @Size(max = 255)
    @Column(name = "tissue")
    private String tissue;

    @Column(name = "assay_description")
    @Type(type = "org.hibernate.type.TextType")
    private String assayDescription;

    @Column(name = "gene_info")
    @Type(type = "org.hibernate.type.TextType")
    private String geneInfo;

    @Size(max = 32)
    @Column(name = "ext_uniprot_accesn_num", length = 32)
    private String extUniprotAccesnNum;

    @Column(name = "created_dt")
    private Instant createdDt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public Long getM4id() {
        return m4id;
    }

    public void setM4id(Long m4id) {
        this.m4id = m4id;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public Double getMc4Bmad() {
        return mc4Bmad;
    }

    public void setMc4Bmad(Double mc4Bmad) {
        this.mc4Bmad = mc4Bmad;
    }

    public Double getMc4RespMax() {
        return mc4RespMax;
    }

    public void setMc4RespMax(Double mc4RespMax) {
        this.mc4RespMax = mc4RespMax;
    }

    public Double getRespMin() {
        return respMin;
    }

    public void setRespMin(Double respMin) {
        this.respMin = respMin;
    }

    public Double getMaxMeanVal() {
        return maxMeanVal;
    }

    public void setMaxMeanVal(Double maxMeanVal) {
        this.maxMeanVal = maxMeanVal;
    }

    public Double getMaxMeanConc() {
        return maxMeanConc;
    }

    public void setMaxMeanConc(Double maxMeanConc) {
        this.maxMeanConc = maxMeanConc;
    }

    public Double getMaxMedVal() {
        return maxMedVal;
    }

    public void setMaxMedVal(Double maxMedVal) {
        this.maxMedVal = maxMedVal;
    }

    public Double getMaxMedConc() {
        return maxMedConc;
    }

    public void setMaxMedConc(Double maxMedConc) {
        this.maxMedConc = maxMedConc;
    }

    public Double getLogcMax() {
        return logcMax;
    }

    public void setLogcMax(Double logcMax) {
        this.logcMax = logcMax;
    }

    public Double getLogcMin() {
        return logcMin;
    }

    public void setLogcMin(Double logcMin) {
        this.logcMin = logcMin;
    }

    public Boolean getCnstFlag() {
        return cnstFlag;
    }

    public void setCnstFlag(Boolean cnstFlag) {
        this.cnstFlag = cnstFlag;
    }

    public Boolean getHillFlag() {
        return hillFlag;
    }

    public void setHillFlag(Boolean hillFlag) {
        this.hillFlag = hillFlag;
    }

    public Boolean getHcovFlag() {
        return hcovFlag;
    }

    public void setHcovFlag(Boolean hcovFlag) {
        this.hcovFlag = hcovFlag;
    }

    public Boolean getGnlsFlag() {
        return gnlsFlag;
    }

    public void setGnlsFlag(Boolean gnlsFlag) {
        this.gnlsFlag = gnlsFlag;
    }

    public Boolean getGcovFlag() {
        return gcovFlag;
    }

    public void setGcovFlag(Boolean gcovFlag) {
        this.gcovFlag = gcovFlag;
    }

    public Double getMc4CnstError() {
        return mc4CnstError;
    }

    public void setMc4CnstError(Double mc4CnstError) {
        this.mc4CnstError = mc4CnstError;
    }

    public Double getMc4CnstAic() {
        return mc4CnstAic;
    }

    public void setMc4CnstAic(Double mc4CnstAic) {
        this.mc4CnstAic = mc4CnstAic;
    }

    public Double getCnstRmse() {
        return cnstRmse;
    }

    public void setCnstRmse(Double cnstRmse) {
        this.cnstRmse = cnstRmse;
    }

    public Double getCnstProb() {
        return cnstProb;
    }

    public void setCnstProb(Double cnstProb) {
        this.cnstProb = cnstProb;
    }

    public Double getHillTp() {
        return hillTp;
    }

    public void setHillTp(Double hillTp) {
        this.hillTp = hillTp;
    }

    public Double getHillTpSd() {
        return hillTpSd;
    }

    public void setHillTpSd(Double hillTpSd) {
        this.hillTpSd = hillTpSd;
    }

    public Double getHillGa() {
        return hillGa;
    }

    public void setHillGa(Double hillGa) {
        this.hillGa = hillGa;
    }

    public Double getHillGaSd() {
        return hillGaSd;
    }

    public void setHillGaSd(Double hillGaSd) {
        this.hillGaSd = hillGaSd;
    }

    public Double getHillGw() {
        return hillGw;
    }

    public void setHillGw(Double hillGw) {
        this.hillGw = hillGw;
    }

    public Double getHillGwSd() {
        return hillGwSd;
    }

    public void setHillGwSd(Double hillGwSd) {
        this.hillGwSd = hillGwSd;
    }

    public Double getHillEr() {
        return hillEr;
    }

    public void setHillEr(Double hillEr) {
        this.hillEr = hillEr;
    }

    public Double getHillErSd() {
        return hillErSd;
    }

    public void setHillErSd(Double hillErSd) {
        this.hillErSd = hillErSd;
    }

    public Double getHillAic() {
        return hillAic;
    }

    public void setHillAic(Double hillAic) {
        this.hillAic = hillAic;
    }

    public Double getHillRmse() {
        return hillRmse;
    }

    public void setHillRmse(Double hillRmse) {
        this.hillRmse = hillRmse;
    }

    public Double getHillProb() {
        return hillProb;
    }

    public void setHillProb(Double hillProb) {
        this.hillProb = hillProb;
    }

    public Double getGnlsTp() {
        return gnlsTp;
    }

    public void setGnlsTp(Double gnlsTp) {
        this.gnlsTp = gnlsTp;
    }

    public Double getGnlsLw() {
        return gnlsLw;
    }

    public void setGnlsLw(Double gnlsLw) {
        this.gnlsLw = gnlsLw;
    }

    public Double getGnlsLa() {
        return gnlsLa;
    }

    public void setGnlsLa(Double gnlsLa) {
        this.gnlsLa = gnlsLa;
    }

    public Double getGnlsLwSd() {
        return gnlsLwSd;
    }

    public void setGnlsLwSd(Double gnlsLwSd) {
        this.gnlsLwSd = gnlsLwSd;
    }

    public Double getGnlsLaSd() {
        return gnlsLaSd;
    }

    public void setGnlsLaSd(Double gnlsLaSd) {
        this.gnlsLaSd = gnlsLaSd;
    }

    public Double getGnlsTpSd() {
        return gnlsTpSd;
    }

    public void setGnlsTpSd(Double gnlsTpSd) {
        this.gnlsTpSd = gnlsTpSd;
    }

    public Double getGnlsGa() {
        return gnlsGa;
    }

    public void setGnlsGa(Double gnlsGa) {
        this.gnlsGa = gnlsGa;
    }

    public Double getGnlsGaSd() {
        return gnlsGaSd;
    }

    public void setGnlsGaSd(Double gnlsGaSd) {
        this.gnlsGaSd = gnlsGaSd;
    }

    public Double getGnlsGw() {
        return gnlsGw;
    }

    public void setGnlsGw(Double gnlsGw) {
        this.gnlsGw = gnlsGw;
    }

    public Double getGnlsGwSd() {
        return gnlsGwSd;
    }

    public void setGnlsGwSd(Double gnlsGwSd) {
        this.gnlsGwSd = gnlsGwSd;
    }

    public Double getGnlsEr() {
        return gnlsEr;
    }

    public void setGnlsEr(Double gnlsEr) {
        this.gnlsEr = gnlsEr;
    }

    public Double getGnlsErSd() {
        return gnlsErSd;
    }

    public void setGnlsErSd(Double gnlsErSd) {
        this.gnlsErSd = gnlsErSd;
    }

    public Double getGnlsAic() {
        return gnlsAic;
    }

    public void setGnlsAic(Double gnlsAic) {
        this.gnlsAic = gnlsAic;
    }

    public Double getGnlsRmse() {
        return gnlsRmse;
    }

    public void setGnlsRmse(Double gnlsRmse) {
        this.gnlsRmse = gnlsRmse;
    }

    public Double getGnlsProb() {
        return gnlsProb;
    }

    public void setGnlsProb(Double gnlsProb) {
        this.gnlsProb = gnlsProb;
    }

    public Long getNconc() {
        return nconc;
    }

    public void setNconc(Long nconc) {
        this.nconc = nconc;
    }

    public Long getNpts() {
        return npts;
    }

    public void setNpts(Long npts) {
        this.npts = npts;
    }

    public Double getNrep() {
        return nrep;
    }

    public void setNrep(Double nrep) {
        this.nrep = nrep;
    }

    public Long getNmedGtbl() {
        return nmedGtbl;
    }

    public void setNmedGtbl(Long nmedGtbl) {
        this.nmedGtbl = nmedGtbl;
    }

    public Long getTmpi() {
        return tmpi;
    }

    public void setTmpi(Long tmpi) {
        this.tmpi = tmpi;
    }

    public Long getMc4MthdId() {
        return mc4MthdId;
    }

    public void setMc4MthdId(Long mc4MthdId) {
        this.mc4MthdId = mc4MthdId;
    }

    public Long getExecOrdr() {
        return execOrdr;
    }

    public void setExecOrdr(Long execOrdr) {
        this.execOrdr = execOrdr;
    }

    public String getMc4Mthd() {
        return mc4Mthd;
    }

    public void setMc4Mthd(String mc4Mthd) {
        this.mc4Mthd = mc4Mthd;
    }

    public String getMc4MethodDescription() {
        return mc4MethodDescription;
    }

    public void setMc4MethodDescription(String mc4MethodDescription) {
        this.mc4MethodDescription = mc4MethodDescription;
    }

    public Integer getTotalChemicalCnt() {
        return totalChemicalCnt;
    }

    public void setTotalChemicalCnt(Integer totalChemicalCnt) {
        this.totalChemicalCnt = totalChemicalCnt;
    }

    public Integer getActiveChemicalCnt() {
        return activeChemicalCnt;
    }

    public void setActiveChemicalCnt(Integer activeChemicalCnt) {
        this.activeChemicalCnt = activeChemicalCnt;
    }

    public Integer getMc4Chid() {
        return mc4Chid;
    }

    public void setMc4Chid(Integer mc4Chid) {
        this.mc4Chid = mc4Chid;
    }

    public String getDtxsid() {
        return dtxsid;
    }

    public void setDtxsid(String dtxsid) {
        this.dtxsid = dtxsid;
    }

    public String getLogcAgg() {
        return logcAgg;
    }

    public void setLogcAgg(String logcAgg) {
        this.logcAgg = logcAgg;
    }

    public String getRespAgg() {
        return respAgg;
    }

    public void setRespAgg(String respAgg) {
        this.respAgg = respAgg;
    }

    public Double getPvalAgg() {
        return pvalAgg;
    }

    public void setPvalAgg(Double pvalAgg) {
        this.pvalAgg = pvalAgg;
    }

    public Double getBvalAgg() {
        return bvalAgg;
    }

    public void setBvalAgg(Double bvalAgg) {
        this.bvalAgg = bvalAgg;
    }

    public String getMc6FlagAgg() {
        return mc6FlagAgg;
    }

    public void setMc6FlagAgg(String mc6FlagAgg) {
        this.mc6FlagAgg = mc6FlagAgg;
    }

    public Short getSourceChidRep() {
        return sourceChidRep;
    }

    public void setSourceChidRep(Short sourceChidRep) {
        this.sourceChidRep = sourceChidRep;
    }

    public String getModl() {
        return modl;
    }

    public void setModl(String modl) {
        this.modl = modl;
    }

    public Short getHitc() {
        return hitc;
    }

    public void setHitc(Short hitc) {
        this.hitc = hitc;
    }

    public Double getCoff() {
        return coff;
    }

    public void setCoff(Double coff) {
        this.coff = coff;
    }

    public Double getActp() {
        return actp;
    }

    public void setActp(Double actp) {
        this.actp = actp;
    }

    public Double getModlEr() {
        return modlEr;
    }

    public void setModlEr(Double modlEr) {
        this.modlEr = modlEr;
    }

    public Double getModlTp() {
        return modlTp;
    }

    public void setModlTp(Double modlTp) {
        this.modlTp = modlTp;
    }

    public Double getModlGa() {
        return modlGa;
    }

    public void setModlGa(Double modlGa) {
        this.modlGa = modlGa;
    }

    public Double getModlGw() {
        return modlGw;
    }

    public void setModlGw(Double modlGw) {
        this.modlGw = modlGw;
    }

    public Double getModlLa() {
        return modlLa;
    }

    public void setModlLa(Double modlLa) {
        this.modlLa = modlLa;
    }

    public Double getModlLw() {
        return modlLw;
    }

    public void setModlLw(Double modlLw) {
        this.modlLw = modlLw;
    }

    public Double getModlProb() {
        return modlProb;
    }

    public void setModlProb(Double modlProb) {
        this.modlProb = modlProb;
    }

    public Double getModlRmse() {
        return modlRmse;
    }

    public void setModlRmse(Double modlRmse) {
        this.modlRmse = modlRmse;
    }

    public Double getModlAcc() {
        return modlAcc;
    }

    public void setModlAcc(Double modlAcc) {
        this.modlAcc = modlAcc;
    }

    public Double getModlAcb() {
        return modlAcb;
    }

    public void setModlAcb(Double modlAcb) {
        this.modlAcb = modlAcb;
    }

    public Double getModlAc10() {
        return modlAc10;
    }

    public void setModlAc10(Double modlAc10) {
        this.modlAc10 = modlAc10;
    }

    public Short getModelType() {
        return modelType;
    }

    public void setModelType(Short modelType) {
        this.modelType = modelType;
    }

    public Long getFitc() {
        return fitc;
    }

    public void setFitc(Long fitc) {
        this.fitc = fitc;
    }

    public Long getParentFitc() {
        return parentFitc;
    }

    public void setParentFitc(Long parentFitc) {
        this.parentFitc = parentFitc;
    }

    public String getFitCatgName() {
        return fitCatgName;
    }

    public void setFitCatgName(String fitCatgName) {
        this.fitCatgName = fitCatgName;
    }

    public Double getXloc() {
        return xloc;
    }

    public void setXloc(Double xloc) {
        this.xloc = xloc;
    }

    public Double getYloc() {
        return yloc;
    }

    public void setYloc(Double yloc) {
        this.yloc = yloc;
    }

    public String getAssayComponentEndpNm() {
        return assayComponentEndpNm;
    }

    public void setAssayComponentEndpNm(String assayComponentEndpNm) {
        this.assayComponentEndpNm = assayComponentEndpNm;
    }

    public Short getExportReadyInd() {
        return exportReadyInd;
    }

    public void setExportReadyInd(Short exportReadyInd) {
        this.exportReadyInd = exportReadyInd;
    }

    public Short getInternalReadyInd() {
        return internalReadyInd;
    }

    public void setInternalReadyInd(Short internalReadyInd) {
        this.internalReadyInd = internalReadyInd;
    }

    public String getAssayComponentEndpDesc() {
        return assayComponentEndpDesc;
    }

    public void setAssayComponentEndpDesc(String assayComponentEndpDesc) {
        this.assayComponentEndpDesc = assayComponentEndpDesc;
    }

    public String getAssayFunctionTypCd() {
        return assayFunctionTypCd;
    }

    public void setAssayFunctionTypCd(String assayFunctionTypCd) {
        this.assayFunctionTypCd = assayFunctionTypCd;
    }

    public String getNormalizedDataTypCd() {
        return normalizedDataTypCd;
    }

    public void setNormalizedDataTypCd(String normalizedDataTypCd) {
        this.normalizedDataTypCd = normalizedDataTypCd;
    }

    public String getAnalysisDirectionCd() {
        return analysisDirectionCd;
    }

    public void setAnalysisDirectionCd(String analysisDirectionCd) {
        this.analysisDirectionCd = analysisDirectionCd;
    }

    public Short getBurstAssayInd() {
        return burstAssayInd;
    }

    public void setBurstAssayInd(Short burstAssayInd) {
        this.burstAssayInd = burstAssayInd;
    }

    public String getPositiveControlKey() {
        return positiveControlKey;
    }

    public void setPositiveControlKey(String positiveControlKey) {
        this.positiveControlKey = positiveControlKey;
    }

    public String getSignalDirectionCd() {
        return signalDirectionCd;
    }

    public void setSignalDirectionCd(String signalDirectionCd) {
        this.signalDirectionCd = signalDirectionCd;
    }

    public String getIntendedTgtTypCd() {
        return intendedTgtTypCd;
    }

    public void setIntendedTgtTypCd(String intendedTgtTypCd) {
        this.intendedTgtTypCd = intendedTgtTypCd;
    }

    public String getIntendedTgtSubTypCd() {
        return intendedTgtSubTypCd;
    }

    public void setIntendedTgtSubTypCd(String intendedTgtSubTypCd) {
        this.intendedTgtSubTypCd = intendedTgtSubTypCd;
    }

    public String getIntendedTgtFamTx() {
        return intendedTgtFamTx;
    }

    public void setIntendedTgtFamTx(String intendedTgtFamTx) {
        this.intendedTgtFamTx = intendedTgtFamTx;
    }

    public String getIntendedTgtFamSubTx() {
        return intendedTgtFamSubTx;
    }

    public void setIntendedTgtFamSubTx(String intendedTgtFamSubTx) {
        this.intendedTgtFamSubTx = intendedTgtFamSubTx;
    }

    public Short getFitAllInd() {
        return fitAllInd;
    }

    public void setFitAllInd(Short fitAllInd) {
        this.fitAllInd = fitAllInd;
    }

    public Short getCellViabilityAssayInd() {
        return cellViabilityAssayInd;
    }

    public void setCellViabilityAssayInd(Short cellViabilityAssayInd) {
        this.cellViabilityAssayInd = cellViabilityAssayInd;
    }

    public Short getDataUsabilityInd() {
        return dataUsabilityInd;
    }

    public void setDataUsabilityInd(Short dataUsabilityInd) {
        this.dataUsabilityInd = dataUsabilityInd;
    }

    public String getAssayTtl() {
        return assayTtl;
    }

    public void setAssayTtl(String assayTtl) {
        this.assayTtl = assayTtl;
    }

    public String getBiologicalResponseTx() {
        return biologicalResponseTx;
    }

    public void setBiologicalResponseTx(String biologicalResponseTx) {
        this.biologicalResponseTx = biologicalResponseTx;
    }

    public String getAnalyticalDesc() {
        return analyticalDesc;
    }

    public void setAnalyticalDesc(String analyticalDesc) {
        this.analyticalDesc = analyticalDesc;
    }

    public Integer getSourceTgtId() {
        return sourceTgtId;
    }

    public void setSourceTgtId(Integer sourceTgtId) {
        this.sourceTgtId = sourceTgtId;
    }

    public String getIntendedTargetSrc() {
        return intendedTargetSrc;
    }

    public void setIntendedTargetSrc(String intendedTargetSrc) {
        this.intendedTargetSrc = intendedTargetSrc;
    }

    public Integer getSourceAssayListId() {
        return sourceAssayListId;
    }

    public void setSourceAssayListId(Integer sourceAssayListId) {
        this.sourceAssayListId = sourceAssayListId;
    }

    public String getAssayListNm() {
        return assayListNm;
    }

    public void setAssayListNm(String assayListNm) {
        this.assayListNm = assayListNm;
    }

    public String getAssayListDesc() {
        return assayListDesc;
    }

    public void setAssayListDesc(String assayListDesc) {
        this.assayListDesc = assayListDesc;
    }

    public Long getM5id() {
        return m5id;
    }

    public void setM5id(Long m5id) {
        this.m5id = m5id;
    }

    public Short getMc5ChidRep() {
        return mc5ChidRep;
    }

    public void setMc5ChidRep(Short mc5ChidRep) {
        this.mc5ChidRep = mc5ChidRep;
    }

    public Short getMc5Hitc() {
        return mc5Hitc;
    }

    public void setMc5Hitc(Short mc5Hitc) {
        this.mc5Hitc = mc5Hitc;
    }

    public Double getMc5Coff() {
        return mc5Coff;
    }

    public void setMc5Coff(Double mc5Coff) {
        this.mc5Coff = mc5Coff;
    }

    public Long getMc5Fitc() {
        return mc5Fitc;
    }

    public void setMc5Fitc(Long mc5Fitc) {
        this.mc5Fitc = mc5Fitc;
    }

    public String getMc5Modl() {
        return mc5Modl;
    }

    public void setMc5Modl(String mc5Modl) {
        this.mc5Modl = mc5Modl;
    }

    public Double getMc5Actp() {
        return mc5Actp;
    }

    public void setMc5Actp(Double mc5Actp) {
        this.mc5Actp = mc5Actp;
    }

    public Double getMc5ModlError() {
        return mc5ModlError;
    }

    public void setMc5ModlError(Double mc5ModlError) {
        this.mc5ModlError = mc5ModlError;
    }

    public Double getMc5ModlTp() {
        return mc5ModlTp;
    }

    public void setMc5ModlTp(Double mc5ModlTp) {
        this.mc5ModlTp = mc5ModlTp;
    }

    public Double getMc5ModlGa() {
        return mc5ModlGa;
    }

    public void setMc5ModlGa(Double mc5ModlGa) {
        this.mc5ModlGa = mc5ModlGa;
    }

    public Double getMc5ModlGw() {
        return mc5ModlGw;
    }

    public void setMc5ModlGw(Double mc5ModlGw) {
        this.mc5ModlGw = mc5ModlGw;
    }

    public Double getMc5ModlLa() {
        return mc5ModlLa;
    }

    public void setMc5ModlLa(Double mc5ModlLa) {
        this.mc5ModlLa = mc5ModlLa;
    }

    public Double getMc5ModlLw() {
        return mc5ModlLw;
    }

    public void setMc5ModlLw(Double mc5ModlLw) {
        this.mc5ModlLw = mc5ModlLw;
    }

    public Double getMc5ModlProb() {
        return mc5ModlProb;
    }

    public void setMc5ModlProb(Double mc5ModlProb) {
        this.mc5ModlProb = mc5ModlProb;
    }

    public Double getMc5ModlRmse() {
        return mc5ModlRmse;
    }

    public void setMc5ModlRmse(Double mc5ModlRmse) {
        this.mc5ModlRmse = mc5ModlRmse;
    }

    public Double getMc5MdlAcc() {
        return mc5MdlAcc;
    }

    public void setMc5MdlAcc(Double mc5MdlAcc) {
        this.mc5MdlAcc = mc5MdlAcc;
    }

    public Double getMc5ModlAcb() {
        return mc5ModlAcb;
    }

    public void setMc5ModlAcb(Double mc5ModlAcb) {
        this.mc5ModlAcb = mc5ModlAcb;
    }

    public Double getMc5ModlAc10() {
        return mc5ModlAc10;
    }

    public void setMc5ModlAc10(Double mc5ModlAc10) {
        this.mc5ModlAc10 = mc5ModlAc10;
    }

    public Double getStkc() {
        return stkc;
    }

    public void setStkc(Double stkc) {
        this.stkc = stkc;
    }

    public Integer getAeid() {
        return aeid;
    }

    public void setAeid(Integer aeid) {
        this.aeid = aeid;
    }

    public String getAssayName() {
        return assayName;
    }

    public void setAssayName(String assayName) {
        this.assayName = assayName;
    }

    public String getAssayComponentName() {
        return assayComponentName;
    }

    public void setAssayComponentName(String assayComponentName) {
        this.assayComponentName = assayComponentName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    public String getSourceLongDescription() {
        return sourceLongDescription;
    }

    public void setSourceLongDescription(String sourceLongDescription) {
        this.sourceLongDescription = sourceLongDescription;
    }

    public String getSourceLongName() {
        return sourceLongName;
    }

    public void setSourceLongName(String sourceLongName) {
        this.sourceLongName = sourceLongName;
    }

    public String getAssayFormatType() {
        return assayFormatType;
    }

    public void setAssayFormatType(String assayFormatType) {
        this.assayFormatType = assayFormatType;
    }

    public String getBiologicalProcessTarget() {
        return biologicalProcessTarget;
    }

    public void setBiologicalProcessTarget(String biologicalProcessTarget) {
        this.biologicalProcessTarget = biologicalProcessTarget;
    }

    public String getDetectionTecCd() {
        return detectionTecCd;
    }

    public void setDetectionTecCd(String detectionTecCd) {
        this.detectionTecCd = detectionTecCd;
    }

    public String getTissue() {
        return tissue;
    }

    public void setTissue(String tissue) {
        this.tissue = tissue;
    }

    public String getAssayDescription() {
        return assayDescription;
    }

    public void setAssayDescription(String assayDescription) {
        this.assayDescription = assayDescription;
    }

    public String getGeneInfo() {
        return geneInfo;
    }

    public void setGeneInfo(String geneInfo) {
        this.geneInfo = geneInfo;
    }

    public String getExtUniprotAccesnNum() {
        return extUniprotAccesnNum;
    }

    public void setExtUniprotAccesnNum(String extUniprotAccesnNum) {
        this.extUniprotAccesnNum = extUniprotAccesnNum;
    }

    public Instant getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Instant createdDt) {
        this.createdDt = createdDt;
    }

}