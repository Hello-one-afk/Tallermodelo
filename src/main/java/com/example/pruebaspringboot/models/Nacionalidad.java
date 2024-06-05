package com.example.pruebaspringboot.models;


import java.util.concurrent.CountedCompleter;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "nacionalidad")
public class Nacionalidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private int id_nacionalidad;

    @SuppressWarnings("rawtypes")
    @Column(nullable = false)
    private Enum nombre;



    @OneToOne(mappedBy = "nacionalidad")
    private Rival rival;

    @OneToOne(mappedBy = "nacionalidad")
     private Counter counter;



}
