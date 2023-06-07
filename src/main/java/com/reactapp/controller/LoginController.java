package com.reactapp.controller;

import com.reactapp.service.LoginRepo;
import com.reactapp.service.LoginService;
import com.reactapp.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    private LoginRepo repo;

    @PostMapping("/signup") // Map ONLY POST Requests
    public void addNewUser(@RequestBody Login login) {
        loginService.addUser(login);
    }

    @GetMapping("/demo")
    @ResponseBody
    public Boolean displayContent(@RequestParam("username") String username,
            @RequestParam("password") String password) {
        String name = "";
        String pwd = "";
        try {
            name = repo.findByUsername(username).getUsername();
            pwd = repo.findByUsername(username).getPassword();
        } catch (Exception e) {
            System.out.println("No user exists");
            return false;
        }
        return (name.equals(username.trim()) && pwd.equals(password.trim()));
    }

}
