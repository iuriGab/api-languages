package br.com.alura.apilanguages;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    private List<Languages> languages = List.of(
        new Languages("java", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png", "1"),
        new Languages("javascript", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png", "2"),
        new Languages("python", "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png", "3")
    );

    @GetMapping(value = "/languages")
    public List<Languages> getLanguages() {
        return languages;
    }
}
