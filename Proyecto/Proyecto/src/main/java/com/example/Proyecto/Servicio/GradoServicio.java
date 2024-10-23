package com.example.Proyecto.Servicio;

import com.example.Proyecto.Modelo.Grados;
import com.example.Proyecto.Repositorio.GradoRepositorio;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GradoServicio {

    private final GradoRepositorio gradoRepository;

    public GradoServicio(GradoRepositorio gradoRepository) {
        this.gradoRepository = gradoRepository;
    }

    // Guardar o actualizar Grado
    public Grados guardar(Grados grado) {
        return gradoRepository.save(grado);
    }

    // Buscar Grado por ID
    public Optional<Grados> obtenerTodo(Long id) {
        return gradoRepository.findById(id);
    }

    // Eliminar Grado por ID
    public void eliminar(Long id) {
        gradoRepository.deleteById(id);
    }
}
