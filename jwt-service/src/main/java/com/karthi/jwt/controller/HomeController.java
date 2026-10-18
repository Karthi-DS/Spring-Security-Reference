package com.karthi.jwt.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String home(Authentication authentication) {

        return "Welcome, " + authentication.getName();
    }

    @GetMapping("/admin")
    public String admin() {

        return "Welcome to the admin endpoint";
    }
}