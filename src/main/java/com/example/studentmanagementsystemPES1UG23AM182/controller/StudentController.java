package com.example.studentmanagementsystemPES1UG23AM182.controller;

import com.example.studentmanagementsystemPES1UG23AM182.model.Student;
import com.example.studentmanagementsystemPES1UG23AM182.service.StudentService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    private final StudentService service;
    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("students", service.getAllStudents());
        return "index";
    }

    @PostMapping("/api/students")
    public String addStudent(@ModelAttribute Student student, Model model) {

        try {
            service.addStudent(student);
        } 
        catch (RuntimeException e) {
            model.addAttribute("error", e.getMessage());
        }

        model.addAttribute("students", service.getAllStudents());
        return "index";
    }
}