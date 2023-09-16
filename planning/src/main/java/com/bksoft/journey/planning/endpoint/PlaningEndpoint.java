package com.bksoft.journey.planning.endpoint;

import com.bksoft.journey.planning.models.JourneyPath;
import com.bksoft.journey.planning.payload.JourneyPayload;
import com.bksoft.journey.planning.service.PlaningService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("v1/planing")
public class PlaningEndpoint {

    PlaningService planingService;

    PlaningEndpoint(PlaningService planingService){
        this.planingService = planingService;
    }

    @GetMapping("/journey")
    ResponseEntity<List<JourneyPayload>>  fetchAllJourneyPaths(){
        List<JourneyPath> paths = planingService.getAllJourneyPaths();
        return new ResponseEntity<>(JourneyPayload.toPayloads(paths), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<JourneyPath> fetchPlaning(@RequestParam(name="departure") String departure,
                                                    @RequestParam(name="arrival") String arrival){
        JourneyPath planing = planingService.getPlaning(departure, arrival);
        return new ResponseEntity<>(planing, HttpStatus.OK);
    }
}
