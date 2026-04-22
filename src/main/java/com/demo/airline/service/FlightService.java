package com.demo.airline.service;

import com.demo.airline.entity.Flight;
import com.demo.airline.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // Marks business logic layer
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public List<Flight> getDelayedFlights(int minDelay) {
        return flightRepository.findByDelayMinutesGreaterThan(minDelay);
    }

    public Flight saveFlight(Flight flight) {
        return flightRepository.save(flight);
    }

}
