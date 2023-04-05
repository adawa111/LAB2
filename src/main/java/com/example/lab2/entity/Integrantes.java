package com.example.lab2.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Integrantes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idIntegrantes")
    private int idIntegrantes;
    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Edad")
    private Integer edad;
    @Basic
    @Column(name = "Anhios_exp")
    private Integer anhiosExp;
    @Basic
    @Column(name = "rol")
    private String rol;
    @Basic
    @Column(name = "artistas_idArtistas")
    private int artistasIdArtistas;

    public int getIdIntegrantes() {
        return idIntegrantes;
    }

    public void setIdIntegrantes(int idIntegrantes) {
        this.idIntegrantes = idIntegrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getAnhiosExp() {
        return anhiosExp;
    }

    public void setAnhiosExp(Integer anhiosExp) {
        this.anhiosExp = anhiosExp;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getArtistasIdArtistas() {
        return artistasIdArtistas;
    }

    public void setArtistasIdArtistas(int artistasIdArtistas) {
        this.artistasIdArtistas = artistasIdArtistas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Integrantes that = (Integrantes) o;
        return idIntegrantes == that.idIntegrantes && artistasIdArtistas == that.artistasIdArtistas && Objects.equals(nombre, that.nombre) && Objects.equals(edad, that.edad) && Objects.equals(anhiosExp, that.anhiosExp) && Objects.equals(rol, that.rol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIntegrantes, nombre, edad, anhiosExp, rol, artistasIdArtistas);
    }
}
