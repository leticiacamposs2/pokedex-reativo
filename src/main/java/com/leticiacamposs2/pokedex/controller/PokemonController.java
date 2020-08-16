package com.leticiacamposs2.pokedex.controller;

import com.leticiacamposs2.pokedex.model.Pokemon;
import com.leticiacamposs2.pokedex.repository.PokedexRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pokemons")
public class PokemonController {

    private PokedexRepository repository;
    public PokemonController(PokedexRepository repository) { this.repository = repository; }

    @GetMapping
    public Flux<Pokemon> getAllPokemons() {return repository.findAll();}

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Pokemon>> getPokemon(@PathVariable String id) {
        return repository.findById(id)
                .map(pokemon -> ResponseEntity.ok(pokemon))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Pokemon> savePokemon(@RequestBody Pokemon pokemon) {
        return repository.save(pokemon);
    }

}
