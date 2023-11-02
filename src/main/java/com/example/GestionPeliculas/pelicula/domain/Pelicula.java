package com.example.GestionPeliculas.pelicula.domain;

public class Pelicula {
    private Integer id, duracion;
    private String nombre;

    public Pelicula(Integer id, String nombre,Integer duracion) {
        this.id = id;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
