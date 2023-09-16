package com.bksoft.journey.planning.payload;

import com.bksoft.journey.planning.models.JourneyPath;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class JourneyPayload {
    private String departure;
    private String arrival;
    private int distance;
    private int duration;
    private int cost;

    public JourneyPayload(JourneyPath journeyPath){
        this.departure = journeyPath.getDeparture();
        this.arrival = journeyPath.getArrival();
        this.distance = journeyPath.getDistance();
        this.duration = journeyPath.getDuration();
        this.cost = journeyPath.getCost();
    }

    public static List<JourneyPayload>  toPayloads(List<JourneyPath> journeyPaths){
        return journeyPaths.stream()
                .map(journeyPath -> new JourneyPayload(journeyPath))
                .collect(Collectors.toList());
    }
}
