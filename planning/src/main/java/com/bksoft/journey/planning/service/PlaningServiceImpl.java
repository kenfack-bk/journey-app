package com.bksoft.journey.planning.service;

import com.bksoft.journey.planning.exception.ResourceNotFoundException;
import com.bksoft.journey.planning.models.JourneyPath;
import com.bksoft.journey.planning.models.Schedule;
import com.bksoft.journey.planning.repository.JourneyPathRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor
public class PlaningServiceImpl implements PlaningService{

    JourneyPathRepository journeyPathRepository;

    @Override
    public List<JourneyPath> getAllJourneyPaths() {
        return journeyPathRepository.findAll();
    }

    @Override
    public JourneyPath getPlaning(String departure, String arrival) {
        JourneyPath journeyPath = journeyPathRepository
                .findByDepartureAndArrival(departure, arrival);
        if(journeyPath == null){
            throw new ResourceNotFoundException("JourneyPath", "departure-arrival", departure + "-" + arrival);
        }
        journeyPath.getSchedules();
        Collections.sort(journeyPath.getSchedules(),
                (sch1, sch2) -> {
                    int result = sch1.getDayOfWeek().compareTo(sch2.getDayOfWeek());
                    if(result != 0) return result;
                    result = sch1.getHours() - sch2.getHours();
                    if(result != 0) return result;
                    return sch1.getMinutes() - sch2.getMinutes();
                });
        return journeyPath;
    }
}
