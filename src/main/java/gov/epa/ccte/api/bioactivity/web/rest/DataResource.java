package gov.epa.ccte.api.bioactivity.web.rest;

import gov.epa.ccte.api.bioactivity.domain.AssayListCount;
import gov.epa.ccte.api.bioactivity.projection.data.BioactivityDataAll;
import gov.epa.ccte.api.bioactivity.projection.data.BioactivityDataBase;
import gov.epa.ccte.api.bioactivity.repository.AssayListCountRepository;
import gov.epa.ccte.api.bioactivity.repository.BioactivityDataRepository;
import gov.epa.ccte.api.bioactivity.web.rest.error.HigherNumberOfRequestsException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Slf4j
@RestController
public class DataResource implements DataApi {

    private final BioactivityDataRepository dataRepository;
    private final AssayListCountRepository countRepository;
    
    @Value("200")
    private Integer batchSize;
    
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
    List<BioactivityDataAll>batchSearchDataByDtxsid(String[] dtxsids) {
        log.debug("bioactiivty data for dtxsid size = {}", dtxsids.length);

        if(dtxsids.length > batchSize)
            throw new HigherNumberOfRequestsException(dtxsids.length, batchSize);

        List<BioactivityDataAll> data = dataRepository.findByDtxsidInOrderByDtxsidAsc(dtxsids, BioactivityDataAll.class);

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
    List<BioactivityDataAll>batchSearchDataByAeid(String[] aeids) {
        log.debug("bioactiivty data for aeid size = {}", aeids.length);

        if(aeids.length > batchSize)
            throw new HigherNumberOfRequestsException(aeids.length, batchSize);

        List<BioactivityDataAll> data = dataRepository.findByAeidInOrderByAeidAsc(aeids, BioactivityDataAll.class);

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
    List<BioactivityDataAll>batchSearchDataBySpid(String[] spids) {
        log.debug("bioactiivty data for spids size = {}", spids.length);

        if(spids.length > batchSize)
            throw new HigherNumberOfRequestsException(spids.length, batchSize);

        List<BioactivityDataAll> data = dataRepository.findBySpidInOrderBySpidAsc(spids, BioactivityDataAll.class);

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
    List<BioactivityDataAll>batchSearchDataByM4id(String[] m4ids) {
        log.debug("bioactiivty data for m4ids size = {}", m4ids.length);

        if(m4ids.length > batchSize)
            throw new HigherNumberOfRequestsException(m4ids.length, batchSize);

        List<BioactivityDataAll> data = dataRepository.findByM4idInOrderByM4idAsc(m4ids, BioactivityDataAll.class);

        return data;
    }

    @Override
    public @ResponseBody
    AssayListCount summaryByAeid(Integer aeid) {

        log.debug("m4id = {}", aeid);

         return countRepository.findByAeid(aeid);
    }

}
