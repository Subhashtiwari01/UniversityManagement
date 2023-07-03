package com.Project.UniversityManagement.Controller;

import com.Project.UniversityManagement.Model.Event;
import com.Project.UniversityManagement.Services.EventServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class EventController {
    @Autowired
    EventServices eventServices;







    @GetMapping("event")
    public Iterable<Event>getAllEvent(){
        return eventServices.getAllEvent();
    }
    @PostMapping("addevent")
    public String addEvent(@RequestBody Event event){
        return eventServices.addEvent(event);
    }

    @PutMapping("addevent/{id}")

    public String updateEvent(@PathVariable Long id,@RequestBody Event event){
        return eventServices.updateEvent(id,event);
    }
    @GetMapping("eventbydate/{date}")

    public Iterable<Event> getEventByDate(@PathVariable LocalDate date){
        return eventServices.getEventByDate(date);

    }
    @DeleteMapping("romoveevent/{id}")
    public String deleteEventById(@PathVariable Long id){
        return eventServices.deleteEventById(id);
    }



}
