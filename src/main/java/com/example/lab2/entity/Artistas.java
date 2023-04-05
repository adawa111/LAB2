package com.example.lab2.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
public class Artistas {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idArtistas")
    private int idArtistas;
    @Basic
    @Column(name = "Nombre_Grupo")
    private String nombreGrupo;
    @Basic
    @Column(name = "Fecha_creacion")
    private Date fechaCreacion;
    @Basic
    @Column(name = "Tipo_musica")
    private String tipoMusica;

    public int getIdArtistas() {
        return idArtistas;
    }

    public void setIdArtistas(int idArtistas) {
        this.idArtistas = idArtistas;
    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getTipoMusica() {
        return tipoMusica;
    }

    public void setTipoMusica(String tipoMusica) {
        this.tipoMusica = tipoMusica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artistas artistas = (Artistas) o;
        return idArtistas == artistas.idArtistas && Objects.equals(nombreGrupo, artistas.nombreGrupo) && Objects.equals(fechaCreacion, artistas.fechaCreacion) && Objects.equals(tipoMusica, artistas.tipoMusica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArtistas, nombreGrupo, fechaCreacion, tipoMusica);
    }
}
