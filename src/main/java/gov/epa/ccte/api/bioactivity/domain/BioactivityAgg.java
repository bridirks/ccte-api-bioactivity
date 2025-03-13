package gov.epa.ccte.api.bioactivity.domain;

import org.hibernate.annotations.Immutable;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

/**
 * Mapping for DB view
 */
@Getter
@Setter
@Entity
@Immutable
@Table(name = "mv_bioactivity", schema = "invitro")
public class BioactivityAgg {
	
	@Id
    @Column(name = "aeid")
    @Schema(description = "Assay component endpoint ID")
    private Integer aeid;

	@Size(max = 255)
    @Column(name = "dsstox_substance_id")
    @Schema(description = "Distributed Structure-Searchable Toxicity (DSSTox) id, also known as DTXSID")
    private String dtxsid;


}