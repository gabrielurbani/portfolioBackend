package com.gurbani.portfolio.controller;

import com.gurbani.portfolio.model.About;
import com.gurbani.portfolio.service.AboutService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"https://gurbaniportfolio.web.app"})
public class AboutController {

    @Autowired
    AboutService aboutService;
    
    @GetMapping("/about")
    @ResponseBody
    public List<About> verAbout() {
        return aboutService.verAbout();
    }

    @PutMapping("/about")
    public void editAbout(@RequestBody About ab) {
        aboutService.editAbout(ab);
    }

    @GetMapping("/about/{id}")
    @ResponseBody
    public Optional<About> buscarAboutPorId(@PathVariable Long id) {
        return aboutService.buscarAboutPorId(id);
    }
}
