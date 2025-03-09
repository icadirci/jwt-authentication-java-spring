package com.authentication.jwtauthentication.controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {
    PasswordEncoder encoder;

    @GetMapping("/all")
    public String allAccess() {
        return "Public Endpoint.";
    }
    @GetMapping("/user")
    public String userAccess() {
        return "User Content.";
    }
}
