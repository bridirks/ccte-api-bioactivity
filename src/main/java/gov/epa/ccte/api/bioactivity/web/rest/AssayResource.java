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

/**
 * REST controller for getting the {@link AssayAnnotation}s.
 */
@Tag(name = "Bioactivity Assay Resource",
        description = "API endpoints for collecting Assay annotations.")
@SecurityRequirement(name = "api_key")
@Slf4j
@RestController
public class AssayResource {
    final private AssayAnnotationRepository annotationRepository;

    public AssayResource(AssayAnnotationRepository annotationRepository) {
        this.annotationRepository = annotationRepository;
    }

    /**
     * {@code GET  /bioactivity/assay/by-aeid/:aeid} : get assay annotation for the "aeid".
     *
     * @param aeid the matching aeid of the assays to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the asssay annotation.
     */
    @Operation(summary = "Get annotation by aeid")
    @RequestMapping(value = "bioactivity/assay/search/by-aeid/{aeid}", method = RequestMethod.GET)
    public @ResponseBody
    AssayBase assayByAeid(@Parameter(required = true, description = "Numeric assay endpoint identifier", example = "1386") @PathVariable("aeid") Integer aeid) {

        log.debug("aeid = {}", aeid);

        AssayAll data = annotationRepository.findByAeid(aeid, AssayAll.class);

        return data;
    }

}
