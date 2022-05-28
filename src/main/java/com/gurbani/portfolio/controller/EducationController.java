
package com.gurbani.portfolio.controller;

import com.gurbani.portfolio.model.Education;
import com.gurbani.portfolio.repository.EducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://gurbaniportfolio.web.app")
//@CrossOrigin(origins = "http://192.168.0.20:4200")

public class EducationController {
    
    @Autowired
    private EducationRepository repository;

    @GetMapping("/education")
    public List<Education> verEducacion() {
        return repository.findAll();
    
    }
}
