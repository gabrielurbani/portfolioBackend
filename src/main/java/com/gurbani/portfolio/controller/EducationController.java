
package com.gurbani.portfolio.controller;
import com.gurbani.portfolio.model.Education;
import com.gurbani.portfolio.service.EducationService;
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

public class EducationController {

    @Autowired
   EducationService educationService;
    @GetMapping("/education")
    @ResponseBody
    public List<Education> verEducation() {
        return educationService.verEducation();
    }  

    @PostMapping("/education")
    @ResponseBody
    public Education crearEducation(@RequestBody Education ed) {
        return educationService.crearEducation(ed);
    }
     @GetMapping("/education/{id}")
    @ResponseBody
    public Optional<Education> buscarEducationPorId(@PathVariable Long id){
        return educationService.buscarEducationPorId(id);
    }

    @PutMapping("/education")
    public void editEducation(@RequestBody Education ed){
        educationService.editEducation(ed);
    }
    
    
    @DeleteMapping("/education/{id}")
    public void deleteEducation(@PathVariable Long id){
        educationService.deleteEducation(id);
    }

}

   