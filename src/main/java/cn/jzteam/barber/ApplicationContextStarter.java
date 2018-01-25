package cn.jzteam.barber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ApplicationContextStarter {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ApplicationContextStarter.class, args);
    }
}
