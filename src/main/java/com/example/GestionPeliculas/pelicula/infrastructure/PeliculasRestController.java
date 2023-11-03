package com.example.GestionPeliculas.pelicula.infrastructure;

import com.example.GestionPeliculas.pelicula.application.PeliculasUseCases;
import com.example.GestionPeliculas.pelicula.domain.Pelicula;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@RestController
public class PeliculasRestController {
    private PeliculasUseCases peliculasUseCases;
    public PeliculasRestController(){
        this.peliculasUseCases = new PeliculasUseCases(new PeliculasRepositorySQL());
    }

    @GetMapping("/usuario/{id}/peliculas")
    public List<Pelicula> getAll(@PathVariable Integer id){
        return this.peliculasUseCases.getAll(id);
    }

    @PostMapping(path = "/usuario/{id}/peliculas", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Pelicula> save(@PathVariable Integer id,@RequestBody Pelicula pelicula){
        return this.peliculasUseCases.save(id,pelicula);
    }
}
