package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.domain.Bioactivity;
import gov.epa.ccte.api.bioactivity.dto.BioactivityDto;
import gov.epa.ccte.api.bioactivity.dto.mapper.BioactivityMapper;
import gov.epa.ccte.api.bioactivity.repository.BioactivityRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

/**
 * REST controller for getting the {@link gov.epa.ccte.api.bioactivity.domain.Bioactivity}s.
 */
@Tag(name = "Bioactivity Resource",
        description = "API endpoints for collecting Bioactivity data for specified chemical identifier (DTXSID).")
@SecurityRequirement(name = "api_key")
@Slf4j
@RestController
@CrossOrigin(origins = "*")
public class BioactivityResource {

    final private BioactivityRepository repository;
    final private BioactivityMapper mapper;

    public BioactivityResource(BioactivityRepository repository, BioactivityMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    /**
     * {@code GET  /bioactivity/by-dtxsid/:dtxsid} : get list of bioactivity for the "dtxsid".
     *
     * @param dtxsid the matching dtxsid of the Bioactivity to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the list of chemicalDetail}.
     */
    @Operation(summary = "Get bioactivity data by dtxsid")
    @RequestMapping(value = "bioactivity/search/by-dtxsid/{dtxsid}", method = RequestMethod.GET)
    public @ResponseBody
    List<BioactivityDto> bioactivityByDtxsid(@Parameter(required = true, description = "DSSTox Substance Identifier", example = "DTXSID0021125") @PathVariable("dtxsid") String dtxsid) throws IOException {

        log.debug("dtxsid = {}", dtxsid);
        List<Bioactivity> data = repository.findByDtxsid(dtxsid);

        return data.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
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
    List<BioactivityDto> bioactivityByAeid(@Parameter(required = true, description = "Numeric assay endpoint identifier", example = "1386") @PathVariable("aeid") Integer aeid) throws IOException {

        log.debug("aeid = {}", aeid);

        List<Bioactivity> data = repository.findByAeid(aeid);

        return data.stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

}
