package com.gehlot.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableMethodSecurity
public class AuthTestController {

    @GetMapping("/normaluser")
    @PreAuthorize("hasRole('USER')")
    public String getNormalUser() {
        return "Normal User";
    }

    @GetMapping("/adminuser")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAdminuser() {
        return "Admin User";
    }
}
