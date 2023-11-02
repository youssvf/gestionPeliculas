package com.example.GestionPeliculas.pelicula.infrastructure;

import com.example.GestionPeliculas.data.DBConecction;
import com.example.GestionPeliculas.pelicula.application.PeliculasUseCases;
import com.example.GestionPeliculas.pelicula.domain.Pelicula;
import com.example.GestionPeliculas.pelicula.domain.PeliculasRepository;

import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PeliculasRepositorySQL implements PeliculasRepository{
    @Override
    public List<Pelicula> getAll(Integer id) {
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            Statement statement = DBConecction.getInstance().createStatement();
            ResultSet rs = statement.executeQuery("select id_pelicula,nombre,duracion from peliculas where id_usuario = " + id +";");
            while (rs.next()){
                peliculas.add(new Pelicula(
                        rs.getInt("id_pelicula"),
                        rs.getString("nombre"),
                        rs.getInt("duracion")
                ));
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return peliculas;
    }

    @Override
    public List<Pelicula> save(Integer id, String nombre, Integer duracion) {
        return null;
    }

    @Override
    public List<Pelicula> update(Integer id, String nombre) {
        return null;
    }

    @Override
    public List<Pelicula> delete(Integer id, String nombre) {
        return null;
    }
}
