package com.assignment.saas_backend.controller;

import jakarta.validation.Valid;
import com.assignment.saas_backend.dto.request.LoginRequest;
import com.assignment.saas_backend.dto.request.RegisterRequest;
import com.assignment.saas_backend.dto.response.AuthResponse;
import com.assignment.saas_backend.entity.User;
import com.assignment.saas_backend.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    public User register(@Valid @RequestBody RegisterRequest request) {
        return authService.register(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody LoginRequest request) {

        return authService.login(
                request.getEmail(),
                request.getPassword()
        );
    }
}