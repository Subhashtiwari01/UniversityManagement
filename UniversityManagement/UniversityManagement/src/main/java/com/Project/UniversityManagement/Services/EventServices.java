package com.Project.UniversityManagement.Services;

import com.Project.UniversityManagement.Model.Event;
import com.Project.UniversityManagement.Repo.IEventRepo;
import com.Project.UniversityManagement.Repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Optional;

@Service
public class EventServices {
    @Autowired
    IEventRepo eventRepo;


    public Iterable<Event> getAllEvent() {
        return eventRepo.findAll();
    }

    public String addEvent(Event event) {
        eventRepo.save(event);
        return "Event Added";

    }

    public String updateEvent(Long id,Event event) {
        Optional<Event> update=eventRepo.findById(id);

        if(update!=null){
            eventRepo.save(event);
            return "Updated";
        }
        return "event Not Found";

    }

    public Iterable<Event> getEventByDate(LocalDate date) {
        return eventRepo.findByDate(date);
    }

    public String deleteEventById(Long id) {
        eventRepo.deleteById(id);
        return "Event Deleted";
    }
}
