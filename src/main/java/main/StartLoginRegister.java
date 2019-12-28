package main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*@EnableJpaRepositories("repository")
@ComponentScan(basePackages = {"model","controller","service"})
@EntityScan(basePackages = {"model"})*/
public class StartLoginRegister {
    public static void main(String[] args){
        SpringApplication.run(StartLoginRegister.class,args);
    }
}
