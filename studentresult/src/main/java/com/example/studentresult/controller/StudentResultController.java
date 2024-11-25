package com.example.studentresult.controller;

import com.example.studentresult.model.StudentResult;
import com.example.studentresult.service.StudentResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/results")
public class StudentResultController {

    @Autowired
    private StudentResultService service;

    // Get all student results
    @GetMapping
    public List<StudentResult> getAllResults() {
        return service.getAllResults();
    }

    // Save a student result
    @PostMapping
    public StudentResult saveResult(@RequestBody StudentResult result) {
        // Print the received data in a more structured way
        System.out.println("Payload Received: ");
        System.out.println("Name: " + result.getName());
        System.out.println("Roll Number: " + result.getRollNumber());
        System.out.println("MSE CN: " + result.getMseCN());
        System.out.println("ESE CN: " + result.getEseCN());
        System.out.println("MSE DAA: " + result.getMseDAA());
        System.out.println("ESE DAA: " + result.getEseDAA());
        System.out.println("MSE SDM: " + result.getMseSDM());
        System.out.println("ESE SDM: " + result.getEseSDM());
        System.out.println("MSE WT: " + result.getMseWT());
        System.out.println("ESE WT: " + result.getEseWT());
        
        // Save the result via the service layer
        return service.saveResult(result);
    }
}
