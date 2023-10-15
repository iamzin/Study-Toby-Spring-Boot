package tobysrping.helloboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.NONE)
@Transactional
public class HelloRepositoryTest {
    @Autowired
    HelloRepository helloRepository;

    @Test
    void findHelloFailed() {
        assertThat(helloRepository.findHello("Zin")).isNull();
    }

    @Test
    void increaseCount() {
        assertThat(helloRepository.countOf("Zin")).isEqualTo(0);

        helloRepository.increaseCount("Zin");
        assertThat(helloRepository.countOf("Zin")).isEqualTo(1);

        helloRepository.increaseCount("Zin");
        assertThat(helloRepository.countOf("Zin")).isEqualTo(2);
    }
}
