package com.reactapp.service.Login;

import com.reactapp.model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class LoginService {
    
    private LoginRepo loginRepo;

    @Autowired
    public LoginService(LoginRepo loginRepo) {
        this.loginRepo = loginRepo;
    }

    public void addUser(Login login){
        loginRepo.save(login);
    }
}
