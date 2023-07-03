package com.Project.UniversityManagement.Repo;

import com.Project.UniversityManagement.Model.Event;
import com.Project.UniversityManagement.Model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentRepo extends CrudRepository <Student,Long> {

}


