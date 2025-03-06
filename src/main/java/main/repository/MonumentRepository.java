package main.repository;

import main.model.Monument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonumentRepository extends MongoRepository<Monument, String> {
}

