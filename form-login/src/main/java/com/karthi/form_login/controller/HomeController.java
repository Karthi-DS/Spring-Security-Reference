
package com.karthi.form_login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Welcome! You are authenticated.";
    }

    @GetMapping("/public")
    public String publicPage() {
        return "This page is accessible without logging in.";
    }

    @GetMapping("/user/profile")
    public String userProfile() {
        return "Welcome to the user profile.";
    }

    @GetMapping("/admin/dashboard")
    public String adminDashboard() {
        return "Welcome to the admin dashboard.";
    }
}
