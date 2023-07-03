package com.Project.UniversityManagement.Repo;

import com.Project.UniversityManagement.Model.Event;
import com.Project.UniversityManagement.Model.Student;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;

public interface IEventRepo extends CrudRepository<Event,Long> {
    Iterable<Event> findByDate(LocalDate date);
}



