package com.example.Proyecto.Controlador;

import com.example.Proyecto.Modelo.Grados;
import com.example.Proyecto.Servicio.GradoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/grados")
public class GradoControlador {

    private final GradoServicio gradoServicio;

    public GradoControlador(GradoServicio gradoServicio) {
        this.gradoServicio = gradoServicio;
    }


    @PostMapping("/Guardar")
    public Grados guardar(@RequestBody Grados grado) {
        return gradoServicio.guardar(grado);
    }


    @GetMapping("/{id}")
    public Optional<Grados> obtenerPorId(@PathVariable Long id) {
        return gradoServicio.obtenerTodo(id);
    }


    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        gradoServicio.eliminar(id);
    }
}
