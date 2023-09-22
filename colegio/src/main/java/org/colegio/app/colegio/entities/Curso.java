package org.colegio.app.colegio.entities;

import java.io.Serializable;
import org.colegio.app.colegio.enums.Dia;
import org.colegio.app.colegio.enums.Estado;
import org.colegio.app.colegio.enums.Turno;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cursos")
public class Curso implements Serializable{

    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    private String titulo;
    
    private String profesor;
    
    @Enumerated(value = EnumType.STRING)
    private Dia dia;
    
    @Enumerated(value = EnumType.STRING)
    private Turno turno;
    
    @Enumerated(value = EnumType.STRING)
    private Estado estado;
    
    public Curso() {
    }

    public Curso(String titulo, String profesor, Dia dia, Turno turno, Estado estado) {
        this.titulo = titulo;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
        this.estado = estado;
    }

    public Curso(String titulo, String profesor, Dia dia, Turno turno) {
        this.titulo = titulo;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
        this.estado = Estado.ACTIVO;
    }

    public Curso(Long id, String titulo, String profesor, Dia dia, Turno turno, Estado estado) {
        this.id = id;
        this.titulo = titulo;
        this.profesor = profesor;
        this.dia = dia;
        this.turno = turno;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Curso [id=" + id + ", titulo=" + titulo + ", profesor=" + profesor + ", dia=" + dia + ", turno=" + turno
                + ", estado=" + estado + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}
