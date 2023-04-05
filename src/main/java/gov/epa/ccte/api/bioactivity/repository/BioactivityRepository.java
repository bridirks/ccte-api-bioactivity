package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.Bioactivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface BioactivityRepository extends JpaRepository<Bioactivity, Integer> {

    //<T> List<T> findByDtxsidInOrderByDtxsidAscAeidAsc(String[] dtxsids, Class<T> type);

    @Transactional(readOnly = true)
    <T>
    List<T> findByDtxsid(String dtxsid, Class<T> type);

    @Transactional(readOnly = true)
    <T>
    List<T> findByAeid(Integer aeid, Class<T> type);

}
