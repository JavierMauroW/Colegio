package com.example.Proyecto.Repositorio;

import com.example.Proyecto.Modelo.Grados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradoRepositorio extends JpaRepository<Grados, Long> {
}
