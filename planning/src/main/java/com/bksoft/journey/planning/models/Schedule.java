package com.bksoft.journey.planning.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Entity
@Table(name = "schedules")
@Getter @NoArgsConstructor @AllArgsConstructor
public class Schedule extends BaseEntity {
    @Enumerated(EnumType.STRING)
    private DayOfWeek dayOfWeek;
    private int hours;
    private int minutes;
    public  static enum DayOfWeek{MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY,}
}