package popout.back.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class ControllerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ControllerApplication.class, args);
    }


    public void addCorsMappings(CorsRegistry registry)
    {
        registry.addMapping("/**");
    }
}