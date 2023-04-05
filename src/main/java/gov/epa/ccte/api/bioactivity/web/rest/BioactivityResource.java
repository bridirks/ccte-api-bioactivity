package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.projection.BioactivityAll;
import gov.epa.ccte.api.bioactivity.repository.BioactivityRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * REST controller for getting the {@link gov.epa.ccte.api.bioactivity.domain.Bioactivity}s.
 */
@Tag(name = "Bioactivity Resource",
        description = "API endpoints for collecting Bioactivity data.")
@SecurityRequirement(name = "api_key")
@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class BioactivityResource {

    final private BioactivityRepository repository;

    public BioactivityResource(BioactivityRepository repository) {
        this.repository = repository;
    }

    /**
     * {@code GET  /bioactivity/by-dtxsid/:dtxsid} : get list of bioactivity for the "dtxsid".
     *
     * @param dtxsid the matching dtxsid of the Bioactivity to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the list of chemicalDetail}.
     */
    @Operation(summary = "Get bioactivity data by dtxsid")
    @RequestMapping(value = "bioactivity/search/by-dtxsid/{dtxsid}", method = RequestMethod.GET)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(mediaType = "application/json",
                    schema = @Schema(oneOf = {BioactivityAll.class})))
    })
    public @ResponseBody
    List<BioactivityAll> bioactivityByDtxsid(@Parameter(required = true, description = "DSSTox Substance Identifier", example = "DTXSID0021125") @PathVariable("dtxsid") String dtxsid) {

        log.debug("dtxsid = {}", dtxsid);
        List<BioactivityAll> data = repository.findByDtxsid(dtxsid, BioactivityAll.class);

        return data;
    }

    /**
     * {@code GET  /bioactivity/by-aeid/:aeid} : get list of bioactivity for the "aeid".
     *
     * @param aeid the matching aeid of the Bioactivity to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the list of bioactivity}.
     */
    @Operation(summary = "Get bioactivity data by aeid")
    @RequestMapping(value = "bioactivity/search/by-aeid/{aeid}", method = RequestMethod.GET)
    public @ResponseBody
    List<BioactivityAll> bioactivityByAeid(@Parameter(required = true, description = "Numeric assay endpoint identifier", example = "1386") @PathVariable("aeid") Integer aeid) {

        log.debug("aeid = {}", aeid);

        List<BioactivityAll> data = repository.findByAeid(aeid, BioactivityAll.class);

        return data;
    }

}
