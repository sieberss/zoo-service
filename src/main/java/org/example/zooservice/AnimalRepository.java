package org.example.zooservice;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnimalRepository extends MongoRepository<Animal, String> {
}
