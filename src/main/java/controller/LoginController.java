package controller;

import model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.LoginRepository;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/login/all")
    private List<Login> getAllUsers(){
        return loginRepository.findAll();
    }

    @PostMapping("/login/new")
    public List<Login> setAllUsers(@RequestBody final Login login){
        loginRepository.save(login);
        return loginRepository.findAll();
    }
}
