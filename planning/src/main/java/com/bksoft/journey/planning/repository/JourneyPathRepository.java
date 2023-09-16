package com.bksoft.journey.planning.repository;

import com.bksoft.journey.planning.models.JourneyPath;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JourneyPathRepository extends JpaRepository<JourneyPath, Long> {
    public JourneyPath findByDepartureAndArrival(String departure, String arrival);
}
