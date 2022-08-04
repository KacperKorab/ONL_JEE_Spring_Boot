package pl.coderslab.springboottest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.coderslab.springboottest.data.Data;
import pl.coderslab.springboottest.data.DataRepository;

@SpringBootApplication
public class SpringBootTestApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringBootTestApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }

    /*
    @Bean
    public CommandLineRunner demo(DataRepository repository) {
        return (args) -> {
            // save a few datas
            repository.save(new Data("Jack", "Bauer"));
            repository.save(new Data("Chloe", "O'Brian"));
            repository.save(new Data("Kim", "Bauer"));
            repository.save(new Data("David", "Palmer"));
            repository.save(new Data("Michelle", "Dessler"));

            // fetch all datas
            log.info("Datas found with findAll():");
            log.info("-------------------------------");
            for (Data data : repository.findAll()) {
                log.info(data.toString());
            }
            log.info("");

            // fetch an individual data by ID
            Data data = repository.findById(1L);
            log.info("Data found with findById(1L):");
            log.info("--------------------------------");
            log.info(data.toString());
            log.info("");

            // fetch datas by last name
            log.info("Data found with findByLastName('Bauer'):");
            log.info("--------------------------------------------");
            repository.findByDataName("Bauer").forEach(bauer -> {
                log.info(bauer.toString());
            });
            // for (Data bauer : repository.findByLastName("Bauer")) {
            //  log.info(bauer.toString());
            // }
            log.info("");
        };
    }

     */

}
