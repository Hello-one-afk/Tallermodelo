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
@Table(name = "rival")
public class Rival {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id_rival;

    @Column(length = 75 , nullable = false )
    private String nombre;

    /*
     * FALTA ADD COSAS ROJAS 
     */



     
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "nacionalidad_id_nacionalidad", referencedColumnName = "id", nullable = false)
    private Nacionalidad nacionalidad;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "especie_id_especie", referencedColumnName = "id", nullable = false)
    private Especie especie;

    
/*@OneToOne(mappedBy = "rival")
     private Nacionalidad nacionalidad;

     @OneToOne(mappedBy = "rival")
     private Especie especie;
*/
}
