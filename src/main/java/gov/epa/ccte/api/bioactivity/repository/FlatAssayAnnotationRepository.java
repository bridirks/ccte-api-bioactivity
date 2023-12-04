package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.FlatAssayAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@SuppressWarnings("unused")
@RepositoryRestResource(exported = false)
public interface FlatAssayAnnotationRepository extends JpaRepository<FlatAssayAnnotation, Integer> {
    <T> T findByAeid(Integer aeid, Class<T> type);

}