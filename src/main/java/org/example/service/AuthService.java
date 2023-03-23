package org.example.service;

import org.example.controller.AuthController;
import org.example.entity.Employee;
import org.example.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;

    public Employee login(String phoneNumber) {
        Employee employee = authRepository.login(phoneNumber);
        return employee;
    }
}
