package pl.lg.recruit.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.lg.recruit.domain.entities.Tourist;
import pl.lg.recruit.domain.repositories.TouristRepository;
import pl.lg.recruit.services.TouristService;

import java.util.List;

@Service
@Transactional
public class DefaultTouristService implements TouristService {

    private final TouristRepository touristRepository;

    public DefaultTouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;
    }

    @Override
    public List<Tourist> findAllTourist() {
        return touristRepository.findAll();
    }


}
