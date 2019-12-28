package controller;

import model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import service.LoginService;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login/all")
    private List<Login> getAllUsers(){
        return loginService.getUsers();
    }

    @PostMapping("/login/new")
    public List<Login> setAllUsers(@RequestBody final Login login){
        loginService.setUsers(login);
        return loginService.getUsers();
    }
}
