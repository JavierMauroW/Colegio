package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Materias;
import com.example.Proyecto.Servicio.MateriaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/materias")
public class MateriaControlador {

    private final MateriaServicio materiaServicio;

    public MateriaControlador(MateriaServicio materiaServicio) {
        this.materiaServicio = materiaServicio;
    }


    @PostMapping("/Guardar")
    public Materias guardar(@RequestBody Materias materia) {
        return materiaServicio.guardar(materia);
    }


    @GetMapping("/{id}")
    public Optional<Materias> obtenerPorId(@PathVariable Long id) {
        return materiaServicio.obtenerTodo(id);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        materiaServicio.eliminar(id);
    }
}
