package tobysrping.config.autoconfig;

import org.springframework.boot.web.embedded.jetty.JettyServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import tobysrping.config.MyAutoConfiguration;

@MyAutoConfiguration
public class JettyWebServerConfig {
    @Bean("jettyWebServerFactory")
    public ServletWebServerFactory serverWebServerFactory() {
        return new JettyServletWebServerFactory();
    }
}
