package dev.shreyak.practice.repository;

import dev.shreyak.practice.model.Pokemon;

import java.util.List;
import java.util.Optional;

public interface PokemonRepository {
    void addPokemon(Pokemon pokemon);

    List<Pokemon> getAllPokemon();

    Optional<Pokemon> getPokemonId(Integer id);

    void updatePokemon(Pokemon pokemon);

    void deletePokemonById(Integer id);
}
