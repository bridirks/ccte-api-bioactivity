package gov.epa.ccte.api.bioactivity.config.swagger;

import com.fasterxml.jackson.databind.ObjectMapper;
import gov.epa.ccte.api.bioactivity.springdocexamples.BioactivityExample;
import io.swagger.v3.oas.models.examples.Example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.*;

@Component
public class SwaggerExampleObject {

    @Value("classpath:examples/bioactivity/bioactivity-resources-examples.json")
    Resource bioactivityResourceExamples;

    @Bean
    public Map.Entry<String, List<Example>> bioactivityTestExamples() throws IOException, IllegalAccessError {

        ObjectMapper mapper = new ObjectMapper();
        mapper.findAndRegisterModules();

        // Load all examples from JSON files
        BioactivityExample[] bioactivityExamples = mapper.readValue(bioactivityResourceExamples.getInputStream(), BioactivityExample[].class);

        List<Example> exampleList = new ArrayList<>();
        AbstractMap.SimpleEntry<String, List<Example>> bioactivityExamplesMap = new AbstractMap.SimpleEntry<>("examples", null);

        // Add Bioactivity Examples
        for (BioactivityExample entry : bioactivityExamples) {
            Example example = convertExample(entry.getResults(), entry.getDescription(), entry.getIdentifier(), entry.getSummary());
            exampleList.add(example);
        }

        bioactivityExamplesMap.setValue(exampleList);

        return bioactivityExamplesMap;
    }

    private Example convertExample(Object results, String description, String ref, String summary) {
        Example example = new Example();
        example.setValue(results);
        example.setSummary(summary);
        example.setDescription(description);
        example.set$ref(ref);
        return example;
    }
}

