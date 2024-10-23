package com.example.Proyecto.Modelo;

import jakarta.persistence.*;

@Entity
public class Materias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiantes estudiante;

    // Constructor vacío
    public Materias() {}

    // Constructor lleno
    public Materias(Long id, String nombre, Estudiantes estudiante) {
        this.id = id;
        this.nombre = nombre;
        this.estudiante = estudiante;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    // Método toString
    @Override
    public String toString() {
        return "Materia{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", estudiante=" + estudiante +
                '}';
    }
}
