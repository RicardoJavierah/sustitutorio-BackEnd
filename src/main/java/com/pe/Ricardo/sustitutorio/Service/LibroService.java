package com.pe.Ricardo.sustitutorio.Service;

import com.pe.Ricardo.sustitutorio.Model.bd.Libro;
import com.pe.Ricardo.sustitutorio.Repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService implements ILibroService{

    @Autowired
    LibroRepository libroRepository;

    @Override
    public List<Libro> getLibros() {
        return libroRepository.findAll();
    }

    @Override
    public void createLibro(Libro libro) {
        libroRepository.save(libro);
    }

    @Override
    public void updateLibro(int id, Libro libro) {

        Libro libroFromDB =  libroRepository.findById(id).orElse(null);
        libroFromDB.setTitulo(libro.getTitulo());
        libroFromDB.setPrecio(libro.getPrecio());
        libroFromDB.setCantejemplares(libro.getCantejemplares());
        libroFromDB.setOrigen(libro.getOrigen());
        //falta configurar para actualizar el tema
        //libroFromDB.setTema(libro.getTema());

        libroRepository.save(libroFromDB);
    }

    @Override
    public void deleteLibro(int id) {
        Libro libroFromDB = libroRepository.findById(id).orElse(null);
        libroRepository.delete(libroFromDB);
    }
}
