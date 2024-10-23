package com.example.Proyecto.Servicio;

import com.example.Proyecto.Modelo.Materias;
import com.example.Proyecto.Repositorio.MateriaRepositorio;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MateriaServicio {

    private final MateriaRepositorio materiaRepository;

    public MateriaServicio(MateriaRepositorio materiaRepository) {
        this.materiaRepository = materiaRepository;
    }

    // Guardar o actualizar Materia
    public Materias guardar(Materias materia) {
        return materiaRepository.save(materia);
    }

    // Buscar Materia por ID
    public Optional<Materias> obtenerTodo(Long id) {
        return materiaRepository.findById(id);
    }

    // Eliminar Materia por ID
    public void eliminar(Long id) {
        materiaRepository.deleteById(id);
    }
}
