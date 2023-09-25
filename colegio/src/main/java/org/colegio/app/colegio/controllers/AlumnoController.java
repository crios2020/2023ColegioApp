package org.colegio.app.colegio.controllers;

import org.colegio.app.colegio.entities.Alumno;
import org.colegio.app.colegio.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlumnoController {
    
    @Autowired
    private AlumnoRepository alumnoRepository;

    @GetMapping("/testAlumnos")
    public String getTestCurso(){
        Alumno alumno=new Alumno("Julia","Gomez",24,2);    
        System.out.println("*********************************************************");
        alumnoRepository.save(alumno);
        System.out.println(alumno);
        System.out.println("*********************************************************");
        alumnoRepository.findAll().forEach(System.out::println);
        return "testAlumnos";
    }
}
