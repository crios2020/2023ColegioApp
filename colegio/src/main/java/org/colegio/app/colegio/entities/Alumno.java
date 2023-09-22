package org.colegio.app.colegio.entities;

import java.io.Serializable;
import org.colegio.app.colegio.enums.Estado;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno implements Serializable {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    private String nombre;

    private String apellido;

    private Integer edad;

    private Integer id_curso;

    @Enumerated(value = EnumType.STRING)
    private Estado estado;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, Integer edad, Integer id_curso, Estado estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id_curso = id_curso;
        this.estado = estado;
    }

    

    public Alumno(String nombre, String apellido, Integer edad, Integer id_curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id_curso = id_curso;
        this.estado = Estado.ACTIVO;
    }

    public Alumno(Long id, String nombre, String apellido, Integer edad, Integer id_curso, Estado estado) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.id_curso = id_curso;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Alumno [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", id_curso="
                + id_curso + ", estado=" + estado + "]";
    }

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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getId_curso() {
        return id_curso;
    }

    public void setId_curso(Integer id_curso) {
        this.id_curso = id_curso;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
