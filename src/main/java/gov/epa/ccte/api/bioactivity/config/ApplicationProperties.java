package gov.epa.ccte.api.bioactivity.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.cors.CorsConfiguration;

/**
 * Properties specific to bioactivity.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 */
@Getter
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = true)
public class ApplicationProperties {

    private String docHostReplacement;
    private int docHostPort;
    private String docHostHttpProtocol;
    private Integer startPort;
    private Integer endPort;
    private Integer serverPort;
    private final CorsConfiguration cors = new CorsConfiguration();
}
