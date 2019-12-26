package controller;

import model.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repository.LoginRepository;
import repository.RegisterRepository;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    private RegisterRepository registerRepository;


    @GetMapping("/register/all")
    public List<Register> getRegisterAll(){
        return registerRepository.findAll();
    }

    @PostMapping("/register/new")
    public List<Register> setRegister(@RequestBody Register register){
        registerRepository.save(register);
        return registerRepository.findAll();
    }
}
