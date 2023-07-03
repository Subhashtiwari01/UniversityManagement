package com.Project.UniversityManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Event {
    @Id
    private int eventId;

    private String eventName;
    private String eventLocation;
    private LocalDate date;
    private LocalTime startTime;
    private  LocalTime endTime;
}
