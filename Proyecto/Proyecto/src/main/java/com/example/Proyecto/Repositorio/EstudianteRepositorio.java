package com.example.Proyecto.Repositorio;

import com.example.Proyecto.Modelo.Estudiantes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepositorio extends JpaRepository<Estudiantes, Long> {
}
