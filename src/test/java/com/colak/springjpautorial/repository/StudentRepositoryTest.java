package com.colak.springjpautorial.repository;

import com.colak.springjpautorial.jpa.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
    void save() {
        Student student1 = new Student(null, "firstName1", "lastName1");
        Student saved1 = repository.save(student1);
        assertThat(saved1.getId()).isEqualTo(1L);

        Student student2 = new Student(null, "firstName2", "lastName2");
        Student saved2 = repository.save(student2);
        assertThat(saved2.getId()).isEqualTo(2L);
    }
}
