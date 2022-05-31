
package com.gurbani.portfolio.service;

import com.gurbani.portfolio.model.Education;
import com.gurbani.portfolio.repository.EducationRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationService {
    @Autowired
    private EducationRepository educationRepo;
    
    public Education crearEducation(Education ed){
        return educationRepo.save(ed);
    }
    public void editEducation(Education ed){
                educationRepo.save(ed);
    }
    public void deleteEducation(Long id){
        educationRepo.deleteById(id);
    }
    
    public List<Education>verEducation(){
        return educationRepo.findAll();
    }
    public Optional<Education> buscarEducationPorId(Long id){
        return educationRepo.findById(id);
    }
    
}
