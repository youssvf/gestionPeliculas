package com.example.GestionPeliculas.usuario.domain;

import com.example.GestionPeliculas.pelicula.domain.Pelicula;

import java.util.List;

public interface UsuariosRepository {
    public List<Usuario> getAll();
    public List<Usuario> save(Integer id, String nombre);
    public Usuario update(Integer id, String nombre);
    public List<Usuario> delete(Integer id);
}
