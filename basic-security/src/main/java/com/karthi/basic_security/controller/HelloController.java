package com.karthi.basic_security.controller;

import com.karthi.basic_security.service.SecurityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final SecurityService securityService;

    public HelloController(SecurityService securityService) {
        this.securityService = securityService;
    }

    @GetMapping("/public/hello")
    public String publicHello() {
        return "Hello! This is a public endpoint.";
    }

    @GetMapping("/hello")
    public String protectedHello() {
        return "Hello! You are authenticated.";
    }

    @GetMapping("/user/profile")
    public String userProfile() {
        return "Welcome! You have USER access.";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Welcome! You have ADMIN access.";
    }

    @GetMapping("/service/user")
    public String serviceUser() {
        return securityService.userOperation();
    }

    @GetMapping("/service/admin")
    public String serviceAdmin() {
        return securityService.adminOperation();
    }
}