package gov.epa.ccte.api.bioactivity;

import gov.epa.ccte.api.bioactivity.domain.Bioactivity;
import gov.epa.ccte.api.bioactivity.repository.BioactivityRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
@DataJpaTest
//@TestPropertySource(locations = "classpath:test-configuration.properties")
public class BioactivityRepositoryTest {

    @Autowired
    private DataSource dataSource;
    @Autowired private JdbcTemplate jdbcTemplate;
    @Autowired private TestEntityManager entityManager;
    @Autowired private BioactivityRepository bioactivityRepository;

    @Test
    void injectedComponentsAreNotNull(){
        assertThat(dataSource).isNotNull();
        assertThat(jdbcTemplate).isNotNull();
        assertThat(entityManager).isNotNull();
        assertThat(bioactivityRepository).isNotNull();
    }

    @Test
    void dataIsLoaded(){
        List<Bioactivity> data = bioactivityRepository.findByDtxsid("DTXSID0020020", Bioactivity.class);

        log.info("size {} ", data.size());

        assertThat(data).isNotNull();
        assertThat(data.size()==0).isFalse();
    }

    @Test
    void checkingIfH2DatabaseHasTheData(){

        // This dtxsid doesn't exist in data.sql file but it is in the database. In this case
        // test shouldn't find this dtxsid
        List<Bioactivity> data = bioactivityRepository.findByDtxsid("DTXSID6020569", Bioactivity.class);

        assertThat(data.size()==0).isTrue();
    }

    @Test
    void checkSpecificAeidValue(){
        List<Bioactivity> data = bioactivityRepository.findByAeid(760, Bioactivity.class);
        Integer tableSize = data.size();
        log.info("size {} ", tableSize);
        System.out.println(" size = " + tableSize.toString());
        assertThat(data.size() == 0).isFalse();
    }

}
