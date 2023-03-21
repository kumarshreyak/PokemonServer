package dev.shreyak.practice.repository;

import dev.shreyak.practice.model.Pokemon;
import dev.shreyak.practice.model.PokemonTrainer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface PokemonTrainerRepository extends MongoRepository<PokemonTrainer, String> {

    public List<PokemonTrainer> findByFirstName(String firstName);
    public List<PokemonTrainer> findByRegion(String region);

}
