package service;

import model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import repository.LoginRepository;

import java.util.List;
@Component
@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public List<Login> getUsers(){
        return loginRepository.findAll();
    }

    public List<Login> setUsers(final Login login){
        loginRepository.save(login);
        return loginRepository.findAll();
    }
}
