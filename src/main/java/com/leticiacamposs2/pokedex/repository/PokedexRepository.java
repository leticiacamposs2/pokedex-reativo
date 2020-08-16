package com.leticiacamposs2.pokedex.repository;

import com.leticiacamposs2.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository <Pokemon, String> {
}
