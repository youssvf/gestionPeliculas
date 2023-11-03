package com.example.GestionPeliculas.usuario.infrastructure;

import com.example.GestionPeliculas.usuario.application.UsuarioUseCases;
import com.example.GestionPeliculas.usuario.domain.Usuario;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuariosRestController {
    private UsuarioUseCases usuarioUseCases;

    public UsuariosRestController(){
        this.usuarioUseCases = new UsuarioUseCases(new UsuarioRepositorySQL());
    }

    @GetMapping("/usuarios")
    public List<Usuario> getAll(){
        return this.usuarioUseCases.getAll();
    }

    @PostMapping(path ="/usuarios", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Usuario> save(@RequestBody Usuario usuario){
        return this.usuarioUseCases.save(usuario.getId(),usuario.getNombre());
    }

    @PutMapping("/usuarios/{id}")
    public Usuario update(@PathVariable Integer id,@RequestBody String nombre){
        return this.usuarioUseCases.update(id,nombre);
    }
}
