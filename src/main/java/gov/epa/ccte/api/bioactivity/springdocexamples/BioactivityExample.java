package gov.epa.ccte.api.bioactivity.springdocexamples;

import lombok.Data;

import java.util.List;

/**
 * POJO that is used by jackson to map resources/examples/bioactivity/*.json files.
 */
@Data
public class BioactivityExample {
    private String description;
    private String summary;
    private String identifier;
    private List<BioactivityExampleDto> results;
}
