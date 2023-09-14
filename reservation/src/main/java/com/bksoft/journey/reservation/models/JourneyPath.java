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
public class JourneyPath {
    private String departure;
    private String arrival;
    private int distance;
    private int duration;
    private int cost;
}
