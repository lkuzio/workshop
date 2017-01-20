package xyz.javista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * Created by Luke on 2017-01-20.
 */
@SpringBootApplication

public class Application {

    public static String CONTEXT = "/rest";

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public EmbeddedServletContainerCustomizer containerCustomizer(){
        return (container -> {
            container.setPort(8092);
            container.setContextPath(CONTEXT);
        });
    }
}
