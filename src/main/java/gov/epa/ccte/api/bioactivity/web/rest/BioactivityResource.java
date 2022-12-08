package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.domain.Bioactivity;
import gov.epa.ccte.api.bioactivity.repository.BioactivityRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

/**
 * REST controller for getting the {@link gov.epa.ccte.api.bioactivity.domain.Bioactivity}s.
 */
@Slf4j
@RestController
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
    @RequestMapping(value = "bioactivity/search/by-dtxsid/{dtxsid}", method = RequestMethod.GET)
    public @ResponseBody
    List<Bioactivity> bioactivityByDtxsid(@PathVariable("dtxsid") String dtxsid) throws IOException {

        log.debug("dtxsid = {}", dtxsid);

        return repository.findByDtxsid(dtxsid);
    }

    /**
     * {@code GET  /bioactivity/by-aeid/:aeid} : get list of bioactivity for the "aeid".
     *
     * @param aeid the matching aeid of the Bioactivity to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the list of bioactivity}.
     */
    @RequestMapping(value = "bioactivity/search/by-aeid/{aeid}", method = RequestMethod.GET)
    public @ResponseBody
    List<Bioactivity> bioactivityByAeid(@PathVariable("aeid") Integer aeid) throws IOException {

        log.debug("aeid = {}", aeid);

        return repository.findByAeid(aeid);
    }

}
