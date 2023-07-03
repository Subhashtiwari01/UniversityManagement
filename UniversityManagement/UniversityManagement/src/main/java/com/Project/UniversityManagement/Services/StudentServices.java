package com.Project.UniversityManagement.Services;

import com.Project.UniversityManagement.Model.Event;
import com.Project.UniversityManagement.Model.Student;
import com.Project.UniversityManagement.Repo.IEventRepo;
import com.Project.UniversityManagement.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServices {
    @Autowired
    IStudentRepo studentRepo;
    @Autowired
    IEventRepo eventRepo;


    public  Iterable<Student> getAllStudents() {
        return studentRepo.findAll();


    }


    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Information Added";

    }

    public String deleteRoomById(Long Id) {
        studentRepo.deleteById(Id);
        return "Deleted";
    }

    public String update(Long Id, Student studentInformatin) {
        Optional<Student> student= studentRepo.findById(Id);
        if(student!=null){
            studentRepo.save(studentInformatin);
            return "Updated";
        }
        return "Student Not Found";
    }




}
