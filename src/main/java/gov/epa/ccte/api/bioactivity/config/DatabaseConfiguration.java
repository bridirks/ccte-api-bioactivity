package gov.epa.ccte.api.bioactivity.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Slf4j
@Configuration
@EnableJpaRepositories({ "gov.epa.ccte.api.bioactivity.repository" })
//@EnableJpaAuditing(auditorAwareRef = "springSecurityAuditorAware")
//@EnableTransactionManagement
//@EnableElasticsearchRepositories("com.mycompany.myapp.repository.search")
public class DatabaseConfiguration {
}
