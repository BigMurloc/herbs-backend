package pl.bigmurloc.herbs.service.impl;

import org.springframework.stereotype.Service;
import pl.bigmurloc.herbs.entity.Plant;
import pl.bigmurloc.herbs.repository.PlantRepository;
import pl.bigmurloc.herbs.service.PlantService;

import java.util.Optional;

@Service
public class PlantServiceImpl implements PlantService {

    private final PlantRepository plantRepository;

    public PlantServiceImpl(PlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public void add(Plant plant) {
        plantRepository.save(plant);
    }

    @Override
    public void update(Plant newPlant, Long id) {
        throw new RuntimeException("TODO");
    }

    @Override
    public void delete(Long id) {
        Optional<Plant> plant  = plantRepository.findById(id);
        plant.ifPresent(plantRepository::delete);
    }

    @Override
    public void get(Long id) {

    }

    @Override
    public void getAll() {

    }
}
