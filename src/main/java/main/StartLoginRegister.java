package main;

import model.Login;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import repository.LoginRepository;

@SpringBootApplication
@EnableJpaRepositories("repository")
@ComponentScan(basePackages = {"controller","service"})
@EntityScan(basePackages = {"model"})

public class StartLoginRegister implements CommandLineRunner {
    @Autowired
    private LoginRepository loginRepository;
    public static void main(String[] args){
        SpringApplication.run(StartLoginRegister.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        Login login=new Login();
        login.setEmail("kaustav");
        login.setPassword("12345");
        login.setSessionId("efefeff");
        loginRepository.save(login);
    }
}
