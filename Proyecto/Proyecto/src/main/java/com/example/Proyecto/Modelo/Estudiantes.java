package com.example.Proyecto.Modelo;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Estudiantes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String apellido;
    private String correo;

    @OneToMany(mappedBy = "estudiante")
    private List<Materias> materias;

    @OneToOne
    @JoinColumn(name = "grado_id")
    private Grados grado;

    // Constructor vacío
    public Estudiantes() {}

    // Constructor lleno
    public Estudiantes(Long id, String nombre, String apellido, String correo, List<Materias> materias, Grados grado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.materias = materias;
        this.grado = grado;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materias> materias) {
        this.materias = materias;
    }

    public Grados getGrado() {
        return grado;
    }

    public void setGrado(Grados grado) {
        this.grado = grado;
    }

    // Método toString
    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", correo='" + correo + '\'' +
                ", grado=" + grado +
                ", materias=" + materias +
                '}';
    }
}
