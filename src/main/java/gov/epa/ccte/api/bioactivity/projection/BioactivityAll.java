package gov.epa.ccte.api.bioactivity.projection;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * A Projection for the {@link gov.epa.ccte.api.bioactivity.domain.Bioactivity} entity
 */
public interface BioactivityAll {
    Long getId();

    Long getNum();

    Long getM4id();

    String getSampleId();

    Double getMc4Bmad();

    Double getMc4RespMax();

    Double getRespMin();

    Double getMaxMeanVal();

    Double getMaxMeanConc();

    Double getMaxMedVal();

    Double getMaxMedConc();

    Double getLogcMax();

    Double getLogcMin();

    @JsonIgnore
    Boolean getCnstFlag();

    Boolean isCnstFlag();

    @JsonIgnore
    Boolean getHillFlag();

    Boolean isHillFlag();

    @JsonIgnore
    Boolean getHcovFlag();

    Boolean isHcovFlag();

    @JsonIgnore
    Boolean getGnlsFlag();

    Boolean isGnlsFlag();

    @JsonIgnore
    Boolean getGcovFlag();

    Boolean isGcovFlag();

    Double getMc4CnstError();

    Double getMc4CnstAic();

    Double getCnstRmse();

    Double getCnstProb();

    Double getHillTp();

    Double getHillTpSd();

    Double getHillGa();

    Double getHillGaSd();

    Double getHillGw();

    Double getHillGwSd();

    Double getHillEr();

    Double getHillErSd();

    Double getHillAic();

    Double getHillRmse();

    Double getHillProb();

    Double getGnlsTp();

    Double getGnlsLw();

    Double getGnlsLa();

    Double getGnlsLwSd();

    Double getGnlsLaSd();

    Double getGnlsTpSd();

    Double getGnlsGa();

    Double getGnlsGaSd();

    Double getGnlsGw();

    Double getGnlsGwSd();

    Double getGnlsEr();

    Double getGnlsErSd();

    Double getGnlsAic();

    Double getGnlsRmse();

    Double getGnlsProb();

    Long getNconc();

    Long getNpts();

    Double getNrep();

    Long getNmedGtbl();

    Long getTmpi();

    Long getMc4MthdId();

    Long getExecOrdr();

    String getMc4Mthd();

    String getMc4MethodDescription();

    Integer getTotalChemicalCnt();

    Integer getActiveChemicalCnt();

    Integer getMc4Chid();

    String getDtxsid();

    String getLogcAgg();

    String getRespAgg();

    Double getPvalAgg();

    Double getBvalAgg();

    String getMc6FlagAgg();

    Short getSourceChidRep();

    String getModl();

    Short getHitc();

    Double getCoff();

    Double getActp();

    Double getModlEr();

    Double getModlTp();

    Double getModlGa();

    Double getModlGw();

    Double getModlLa();

    Double getModlLw();

    Double getModlProb();

    Double getModlRmse();

    Double getModlAcc();

    Double getModlAcb();

    Double getModlAc10();

    Short getModelType();

    Long getFitc();

    Long getParentFitc();

    String getFitCatgName();

    Double getXloc();

    Double getYloc();

    String getAssayComponentEndpNm();

    Short getExportReadyInd();

    Short getInternalReadyInd();

    String getAssayComponentEndpDesc();

    String getAssayFunctionTypCd();

    String getNormalizedDataTypCd();

    String getAnalysisDirectionCd();

    Short getBurstAssayInd();

    String getPositiveControlKey();

    String getSignalDirectionCd();

    String getIntendedTgtTypCd();

    String getIntendedTgtSubTypCd();

    String getIntendedTgtFamTx();

    String getIntendedTgtFamSubTx();

    Short getFitAllInd();

    Short getCellViabilityAssayInd();

    Short getDataUsabilityInd();

    String getAssayTtl();

    String getBiologicalResponseTx();

    String getAnalyticalDesc();

    Integer getSourceTgtId();

    String getIntendedTargetSrc();

    Integer getSourceAssayListId();

    String getAssayListNm();

    String getAssayListDesc();

    Long getM5id();

    Short getMc5ChidRep();

    Short getMc5Hitc();

    Double getMc5Coff();

    Long getMc5Fitc();

    String getMc5Modl();

    Double getMc5Actp();

    Double getMc5ModlError();

    Double getMc5ModlTp();

    Double getMc5ModlGa();

    Double getMc5ModlGw();

    Double getMc5ModlLa();

    Double getMc5ModlLw();

    Double getMc5ModlProb();

    Double getMc5ModlRmse();

    Double getMc5MdlAcc();

    Double getMc5ModlAcb();

    Double getMc5ModlAc10();

    Double getStkc();

    Integer getAeid();

    String getAssayName();

    String getAssayComponentName();

    String getSource();

    String getSourceDescription();

    String getSourceLongDescription();

    String getSourceLongName();

    String getAssayFormatType();

    String getBiologicalProcessTarget();

    String getDetectionTecCd();

    String getTissue();

    String getAssayDescription();

    String getGeneInfo();

    String getExtUniprotAccesnNum();
}