package com.colak.springjpautorial.repository;

import com.colak.springjpautorial.jpa.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
