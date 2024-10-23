package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Estudiantes;
import com.example.Proyecto.Servicio.EstudianteServicio;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    private final EstudianteServicio estudianteServicio;

    public EstudianteControlador(EstudianteServicio estudianteServicio) {
        this.estudianteServicio = estudianteServicio;
    }


    @PostMapping
    public Estudiantes guardar(@RequestBody Estudiantes estudiante) {
        return estudianteServicio.guardar(estudiante);
    }


    @GetMapping("/{id}")
    public Optional<Estudiantes> obtenerPorId(@PathVariable Long id) {
        return estudianteServicio.obtenerTodo(id);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        estudianteServicio.eliminar(id);
    }
}
