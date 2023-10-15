package tobysrping.helloboot;

import org.springframework.stereotype.Component;

@Component
public class SimpleHelloService implements HelloService {
    private final HelloRepository helloRepository;

    public SimpleHelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    @Override
    public String sayHello(String name) {
        this.helloRepository.increaseCount(name);

        return "Hello " + name;
    }

    @Override
    public int countOf(String name) {
        return helloRepository.countOf(name);
    }
}
