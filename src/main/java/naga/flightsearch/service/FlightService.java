package naga.flightsearch.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import naga.flightsearch.model.Flight;
import naga.flightsearch.repository.FlightRepository;

@Service
public class FlightService {

    private FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> searchFlight(String date, String flightNumber, String origin, String destination) throws ParseException {
        Date departure = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        return flightRepository.searchFlight(departure, flightNumber, origin, destination);
    }
}