package br.com.alura.apilanguages;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private RepositoryLanguages repository;

    @GetMapping("/languages")
    public List<Languages> getLanguages() {
        List<Languages> languages = repository.findAll();
        return languages;
    }

    @PostMapping("/languages")
    public Languages addLanguage(@RequestBody Languages language) {
        return repository.save(language);
    }
}
