package tobysrping;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tobysrping.helloboot.HelloRepository;
import tobysrping.helloboot.HelloService;
import tobysrping.helloboot.HellobootTest;

import java.util.stream.IntStream;

import static org.assertj.core.api.Assertions.assertThat;

@HellobootTest
public class HelloServiceCountTest {
    @Autowired
    HelloService helloService;

    @Autowired
    HelloRepository helloRepository;

    @Test
    void sayHelloIncreaseCount() {
        IntStream.rangeClosed(1, 10).forEach(count -> {
            helloService.sayHello("Zin");
            assertThat(helloRepository.countOf("Zin")).isEqualTo(count);
        });
    }

}
