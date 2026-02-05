package com.practica.login.controller;

import com.practica.login.dao.UserDAO;
import com.practica.login.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class UserController {

    private UserDAO userDAO = new UserDAO();

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userDAO.save(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userDAO.login(user.getEmail(), user.getPassword());
    }

    @GetMapping("/test")
    public String test() {
        return "Backend vivo papi";
    }
}