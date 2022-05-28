package com.gurbani.portfolio.controller;

import com.gurbani.portfolio.model.Experiencia;
import com.gurbani.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "https://gurbaniportfolio.web.app:4200")
@CrossOrigin(origins = "http://192.168.0.20:4200")

public class ExperienciaController {

    @Autowired
    private ExperienciaRepository repository;
// lista experiencia
    @GetMapping("/experiencia")
    public List<Experiencia> verExperiencia() {
        return repository.findAll();
    }
 // guarda Experiencia 
    @PostMapping("/experiencia")
    public Experiencia agregarExperiencia(@RequestBody Experiencia exp){
        return repository.save(exp);
    }

}
 