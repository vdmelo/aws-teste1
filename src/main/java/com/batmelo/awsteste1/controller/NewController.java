package com.batmelo.awsteste1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {

    @GetMapping("new-teste")
    public String teste() {
        return "New Controller v3. Trigger pipeline";
    }
}
