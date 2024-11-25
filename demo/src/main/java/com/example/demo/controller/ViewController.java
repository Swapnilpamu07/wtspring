package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @GetMapping("/ui")
    public String renderHomePage() {
        return "index"; // This serves src/main/resources/static/index.html
    }
}

