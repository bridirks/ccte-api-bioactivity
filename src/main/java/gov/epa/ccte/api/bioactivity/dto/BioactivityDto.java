package gov.epa.ccte.api.bioactivity.dto;

import lombok.Data;

import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link gov.epa.ccte.api.bioactivity.domain.Bioactivity} entity
 */
@Data
public class BioactivityDto implements Serializable {
    private final Long id;
    private final Long num;
    private final Long m4id;
    @Size(max = 50)
    private final String sampleId;
    private final Double mc4Bmad;
    private final Double mc4RespMax;
    private final Double respMin;
    private final Double maxMeanVal;
    private final Double maxMeanConc;
    private final Double maxMedVal;
    private final Double maxMedConc;
    private final Double logcMax;
    private final Double logcMin;
    private final Boolean cnstFlag;
    private final Boolean hillFlag;
    private final Boolean hcovFlag;
    private final Boolean gnlsFlag;
    private final Boolean gcovFlag;
    private final Double mc4CnstError;
    private final Double mc4CnstAic;
    private final Double cnstRmse;
    private final Double cnstProb;
    private final Double hillTp;
    private final Double hillTpSd;
    private final Double hillGa;
    private final Double hillGaSd;
    private final Double hillGw;
    private final Double hillGwSd;
    private final Double hillEr;
    private final Double hillErSd;
    private final Double hillAic;
    private final Double hillRmse;
    private final Double hillProb;
    private final Double gnlsTp;
    private final Double gnlsLw;
    private final Double gnlsLa;
    private final Double gnlsLwSd;
    private final Double gnlsLaSd;
    private final Double gnlsTpSd;
    private final Double gnlsGa;
    private final Double gnlsGaSd;
    private final Double gnlsGw;
    private final Double gnlsGwSd;
    private final Double gnlsEr;
    private final Double gnlsErSd;
    private final Double gnlsAic;
    private final Double gnlsRmse;
    private final Double gnlsProb;
    private final Long nconc;
    private final Long npts;
    private final Double nrep;
    private final Long nmedGtbl;
    private final Long tmpi;
    private final Long mc4MthdId;
    private final Long execOrdr;
    @Size(max = 50)
    private final String mc4Mthd;
    @Size(max = 255)
    private final String mc4MethodDescription;
    private final Integer totalChemicalCnt;
    private final Integer activeChemicalCnt;
    private final Integer mc4Chid;
    @Size(max = 45)
    private final String dtxsid;
    private final String logcAgg;
    private final String respAgg;
    private final Double pvalAgg;
    private final Double bvalAgg;
    private final String mc6FlagAgg;
    private final Short sourceChidRep;
    @Size(max = 4)
    private final String modl;
    private final Short hitc;
    private final Double coff;
    private final Double actp;
    private final Double modlEr;
    private final Double modlTp;
    private final Double modlGa;
    private final Double modlGw;
    private final Double modlLa;
    private final Double modlLw;
    private final Double modlProb;
    private final Double modlRmse;
    private final Double modlAcc;
    private final Double modlAcb;
    private final Double modlAc10;
    private final Short modelType;
    private final Long fitc;
    private final Long parentFitc;
    @Size(max = 30)
    private final String fitCatgName;
    private final Double xloc;
    private final Double yloc;
    @Size(max = 255)
    private final String assayComponentEndpNm;
    private final Short exportReadyInd;
    private final Short internalReadyInd;
    private final String assayComponentEndpDesc;
    @Size(max = 50)
    private final String assayFunctionTypCd;
    @Size(max = 50)
    private final String normalizedDataTypCd;
    @Size(max = 20)
    private final String analysisDirectionCd;
    private final Short burstAssayInd;
    @Size(max = 100)
    private final String positiveControlKey;
    @Size(max = 20)
    private final String signalDirectionCd;
    @Size(max = 50)
    private final String intendedTgtTypCd;
    @Size(max = 100)
    private final String intendedTgtSubTypCd;
    @Size(max = 50)
    private final String intendedTgtFamTx;
    @Size(max = 50)
    private final String intendedTgtFamSubTx;
    private final Short fitAllInd;
    private final Short cellViabilityAssayInd;
    private final Short dataUsabilityInd;
    @Size(max = 1024)
    private final String assayTtl;
    private final String biologicalResponseTx;
    private final String analyticalDesc;
    private final Integer sourceTgtId;
    @Size(max = 50)
    private final String intendedTargetSrc;
    private final Integer sourceAssayListId;
    @Size(max = 64)
    private final String assayListNm;
    @Size(max = 2048)
    private final String assayListDesc;
    private final Long m5id;
    private final Short mc5ChidRep;
    private final Short mc5Hitc;
    private final Double mc5Coff;
    private final Long mc5Fitc;
    @Size(max = 4)
    private final String mc5Modl;
    private final Double mc5Actp;
    private final Double mc5ModlError;
    private final Double mc5ModlTp;
    private final Double mc5ModlGa;
    private final Double mc5ModlGw;
    private final Double mc5ModlLa;
    private final Double mc5ModlLw;
    private final Double mc5ModlProb;
    private final Double mc5ModlRmse;
    private final Double mc5MdlAcc;
    private final Double mc5ModlAcb;
    private final Double mc5ModlAc10;
    private final Double stkc;
    private final Integer aeid;
    @Size(max = 255)
    private final String assayName;
    @Size(max = 255)
    private final String assayComponentName;
    @Size(max = 255)
    private final String source;
    @Size(max = 255)
    private final String sourceDescription;
    @Size(max = 255)
    private final String sourceLongDescription;
    @Size(max = 255)
    private final String sourceLongName;
    @Size(max = 255)
    private final String assayFormatType;
    @Size(max = 200)
    private final String biologicalProcessTarget;
    @Size(max = 200)
    private final String detectionTecCd;
    @Size(max = 255)
    private final String tissue;
    private final String assayDescription;
    private final String geneInfo;
    @Size(max = 32)
    private final String extUniprotAccesnNum;
    private final Instant createdDt;
}