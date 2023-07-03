package com.Project.UniversityManagement.Controller;

import com.Project.UniversityManagement.Model.Event;
import com.Project.UniversityManagement.Model.Student;
import com.Project.UniversityManagement.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentServices studentServices;


    @GetMapping("University")

    public Iterable<Student> getAllStudents(){
        return studentServices.getAllStudents();
    }



    @PostMapping("student")
    public String addStudent(@RequestBody Student student){
        return studentServices.addStudent(student);
    }

    @DeleteMapping("student/{Id}")

    public String deleteStudentById(@PathVariable Long Id){
        return studentServices.deleteRoomById(Id);
    }

    @PutMapping("student/{Id}")

    public String updated(@PathVariable Long Id, @RequestBody Student student){
        return studentServices.update(Id, student);

    }
//    @PutMapping("student/{department}")
//    public String updateByDepartment(@PathVariable String department,@RequestBody Student student){
//        return studentServices.updateByDepartment()
//
//    }
    









}
