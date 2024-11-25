package com.example.studentresult.service;

import com.example.studentresult.model.StudentResult;
import com.example.studentresult.repository.StudentResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentResultService {

    @Autowired
    private StudentResultRepository repository;

    public List<StudentResult> getAllResults() {
        return repository.findAll();
    }

    public StudentResult saveResult(StudentResult result) {
        return repository.save(result);
    }
}
