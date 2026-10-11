package com.karthi.basic_security.service;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class SecurityService {

    @PreAuthorize("hasRole('ADMIN')")
    public String adminOperation() {
        return "Admin operation executed successfully.";
    }

    @PreAuthorize("hasAnyRole('USER','ADMIN')")
    public String userOperation() {
        return "User operation executed successfully.";
    }
}