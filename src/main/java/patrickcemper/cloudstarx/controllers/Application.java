package patrickcemper.cloudstarx.controllers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.text.SimpleDateFormat;

/**
 * Cloud Star X
 *
 * Just some tiny test application to play around with Ubuntu, IntelliJ, Spring, Git, and stuff.
 *
 * @author Patrick Cemper
 * @version 0.1.0-SNAPSHOT
 */
@SpringBootApplication
@ComponentScan("patrickcemper.cloudstarx")
@EntityScan("patrickcemper.cloudstarx.entities")
@EnableJpaRepositories("patrickcemper.cloudstarx.repositories")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Command line runner started.");
            System.out.printf("Here are some application context infos:%n" +
                    "- application name: %s%n" +
                    "- display name: %s%n" +
                    "- id: %s%n" +
                    "- startup date: %s%n",
                    ctx.getApplicationName(),
                    ctx.getDisplayName(),
                    ctx.getId(),
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(ctx.getStartupDate()));
        };
    }

}
