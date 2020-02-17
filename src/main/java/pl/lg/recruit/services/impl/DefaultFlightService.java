package pl.lg.recruit.services.impl;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.lg.recruit.domain.entities.Flight;
import pl.lg.recruit.domain.repositories.FlightRepository;
import pl.lg.recruit.dtos.FlightDataDTO;
import pl.lg.recruit.services.FlightService;

import java.util.List;

@Service
@Transactional
public class DefaultFlightService implements FlightService {

    private final FlightRepository flightRepository;

    public DefaultFlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @Override
    public List<Flight> findAllFlights() {
        return flightRepository.findAll();
    }

    @Override
    public void createFlight(FlightDataDTO dataDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Flight flight = modelMapper.map(dataDTO, Flight.class);
        flightRepository.save(flight);
    }

    @Override
    public void deleteFlight(Long id) {
        flightRepository.deleteById(id);
    }

}
