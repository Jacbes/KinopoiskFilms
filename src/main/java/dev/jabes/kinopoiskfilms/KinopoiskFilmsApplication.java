package dev.jabes.kinopoiskfilms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KinopoiskFilmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(KinopoiskFilmsApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(MovieRepository movieRepository) {
        return args -> {
            Movie brasilia = new Movie("brasilia");
            Movie snatch = new Movie("Snatch");

            movieRepository.save(brasilia);
            movieRepository.save(snatch);
        };
    }
}
