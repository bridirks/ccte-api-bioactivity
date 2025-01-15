package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.domain.AssayAnnotation;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayAll;
import gov.epa.ccte.api.bioactivity.projection.assay.AssayBase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * REST controller for getting the {@link AssayAnnotation}s.
 */
@Tag(name = "Bioactivity Assay Resource",
        description = "API endpoints for collecting Assay annotations.")
@SecurityRequirement(name = "api_key")
@RequestMapping( value = "bioactivity/assay", produces = MediaType. APPLICATION_JSON_VALUE)
public interface AssayApi {
    /**
     * {@code GET  /bioactivity/assay/by-aeid/:aeid} : get assay annotation for the "aeid".
     *
     * @param aeid the matching aeid of the assays to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the asssay annotation.
     */
    @Operation(summary = "Get annotation by aeid")
    @ApiResponses(value= {
            @ApiResponse(responseCode = "200", description = "OK",  content = @Content( mediaType = "application/json",
                    schema=@Schema(oneOf = {AssayAnnotation.class}))),
    })
    @RequestMapping(value = "/search/by-aeid/{aeid}", method = RequestMethod.GET)
    @ResponseBody
    AssayBase assayByAeid(@Parameter(required = true, description = "Numeric assay endpoint identifier", example = "3032") @PathVariable("aeid") Integer aeid);

    /**
     * {@code GET  /bioactivity/assay/} : get all assays annotation .
     * *
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the array of  asssay annotation.
     */
    @Operation(summary = "Get all assays")
    @ApiResponses(value= {
            @ApiResponse(responseCode = "200", description = "OK",  content = @Content( mediaType = "application/json",
                    schema=@Schema(oneOf = {AssayAnnotation.class}))),
    })
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    List<AssayAll> allAssays();
}
