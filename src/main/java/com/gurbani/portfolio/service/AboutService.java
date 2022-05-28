package com.gurbani.portfolio.service;

import com.gurbani.portfolio.model.About;
import com.gurbani.portfolio.repository.AboutRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    @Autowired
    private AboutRepository aboutRepo;

    public List<About> verAbout() {
        return aboutRepo.findAll();
    }

    public void editAbout(About ab) {
        aboutRepo.save(ab);
    }

    public Optional<About> buscarAboutPorId(Long id) {
        return aboutRepo.findById(id);
    }
}
