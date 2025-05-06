package gov.epa.ccte.api.bioactivity.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import gov.epa.ccte.api.bioactivity.domain.ChemicalAgg;

public interface ChemicalAggRepository extends JpaRepository<ChemicalAgg, String>{

    @Transactional(readOnly = true)
    <T>List<T> findByDtxsid(String dtxsid);
}
