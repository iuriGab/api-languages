package br.com.alura.apilanguages;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositoryLanguages extends MongoRepository<Languages, String> {
    
}
