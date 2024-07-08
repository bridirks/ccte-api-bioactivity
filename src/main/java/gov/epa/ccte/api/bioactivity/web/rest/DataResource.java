package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.domain.AssayListCount;
import gov.epa.ccte.api.bioactivity.projection.data.BioactivityDataAll;
import gov.epa.ccte.api.bioactivity.projection.data.BioactivityDataBase;
import gov.epa.ccte.api.bioactivity.repository.AssayListCountRepository;
import gov.epa.ccte.api.bioactivity.repository.BioactivityDataRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
public class DataResource implements DataApi {

    private final BioactivityDataRepository dataRepository;
    private final AssayListCountRepository countRepository;
    public DataResource(BioactivityDataRepository dataRepository, AssayListCountRepository countRepository) {
        this.dataRepository = dataRepository;
        this.countRepository = countRepository;
    }

    @Override
    public @ResponseBody
    List dataByDtxsid(String dtxsid) {

        log.debug("dtxsid = {}", dtxsid);

        List<BioactivityDataAll> data = dataRepository.findByDtxsid(dtxsid, BioactivityDataAll.class);

        log.debug("result.size = {}", data.size());

        return data;
    }

    @Override
    public @ResponseBody
    List dataByAeid(Integer aeid) {

        log.debug("aeid = {}", aeid);

        List<BioactivityDataAll> data = dataRepository.findByAeid(aeid, BioactivityDataAll.class);

        log.debug("result.size = {}", data.size());

        return data;
    }

    @Override
    public @ResponseBody
    List dataBySpid(String spid) {

        log.debug("spid = {}", spid);

        List<BioactivityDataAll> data = dataRepository.findBySpid(spid, BioactivityDataAll.class);

        log.debug("result.size = {}", data.size());

        return data;
    }

    @Override
    public @ResponseBody
    BioactivityDataBase dataByM4Id(Integer m4id) {

        log.debug("m4id = {}", m4id);

        BioactivityDataAll data = dataRepository.findByM4id(m4id, BioactivityDataAll.class);

        return data;
    }

    @Override
    public @ResponseBody
    AssayListCount summaryByAeid(Integer aeid) {

        log.debug("m4id = {}", aeid);

         return countRepository.findByAeid(aeid);
    }

}
