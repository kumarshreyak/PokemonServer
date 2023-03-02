package dev.shreyak.practice.repository;

import dev.shreyak.practice.model.Pokemon;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PokemonRepositoryImpl implements PokemonRepository {

    private final ArrayList<Pokemon> pokemonList;

    public PokemonRepositoryImpl() {
        this.pokemonList = new ArrayList<>();
    }

    @Override
    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }
    @Override
    public List<Pokemon> getAllPokemon() {
        return pokemonList;
    }

    @Override
    public Optional<Pokemon> getPokemonById(Integer id) {
        return pokemonList.stream().filter(p -> p.id().equals(id)).findFirst();
    }

    @Override
    public void updatePokemon(Pokemon pokemon) {
        deletePokemonById(pokemon.id());
        pokemonList.add(pokemon);
    }

    @Override
    public void deletePokemonById(Integer id) {
        pokemonList.removeIf(p -> p.id().equals(id));
    }

    @PostConstruct
    private void init() {
        pokemonList.add(new Pokemon(1, "Pikachu", "pikachu.com"));
    }
}
