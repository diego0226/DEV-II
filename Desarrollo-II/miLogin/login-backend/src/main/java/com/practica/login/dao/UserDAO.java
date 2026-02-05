package com.practica.login.dao;

import java.util.ArrayList;
import java.util.List;
import com.practica.login.model.User;

public class UserDAO {
    private List<User> users = new ArrayList<>();
    private int idCounter = 1;

    public User save(User user) {
        if (user != null) {
            user.setId(idCounter++);
            users.add(user);
            return user;
        }
        return null;
    }

    public User findByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public User login(String email, String password) {
        User user = findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }

    public List<User> findAll() {
        return users;
    }
}
