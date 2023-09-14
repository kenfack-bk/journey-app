package com.bksoft.journey.reservation.models;

import java.time.LocalDateTime;

public class Reservation extends BaseEntity{
    private String fullNames;
    private String phoneNumber;
    private String idCard;
    private LocalDateTime dateTime;
    private Journey journey;
}
