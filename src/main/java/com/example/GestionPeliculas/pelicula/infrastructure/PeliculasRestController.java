package com.example.GestionPeliculas.pelicula.infrastructure;

import com.example.GestionPeliculas.pelicula.application.PeliculasUseCases;
import com.example.GestionPeliculas.pelicula.domain.Pelicula;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
}
