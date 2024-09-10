package org.example.zooservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AnimalService {

    private final AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }
    public Animal saveAnimal(Animal animal) {
        return animalRepository.save(animal.withId(UUID.randomUUID().toString()));
    }
}
