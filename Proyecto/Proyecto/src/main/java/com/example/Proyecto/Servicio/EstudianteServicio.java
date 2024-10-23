package com.example.Proyecto.Servicio;

import com.example.Proyecto.Modelo.Estudiantes;
import com.example.Proyecto.Repositorio.EstudianteRepositorio;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EstudianteServicio {

    private final EstudianteRepositorio estudianteRepository;

    public EstudianteServicio(EstudianteRepositorio estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    // Guardar o actualizar Estudiante
    public Estudiantes guardar(Estudiantes estudiante) {
        return estudianteRepository.save(estudiante);
    }

    // Buscar Estudiante por ID
    public Optional<Estudiantes> obtenerTodo(Long id) {
        return estudianteRepository.findById(id);
    }

    // Eliminar Estudiante por ID
    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }
}
