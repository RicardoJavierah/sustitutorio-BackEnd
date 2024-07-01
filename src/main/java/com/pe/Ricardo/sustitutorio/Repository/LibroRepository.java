package com.pe.Ricardo.sustitutorio.Repository;

import com.pe.Ricardo.sustitutorio.Model.bd.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro,Integer> {

}
