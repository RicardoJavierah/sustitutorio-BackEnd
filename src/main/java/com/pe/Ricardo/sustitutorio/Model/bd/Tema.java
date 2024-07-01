package com.pe.Ricardo.sustitutorio.Model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_tema")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Tema {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idtema")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;

    /*
    * CREATE TABLE tb_tema (
    idtema INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(45) NOT NULL
);*/
}
