
package com.gurbani.portfolio.service;

import com.gurbani.portfolio.model.Experiencia;
import com.gurbani.portfolio.repository.ExperienciaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    @Autowired
    private ExperienciaRepository experienciaRepo;
    
    public Experiencia crearExperiencia(Experiencia exp){
        return experienciaRepo.save(exp);
    }
    public void editExperiencia(Experiencia exp){
                experienciaRepo.save(exp);
    }
    public void deleteExperiencia(Long id){
        experienciaRepo.deleteById(id);
    }
    
    public List<Experiencia>verExperiencia(){
        return experienciaRepo.findAll();
    }
    public Optional<Experiencia> buscarExperienciaPorId(Long id){
        return experienciaRepo.findById(id);
    }
    
}
