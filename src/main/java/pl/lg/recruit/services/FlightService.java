package pl.lg.recruit.services;

import pl.lg.recruit.domain.entities.Flight;
import pl.lg.recruit.dtos.FlightDataDTO;

import java.util.List;

public interface FlightService {

    List<Flight> findAllFlights();

    void createFlight(FlightDataDTO dataDTO);

    void deleteFlight(Long id);
}
