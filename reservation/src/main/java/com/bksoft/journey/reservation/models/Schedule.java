package com.bksoft.journey.reservation.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Schedule {
    private DayOfWeek weekDay;
    private int hour;
    private int minute;
    public  static enum DayOfWeek{MONDAY, TUESDAY, WEDNESDAY, THUSDAY, FRYDAY, SATURDAY, SUNDAY,}
}
