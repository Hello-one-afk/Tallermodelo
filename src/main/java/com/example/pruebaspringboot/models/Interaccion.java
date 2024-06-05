package com.example.pruebaspringboot.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "interaccion")
public class Interaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_interacion;

    @Column(length = 45, nullable = false)
    private String nombre_interaccion;
    @Column(nullable = false)
    private int limite_interaccion;
}
