package pl.bigmurloc.herbs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.bigmurloc.herbs.entity.Plant;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {

}
