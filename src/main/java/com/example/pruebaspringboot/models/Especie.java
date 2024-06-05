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
@Table(name = "especie")
public class Especie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id" , nullable = false)
    private int id_especie;


    @SuppressWarnings("rawtypes")
    @Column(nullable = false)
    private Enum nombrEnum;

     
    @OneToOne(mappedBy = "especie")
    private Rival rival;

}
