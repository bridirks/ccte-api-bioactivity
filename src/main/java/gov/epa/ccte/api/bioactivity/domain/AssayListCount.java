package gov.epa.ccte.api.bioactivity.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "v_assay_list_counts", schema = "bio4_1")
public class AssayListCount {
    @Id
    @Column(name = "aeid")
    private Integer aeid;

    @Column(name = "active_mc")
    private Long activeMc;

    @Column(name = "total_mc")
    private Long totalMc;

    @Column(name = "active_sc")
    private Long activeSc;

    @Column(name = "total_sc")
    private Long totalSc;

}