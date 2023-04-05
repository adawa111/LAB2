package com.example.lab2.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Proveedores {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idProveedores")
    private int idProveedores;
    @Basic
    @Column(name = "Nombre")
    private String nombre;
    @Basic
    @Column(name = "Telefono")
    private Integer telefono;
    @Basic
    @Column(name = "Elemento")
    private String elemento;

    public int getIdProveedores() {
        return idProveedores;
    }

    public void setIdProveedores(int idProveedores) {
        this.idProveedores = idProveedores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Proveedores that = (Proveedores) o;
        return idProveedores == that.idProveedores && Objects.equals(nombre, that.nombre) && Objects.equals(telefono, that.telefono) && Objects.equals(elemento, that.elemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProveedores, nombre, telefono, elemento);
    }
}
