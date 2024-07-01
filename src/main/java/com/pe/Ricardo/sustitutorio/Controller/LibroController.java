package com.pe.Ricardo.sustitutorio.Controller;

import com.pe.Ricardo.sustitutorio.Model.bd.Libro;
import com.pe.Ricardo.sustitutorio.Service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class LibroController {

    @Autowired
    LibroService libroService;
    @RequestMapping(value = "/libro",method = RequestMethod.GET)
    public List<Libro> listLibro(){
        return libroService.getLibros();
    }

    @RequestMapping(value = "/libro/registrar",method = RequestMethod.POST)
    public void createLibro(@RequestBody Libro libro){
        libroService.createLibro(libro);
    }

    @RequestMapping(value = "/libro/actualizar/{id}",method = RequestMethod.PUT)
    public void updateLibro(@PathVariable int id,@RequestBody Libro libro){
        libroService.updateLibro(id,libro);
    }
    @RequestMapping(value = "/libro/eliminar/{id}",method = RequestMethod.DELETE)
    public void deleteLibro(@PathVariable int id){
        libroService.deleteLibro(id);
    }



}
