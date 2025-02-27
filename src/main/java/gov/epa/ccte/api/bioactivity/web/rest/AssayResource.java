package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.projection.assay.AssayAll;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayBase;
import gov.epa.ccte.api.bioactivity.projection.assay.CcdAssayList;
import gov.epa.ccte.api.bioactivity.projection.data.BioactivityDataAll;
import gov.epa.ccte.api.bioactivity.repository.AssayAnnotationRepository;
import gov.epa.ccte.api.bioactivity.web.rest.error.HigherNumberOfRequestsException;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class AssayResource implements AssayApi {
    final private AssayAnnotationRepository annotationRepository;
    
    @Value("200")
    private Integer batchSize;
    
    public AssayResource(AssayAnnotationRepository annotationRepository) {
        this.annotationRepository = annotationRepository;
    }

    @Override
    public AssayBase assayByAeid(Integer aeid) {
        log.debug("aeid = {}", aeid);

        AssayAll data = annotationRepository.findByAeid(aeid, AssayAll.class);

        return data;
    }
    
    @Override
    public @ResponseBody
    List<AssayAll>batchSearchAssayByAeid(String[] aeids) {
        log.debug("bioactiivty data for aeid size = {}", aeids.length);

        if(aeids.length > batchSize)
            throw new HigherNumberOfRequestsException(aeids.length, batchSize);

        List<AssayAll> data = annotationRepository.findByAeidInOrderByAeidAsc(aeids, AssayAll.class);

        return data;
    }

    @Override
    public List<?> allAssays( String projection) {

    	return switch (projection) {
        case "ccd-assay-list" -> annotationRepository.findAssayAnnotations(CcdAssayList.class);
        case "assay-all" -> annotationRepository.findBy(AssayAll.class);
		default -> annotationRepository.findBy(AssayAll.class);
    };  
    
    }

}
