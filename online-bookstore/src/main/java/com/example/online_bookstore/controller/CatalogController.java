package com.example.online_bookstore.controller;

import com.example.online_bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/catalog")
public class CatalogController {
    
    @Autowired
    private BookService bookService;
    
    @GetMapping
    public String showCatalog(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "catalog";
    }
}