package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.domain.AssayAnnotation;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayAll;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayBase;
import gov.epa.ccte.api.bioactivity.repository.AssayAnnotationRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class AssayResource implements AssayApi {
    final private AssayAnnotationRepository annotationRepository;

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
    public List<AssayAll> allAssays() {
        log.debug("get all assays");

        return annotationRepository.findBy(AssayAll.class);

    }

}
