package org.example.zooservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/animals")
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.getAllAnimals();
    }

    @PostMapping
    public Animal createAnimal(@RequestBody Animal animal) {
        return animalService.saveAnimal(animal);
    }
}
