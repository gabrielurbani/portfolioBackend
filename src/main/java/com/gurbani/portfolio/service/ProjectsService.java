
package com.gurbani.portfolio.service;

import com.gurbani.portfolio.model.Projects;
import com.gurbani.portfolio.repository.ProjectsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectsService {
    @Autowired
    private ProjectsRepository projectsRepo;
    
    public void crearProjects(Projects proj){
        projectsRepo.save(proj);
    }
    public void editProjects(Projects proj){
        projectsRepo.save(proj);
    }
    public void deleteProjects(Long id){
        projectsRepo.deleteById(id);
    }
    
    public List<Projects>verProjects(){
        return projectsRepo.findAll();
    }
    public Optional<Projects> buscarProjectsPorId(Long id){
        return projectsRepo.findById(id);
    }
    
}
