package com.colak.springjpautorial.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.TableGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "student_gen")
    @TableGenerator(
            //  Generator name used in annotation @GeneratedValue.
            name = "student_gen",
            // Table name used for storing identifier values.
            table = "id_gen",
            // Column name in the table containing the key name.
            pkColumnName = "gen_key",
            // Column name containing the following key value.
            valueColumnName = "gen_value",
            // The value in pkColumnName, which identifies the row containing the next identifier value for the given entity.
            pkColumnValue = "employee_id",
            // The number of values allocated at once and stored in memory.
            // It allows reducing the number of database queries for new values.
            allocationSize = 1
    )
    private Long id;

    private String firstName;
    private String lastName;

}
