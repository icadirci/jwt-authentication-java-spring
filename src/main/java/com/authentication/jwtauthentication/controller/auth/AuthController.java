package com.authentication.jwtauthentication.controller.auth;

import com.authentication.jwtauthentication.entity.User;
import com.authentication.jwtauthentication.service.auth.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/signin")
    public String authenticateUser(@RequestBody User user) {
        return authService.authenticateUser(user.getUsername(), user.getPassword());
    }

    @PostMapping("/signup")
    public String registerUser(@RequestBody User user) {
        return authService.registerUser(user);
    }
}
