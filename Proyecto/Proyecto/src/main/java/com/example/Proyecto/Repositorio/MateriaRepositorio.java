package com.example.Proyecto.Repositorio;

import com.example.Proyecto.Modelo.Materias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepositorio extends JpaRepository<Materias, Long> {
}
