package com.example.pruebaspringboot.models;

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
@Table(name = "campeon")
public class Campeon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private int id_campeon;

    @Column(nullable = false, length = 15)
    private String tipo_ataque;

    @Column(nullable = false)
    private int vida_base;

    @Column(nullable = false)
    private byte mana_bool; 

    @Column(nullable = false)
    private byte energia_bool;
    @Column(nullable = false)
    private float velocidad_ataque_base;
    @Column(nullable = false)
    private int velocidad_movimiento_base;
    @Column(nullable = false , length = 70)
    private String nombre;


    /*
     * add cosas rojas 
     */

    /*  @OneToOne(mappedBy = "campeon")
     private Nacionalidad nacionalidad;

     @OneToOne(mappedBy = "campeon")
     private Campeon campeon;



    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nacionalidad_id_nacionalidad", referencedColumnName = "id", nullable = false)
    private Rival rival;
     
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "especie_id_especie", referencedColumnName = "id", nullable = false)
    private Especie especie;
    */
}
