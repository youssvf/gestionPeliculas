package com.example.GestionPeliculas.usuario.application;

import com.example.GestionPeliculas.pelicula.domain.Pelicula;
import com.example.GestionPeliculas.usuario.domain.Usuario;
import com.example.GestionPeliculas.usuario.domain.UsuariosRepository;

import java.util.List;

public class UsuarioUseCases {
    public UsuariosRepository usuariosRepository;

    public UsuarioUseCases(UsuariosRepository usuariosRepository){
        this.usuariosRepository = usuariosRepository;
    }

    public List<Usuario> getAll(){
        return this.usuariosRepository.getAll();
    }
    public List<Usuario> save(Integer id, String nombre){
        return this.usuariosRepository.save(id, nombre);
    }
    public Usuario update(Integer id, String nombre){
        return this.usuariosRepository.update(id,nombre);
    }
    public List<Usuario> delete(Integer id){
        return this.usuariosRepository.delete(id);
    }
}
