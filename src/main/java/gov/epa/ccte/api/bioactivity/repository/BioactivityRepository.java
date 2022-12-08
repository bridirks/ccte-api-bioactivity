package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.Bioactivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(exported = false)
public interface BioactivityRepository extends JpaRepository<Bioactivity, Integer> {

    List<Bioactivity> findByDtxsid(String dtxsid);

    List<Bioactivity> findByAeid(Integer aeid);

}
