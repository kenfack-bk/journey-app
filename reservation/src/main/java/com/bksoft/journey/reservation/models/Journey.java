package com.bksoft.journey.reservation.models;

import java.time.LocalDate;

public class Journey extends BaseEntity{
    private JourneyPath circuit;
    private Schedule schedule;
    private LocalDate date;
}
