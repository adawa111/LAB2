package com.example.lab2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "concierto")
public class Concierto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConcierto")
    private int id;
    @Column(name = "Fecha_evento")
    private String fechaEvento;
    @Column(name = "artistas_idArtistas")
    private int artistasId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(String fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    public int getArtistasId() {
        return artistasId;
    }

    public void setArtistasId(int artistasId) {
        this.artistasId = artistasId;
    }
}
