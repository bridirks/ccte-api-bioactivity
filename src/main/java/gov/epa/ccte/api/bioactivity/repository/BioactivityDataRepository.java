package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.BioactivityData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("unused")
@RepositoryRestResource(exported = false)
public interface BioactivityDataRepository extends JpaRepository<BioactivityData, Long> {
    @Transactional(readOnly = true)
    <T>List<T> findByDtxsid(String dtxsid, Class<T> type);
    
    @Transactional(readOnly = true)
    <T>List<T> findByDtxsidInOrderByDtxsidAsc(String[] dtxsids, Class<T> type);

    @Transactional(readOnly = true)
    <T> T findByM4id(Integer m4id, Class<T> type);

    @Transactional(readOnly = true)
    <T>List<T> findByM4idInOrderByM4idAsc(String[] spids, Class<T> type);

    @Transactional(readOnly = true)
    <T>List<T> findByAeid(Integer aeid, Class<T> type);
    
    @Transactional(readOnly = true)
    <T>List<T> findByAeidInOrderByAeidAsc(String[] aeids, Class<T> type);

    @Transactional(readOnly = true)
    <T>List<T> findBySpid(String spid, Class<T> type);
    
    @Transactional(readOnly = true)
    <T>List<T> findBySpidInOrderBySpidAsc(String[] spids, Class<T> type);


}
