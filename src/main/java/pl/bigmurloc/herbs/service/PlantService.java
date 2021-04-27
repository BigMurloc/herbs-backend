package pl.bigmurloc.herbs.service;

import org.springframework.stereotype.Service;
import pl.bigmurloc.herbs.entity.Plant;

@Service
public interface PlantService {

    void add(Plant plant);
    void update(Plant plant, Long id);
    void delete(Long id);
    void get(Long id);
    void getAll();

}
