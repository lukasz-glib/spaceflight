package pl.lg.recruit.services;

import pl.lg.recruit.domain.entities.Tourist;

import java.util.List;

public interface TouristService {

    List<Tourist> findAllTourist();
}
