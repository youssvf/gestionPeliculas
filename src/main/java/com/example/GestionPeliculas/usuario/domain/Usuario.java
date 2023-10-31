package com.example.GestionPeliculas.usuario.domain;

import com.example.GestionPeliculas.pelicula.domain.Pelicula;

import java.util.List;

public class Usuario {
    private Integer id;
    private String nombre;
    private List<Pelicula> peliculas;

    public Usuario(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.peliculas = peliculas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
}
