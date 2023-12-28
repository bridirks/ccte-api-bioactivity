package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.domain.AssayListCount;
import gov.epa.ccte.api.bioactivity.projection.data.BioactivityDataAll;
import gov.epa.ccte.api.bioactivity.projection.data.BioactivityDataBase;
import gov.epa.ccte.api.bioactivity.repository.AssayListCountRepository;
import gov.epa.ccte.api.bioactivity.repository.BioactivityDataRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for getting the {@link gov.epa.ccte.api.bioactivity.domain.BioactivityData}s.
 */
@Tag(name = "Bioactivity Data Resource",
        description = "API endpoints for collecting bioactivity data.")
@SecurityRequirement(name = "api_key")
@Slf4j
@RestController
public class DataResource {

    private final BioactivityDataRepository dataRepository;
    private final AssayListCountRepository countRepository;
    public DataResource(BioactivityDataRepository dataRepository, AssayListCountRepository countRepository) {
        this.dataRepository = dataRepository;
        this.countRepository = countRepository;
    }

    /**
     * {@code GET  /bioactivity/data/by-dtxsid/:dtxsid} : get bioactivity data for the "dtxsid".
     *
     * @param dtxsid the matching dtxsid of the assays to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the bioactivity data.
     */
    @Operation(summary = "Get data by dtxsid")
    @RequestMapping(value = "bioactivity/data/search/by-dtxsid/{dtxsid}", method = RequestMethod.GET)
    public @ResponseBody
    List dataByDtxsid(@Parameter(required = true, description = "DSSTox Substance Identifier", example = "DTXSID0021125") @PathVariable("dtxsid") String dtxsid) {

        log.debug("dtxsid = {}", dtxsid);

        List<BioactivityDataAll> data = dataRepository.findByDtxsid(dtxsid, BioactivityDataAll.class);

        return data;
    }

    /**
     * {@code GET  /bioactivity/data/by-aeid/:aeid} : get bioactivity data for the "aeid".
     *
     * @param aeid the matching aeid of the assays to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the bioactivity data.
     */
    @Operation(summary = "Get data by aeid")
    @RequestMapping(value = "bioactivity/data/search/by-aeid/{aeid}", method = RequestMethod.GET)
    public @ResponseBody
    List dataByAeid(@Parameter(required = true, description = "Numeric assay endpoint identifier", example = "1386") @PathVariable("aeid") Integer aeid) {

        log.debug("aeid = {}", aeid);

        List<BioactivityDataAll> data = dataRepository.findByAeid(aeid, BioactivityDataAll.class);

        return data;
    }

    /**
     * {@code GET  /bioactivity/data/by-spid/:spid} : get bioactivity data for the "spid".
     *
     * @param spid the matching spid of the assays to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the bioactivity data.
     */
    @Operation(summary = "Get data by spid")
    @RequestMapping(value = "bioactivity/data/search/by-spid/{spid}", method = RequestMethod.GET)
    public @ResponseBody
    List dataBySpid(@Parameter(required = true, description = "identifier", example = "spid") @PathVariable("spid") String spid) {

        log.debug("spid = {}", spid);

        List<BioactivityDataAll> data = dataRepository.findBySpid(spid, BioactivityDataAll.class);

        return data;
    }

    /**
     * {@code GET  /bioactivity/data/by-m4id/:m4id} : get bioactivity data for the "m4id".
     *
     * @param m4id the matching m4id of the assays to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the bioactivity data.
     */
    @Operation(summary = "Get data by m4id")
    @RequestMapping(value = "bioactivity/data/search/by-m4id/{m4id}", method = RequestMethod.GET)
    public @ResponseBody
    BioactivityDataBase dataByM4Id(@Parameter(required = true, description = "Numeric data identifier", example = "392006") @PathVariable("m4id") Integer m4id) {

        log.debug("m4id = {}", m4id);

        BioactivityDataAll data = dataRepository.findByM4id(m4id, BioactivityDataAll.class);

        return data;
    }

    /**
     * {@code GET  /bioactivity/data/summary/search/by-aeid/:aeid} : get bioactivity summary for the "aeid".
     *
     * @param aeid the matching aeid of the assays to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the Summary data.
     */
    @Operation(summary = "Get summary by aeid")
    @RequestMapping(value = "/bioactivity/data/summary/search/by-aeid/{aeid}", method = RequestMethod.GET)
    public @ResponseBody
    AssayListCount summaryByAeid(@Parameter(required = true, description = "Numeric assay endpoint identifier", example = "1386") @PathVariable("aeid") Integer aeid) {

        log.debug("m4id = {}", aeid);

         return countRepository.findByAeid(aeid);
    }


}
