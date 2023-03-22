package gov.epa.ccte.api.bioactivity.springdocexamples;

import lombok.Data;

import java.util.List;

@Data
public class BioactivityExample {
    private String description;
    private String summary;
    private String identifier;
    private List<BioactivityExampleDto> results;
}
