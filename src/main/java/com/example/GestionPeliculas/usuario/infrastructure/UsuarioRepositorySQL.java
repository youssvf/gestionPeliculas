package com.example.GestionPeliculas.usuario.infrastructure;

import com.example.GestionPeliculas.data.DBConecction;
import com.example.GestionPeliculas.pelicula.domain.Pelicula;
import com.example.GestionPeliculas.usuario.domain.Usuario;
import com.example.GestionPeliculas.usuario.domain.UsuariosRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorySQL implements UsuariosRepository {
    @Override
    public List<Usuario> getAll() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            Statement statement = DBConecction.getInstance().createStatement();
            ResultSet rs = statement.executeQuery("select * from usuarios;");
            while (rs.next()){
                usuarios.add(new Usuario(rs.getInt("id"),rs.getString("nombre")));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return usuarios;
    }

    @Override
    public List<Usuario> save(Integer id, String nombre) {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            PreparedStatement statement = DBConecction.getInstance().prepareStatement("insert into usuarios(nombre) values(?)");
            statement.setString(1,nombre);

            statement.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        usuarios = getAll();
        return usuarios;
    }

    @Override
    public Usuario update(Integer id,String nombre) {
        try {
            PreparedStatement statement = DBConecction.getInstance().prepareStatement("update usuarios set nombre = ? where id = ?");

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public List<Usuario> delete(Integer id) {
        try {
            Statement statement = DBConecction.getInstance().createStatement();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
