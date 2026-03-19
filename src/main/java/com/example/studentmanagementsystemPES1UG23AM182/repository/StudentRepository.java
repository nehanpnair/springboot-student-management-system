package com.example.studentmanagementsystemPES1UG23AM182.repository;

import com.example.studentmanagementsystemPES1UG23AM182.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

    boolean existsByEmail(String email);
}