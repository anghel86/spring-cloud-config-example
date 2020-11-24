package md.anghel.config.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

@SpringBootApplication
public class CloudConfigClientApplication implements ApplicationRunner {

    @Autowired
    private ConfigurableEnvironment environment;

    public static void main(String[] args) {
        System.setProperty("spring.cloud.bootstrap.enabled", "true");
        SpringApplication.run(CloudConfigClientApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(environment.getProperty("test.property"));
        System.out.println(environment.getProperty("test.other"));
        System.exit(-1);
    }
}
