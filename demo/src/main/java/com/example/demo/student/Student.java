package com.example.demo.student;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence", 
        sequenceName = "student_sequence", 
        allocationSize=  1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator="student_sequence"
    )
    private Long id;
    private String name;
    @Transient
    private LocalDate registerDate;
    private Integer studentNum;
    private String email;

    public Student() {
        
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, LocalDate registerDate, Integer studentNum, String email) {
        this.name = name;
        this.registerDate = registerDate;
        this.studentNum = studentNum;
        this.email = email;
    }

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

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(Integer studentNum) {
        this.studentNum = studentNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student " + this.name;
    }

}
