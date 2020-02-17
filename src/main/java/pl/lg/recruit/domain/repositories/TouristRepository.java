package pl.lg.recruit.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lg.recruit.domain.entities.Tourist;

public interface TouristRepository extends JpaRepository<Tourist, Long> {

}
