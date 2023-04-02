package br.com.alura.apilanguages;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
    public ResponseEntity<Languages> addLanguage(@RequestBody Languages language) {
        Languages newLanguage = repository.save(language);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newLanguage.getId())
                .toUri();
        return ResponseEntity.created(uri).body(newLanguage);
    }

    @PutMapping("/languages/{id}")
    public Languages updateLanguage(@PathVariable String id, @RequestBody Languages newLanguage) {
        Languages language = repository.findById(id).get();
        language.setTitle(newLanguage.getTitle());
        language.setImage(newLanguage.getImage());
        language.setRanking(newLanguage.getRanking());
        return repository.save(language);
    }

    @DeleteMapping("/languages/{id}")
        public void deleteLanguage(@PathVariable String id) {
            repository.deleteById(id);
        }

}
