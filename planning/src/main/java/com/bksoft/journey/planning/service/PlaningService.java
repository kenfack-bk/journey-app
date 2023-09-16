package com.bksoft.journey.planning.service;

import com.bksoft.journey.planning.models.JourneyPath;

import java.util.List;

public interface PlaningService {
    public List<JourneyPath> getAllJourneyPaths();
    public JourneyPath getPlaning(String departure, String arrival);
}
