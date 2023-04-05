package com.example.lab2.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "proveedores")
public class Proveedores {

    @Id
    @Column (name = "idProveedores", nullable = false)
    private Integer id;

    @Column (name = "Nombre")
    private String nombre;

    @Column (name = "Telefono", length = 9)
    private String telefono;

    @Column (name = "Elemento")
    private String elemento;
}
