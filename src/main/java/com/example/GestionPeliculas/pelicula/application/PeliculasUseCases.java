package com.example.GestionPeliculas.pelicula.application;

import com.example.GestionPeliculas.pelicula.domain.Pelicula;
import com.example.GestionPeliculas.pelicula.domain.PeliculasRepository;
import com.example.GestionPeliculas.usuario.application.UsuarioUseCases;

import java.util.List;

public class PeliculasUseCases {
    public PeliculasRepository peliculasRepository;

    public PeliculasUseCases(PeliculasRepository peliculasRepository){
        this.peliculasRepository = peliculasRepository;
    }

    public List<Pelicula> getAll(Integer id){
        return this.peliculasRepository.getAll(id);
    }
    public List<Pelicula> save(Integer id,String nombre, Integer duracion){
        return this.peliculasRepository.save(id,nombre,duracion);
    }
    public List<Pelicula> update(Integer id, String nombre){
        return this.peliculasRepository.update(id,nombre);
    }
    public List<Pelicula> delete(Integer id, String nombre){
        return this.peliculasRepository.delete(id,nombre);
    }
}
