package hello.configuration;

import hello.ressources.BeerRestController;
import hello.ressources.GreetingController;
import hello.services.BeerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses =  {BeerService.class, BeerRestController.class, GreetingController.class})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
