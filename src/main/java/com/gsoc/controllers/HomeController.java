package com.gsoc.controllers;

import com.gsoc.model.User;
import com.gsoc.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class HomeController {
    @Autowired
    private UserService userService;

    @PostMapping("/signup")
    public User createUser(@RequestBody User user) throws Exception {
        return this.userService.createUser(user);
    }
    @PostMapping("/login")
    public Object login(@RequestBody User user) {
        User u=this.userService.getUser(user.getEmail());
        if(u.getPassword().equals(user.getPassword())){
            return user;
        }
        else{
            return new Exception("invalid credentials");
        }
    }

}
