package org.example.controller;

import org.example.entity.Employee;
import org.example.service.AdminController;
import org.example.service.AuthService;
import org.example.utils.ScannerUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AuthController {
    @Autowired
    private AuthService authService;
    @Autowired
    private ScannerUtil scannerUtil;
    @Autowired
    private AdminController adminController;

    private void start() {
        boolean a = true;
        while (a) {
            headerMenu();
            int operation = scannerUtil.INT_SCANNER.nextInt();
            switch (operation) {
                case 1 -> login();
                case 2 -> complains();
                default -> {
                    System.out.println("Mazgi xato kiritding!");
                    return;
                }
            }
        }
    }

    private void complains() {}

    private void login() {
        System.out.println("Enter phone number: ");
        String phoneNumber = scannerUtil.STR_SCANNER.nextLine();
        Employee employee = authService.login(phoneNumber);
        if(employee==null){
            System.out.println( "Wrong phone number");
        }else{
            adminController.adminMenu();
        }
    }

    private void headerMenu() {
        System.out.println("""
                *** Menu ***
                1: Login
                2: Complain
                """);
    }
}
