package gov.epa.ccte.api.bioactivity.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "api_keys", schema = "app")
public class ApiKey {
    @Id
    @Column(name = "api_key", nullable = false)
    private UUID id;

    @Size(max = 10)
    @Column(name = "data_scope", length = 10)
    private String dataScope;

    @Column(name = "created_on")
    private LocalDate createdOn;

}