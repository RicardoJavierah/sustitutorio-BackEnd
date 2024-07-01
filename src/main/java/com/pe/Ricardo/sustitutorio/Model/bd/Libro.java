package com.pe.Ricardo.sustitutorio.Model.bd;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idlibro")
    private Integer id;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "precio")
    private double precio;
    @Column(name = "cantejemplares")
    private int cantejemplares;
    @Column(name = "origen")
    private String origen;

    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinColumn(name = "idtema")
    private Tema tema;

    /*
    *CREATE TABLE tb_libro (
    idlibro INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(45) NOT NULL,
    precio DOUBLE,
    cantejemplares INT,
    origen VARCHAR(45),
    idtema INT,
    CONSTRAINT fk_tema FOREIGN KEY (idtema) REFERENCES tb_tema(idtema)
);*/
}
