package pl.bigmurloc.herbs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.bigmurloc.herbs.entity.Plant;


@RestController
public class PlantController {

    @GetMapping("/plant")
    public ResponseEntity<?> getPlants() {
        throw new RuntimeException("TODO");
    }

    @GetMapping("/plant/{id}")
    public ResponseEntity<?> getPlant(@PathVariable Long id) {
        throw new RuntimeException("TODO");
    }

    @PostMapping("/plant")
    public ResponseEntity<?> addPlant(@RequestBody Plant plant) {
        throw new RuntimeException("TODO");
    }

    @PutMapping("/plant/{id}")
    public ResponseEntity<?> updatePlant(@RequestBody Plant plant, @PathVariable Long id) {
        throw new RuntimeException("TOOD");
    }

    @DeleteMapping("/plant/{id}")
    public ResponseEntity<?> deletePlant(@PathVariable Long id) {
        throw new RuntimeException("TODO");
    }

}
