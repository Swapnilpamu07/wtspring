package com.example.studentresult.repository;

import com.example.studentresult.model.StudentResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentResultRepository extends JpaRepository<StudentResult, Long> {
}
