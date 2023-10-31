package com.example.GestionPeliculas.pelicula.domain;

import java.util.List;

public interface PeliculasRepository {
    public List<Pelicula> getAll(Integer id);
    public List<Pelicula> save(Integer id,String nombre, Integer duracion);
    public List<Pelicula> update(Integer id, String nombre);
    public List<Pelicula> delete(Integer id, String nombre);
}
