package com.hongmae.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiV1Controller {
    @GetMapping("/")
    public String index() {
        return "Hello, User Service!";
    }
}
