package com.gurbani.portfolio.controller;
import com.gurbani.portfolio.model.Experiencia;
import com.gurbani.portfolio.service.ExperienciaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://gurbaniportfolio.web.app"})
//@CrossOrigin(origins = "http://192.168.0.20:4200")

public class ExperienciaController {

    @Autowired
   ExperienciaService experienciaService;
  
    
    @GetMapping("/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia() {
        return experienciaService.verExperiencia();
    }  

    @PostMapping("/experiencia")
    @ResponseBody
    public Experiencia crearExperiencia(@RequestBody Experiencia exp) {
        return experienciaService.crearExperiencia(exp);
    }
     @GetMapping("/experiencia/{id}")
    @ResponseBody
    public Optional<Experiencia> buscarExperienciaPorId(@PathVariable Long id){
        return experienciaService.buscarExperienciaPorId(id);
    }

    @PutMapping("/experiencia")
    public void editExperiencia(@RequestBody Experiencia exp){
        experienciaService.editExperiencia(exp);
    }
    
    
    @DeleteMapping("/experiencia/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        experienciaService.deleteExperiencia(id);
    }
  
}

   