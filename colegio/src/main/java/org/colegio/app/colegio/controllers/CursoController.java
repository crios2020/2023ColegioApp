package org.colegio.app.colegio.controllers;

import org.colegio.app.colegio.entities.Curso;
import org.colegio.app.colegio.enums.Dia;
import org.colegio.app.colegio.enums.Turno;
import org.colegio.app.colegio.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CursoController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/testCursos")
    public String getCurso(){
        Curso curso=new Curso("Java","Rios",Dia.LUNES,Turno.MAÑANA);    
        cursoRepository.save(curso);
        System.out.println(curso);
        System.out.println("*********************************************************");
        cursoRepository.findAll().forEach(System.out::println);
        return "testCursos";
    }
}
