package com.example.studentresult.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Primary key
    
    private String name;
    private String rollNumber;
    private int mseCN;
    private int eseCN;
    private int mseDAA;
    private int eseDAA;
    private int mseSDM;
    private int eseSDM;
    private int mseWT;
    private int eseWT;

    // Default constructor
    public StudentResult() {
    }

    // Constructor with all fields
    public StudentResult(String name, String rollNumber, int mseCN, int eseCN, int mseDAA, int eseDAA, 
                         int mseSDM, int eseSDM, int mseWT, int eseWT) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.mseCN = mseCN;
        this.eseCN = eseCN;
        this.mseDAA = mseDAA;
        this.eseDAA = eseDAA;
        this.mseSDM = mseSDM;
        this.eseSDM = eseSDM;
        this.mseWT = mseWT;
        this.eseWT = eseWT;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getMseCN() {
        return mseCN;
    }

    public void setMseCN(int mseCN) {
        this.mseCN = mseCN;
    }

    public int getEseCN() {
        return eseCN;
    }

    public void setEseCN(int eseCN) {
        this.eseCN = eseCN;
    }

    public int getMseDAA() {
        return mseDAA;
    }

    public void setMseDAA(int mseDAA) {
        this.mseDAA = mseDAA;
    }

    public int getEseDAA() {
        return eseDAA;
    }

    public void setEseDAA(int eseDAA) {
        this.eseDAA = eseDAA;
    }

    public int getMseSDM() {
        return mseSDM;
    }

    public void setMseSDM(int mseSDM) {
        this.mseSDM = mseSDM;
    }

    public int getEseSDM() {
        return eseSDM;
    }

    public void setEseSDM(int eseSDM) {
        this.eseSDM = eseSDM;
    }

    public int getMseWT() {
        return mseWT;
    }

    public void setMseWT(int mseWT) {
        this.mseWT = mseWT;
    }

    public int getEseWT() {
        return eseWT;
    }

    public void setEseWT(int eseWT) {
        this.eseWT = eseWT;
    }

    @Override
    public String toString() {
        return "StudentResult{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rollNumber='" + rollNumber + '\'' +
                ", mseCN=" + mseCN +
                ", eseCN=" + eseCN +
                ", mseDAA=" + mseDAA +
                ", eseDAA=" + eseDAA +
                ", mseSDM=" + mseSDM +
                ", eseSDM=" + eseSDM +
                ", mseWT=" + mseWT +
                ", eseWT=" + eseWT +
                '}';
    }
}
