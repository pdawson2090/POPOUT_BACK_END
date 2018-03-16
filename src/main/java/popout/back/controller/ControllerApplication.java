package popout.back.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ControllerApplication implements WebMvcConfigurer
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