package gov.epa.ccte.api.bioactivity.repository;

import gov.epa.ccte.api.bioactivity.domain.AssayAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@SuppressWarnings("unused")
@RepositoryRestResource(exported = false)
public interface AssayAnnotationRepository extends JpaRepository<AssayAnnotation, Integer> {
    <T> T findByAeid(Integer aeid, Class<T> type);

    <T> List<T> findBy(Class<T> type);
}