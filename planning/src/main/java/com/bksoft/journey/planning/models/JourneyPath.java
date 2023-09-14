package com.bksoft.journey.planning.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Entity
@Table(name = "journey_paths")
public class JourneyPath extends BaseEntity{
    private String departure;
    private String arrival;
    private int distance;
    private int duration;
    private int cost;

    @ManyToMany
    @JoinTable(
            name = "journey_path_schedule",
            joinColumns = {@JoinColumn(name = "journey_path_id")},
            inverseJoinColumns = {@JoinColumn(name = "schedule_id")}
    )
    public List<Schedule> schedules;
}
