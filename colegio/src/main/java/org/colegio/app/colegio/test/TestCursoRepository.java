package org.colegio.app.colegio.test;

import org.colegio.app.colegio.entities.Curso;
import org.colegio.app.colegio.enums.Dia;
import org.colegio.app.colegio.enums.Turno;
import org.colegio.app.colegio.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class TestCursoRepository implements CommandLineRunner {

    @Autowired
    private CursoRepository cursoRepository;
    public static void main(String[] args) {
           SpringApplication.run(TestCursoRepository.class, args);
    }
 
    @Override
    public void run(String... args) throws Exception {
        Curso curso=new Curso("Java","Rios",Dia.LUNES,Turno.MAÑANA);    
        cursoRepository.save(curso);
        System.out.println(curso);
        System.out.println("*********************************************************");
        cursoRepository.findAll().forEach(System.out::println);
    }
}
