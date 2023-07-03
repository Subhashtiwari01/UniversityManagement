package com.Project.UniversityManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id

    private long studentId;
    private String firstName;
    private String lastName;

    @Min(value=18)
    @Max(value =25)
    private int age;
    private String department;
}
