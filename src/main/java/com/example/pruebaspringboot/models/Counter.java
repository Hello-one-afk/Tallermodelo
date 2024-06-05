package com.example.pruebaspringboot.models;

import javax.print.attribute.standard.MediaSize.NA;

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
@Table(name = "counter")
public class Counter {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_counter;
    
    @Column(length = 70,nullable = false)
    private String nombre;
    @Column(nullable = false)
    private float porcentaje_victoria;
    @Column(nullable = false)
    private float porcentaje_derrota;


    /*
     * add las cosas rojas 
     * 
     */

     @OneToOne(cascade = CascadeType.ALL)
     @JoinColumn(name = "nacionalidad_id_nacionalidad", referencedColumnName = "id", nullable = false)
     private Nacionalidad nacionalidad;

}
