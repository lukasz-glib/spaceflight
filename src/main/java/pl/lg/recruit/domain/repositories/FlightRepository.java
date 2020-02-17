package pl.lg.recruit.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lg.recruit.domain.entities.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
