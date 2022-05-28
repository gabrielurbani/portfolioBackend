package com.gurbani.portfolio.controller;

import com.gurbani.portfolio.model.Projects;
import com.gurbani.portfolio.service.ProjectsService;
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
@CrossOrigin(origins = "https://gurbaniportfolio.web.app/")
//@CrossOrigin(origins = "http://192.168.0.20:4200")

public class ProjectsController {

    @Autowired
    ProjectsService projectsService;

    @GetMapping("/projects")
    @ResponseBody
    public List<Projects> verProjects() {
        return projectsService.verProjects();
    }

    @PostMapping("/projects")
    public void  crearProjects(@RequestBody Projects proj) {
        projectsService.crearProjects(proj);
    }
    @PutMapping("/projects")
    public void editProjects(@RequestBody Projects proj){
        projectsService.editProjects(proj);
    }
    @DeleteMapping("/projects/{id}")
    public void deleteProjects(@PathVariable Long id){
        projectsService.deleteProjects(id);
    }
    @GetMapping("/projects/{id}")
    @ResponseBody
    public Optional<Projects> buscarProjectsPorId(@PathVariable Long id){
        return projectsService.buscarProjectsPorId(id);
    }
    
}
