package com.kairos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/")
    public ResponseEntity<String> showWelComeMsg() {
        return new ResponseEntity<>("Welcome here.", HttpStatus.OK);
    }
}
