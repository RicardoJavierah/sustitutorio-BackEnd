package com.pe.Ricardo.sustitutorio.Service;

import com.pe.Ricardo.sustitutorio.Model.bd.Libro;

import java.util.List;

public interface ILibroService {
    List<Libro> getLibros();
    void createLibro(Libro libro);
    void updateLibro(int id, Libro libro);
    void deleteLibro(int id);
}
