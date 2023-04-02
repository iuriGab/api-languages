package br.com.alura.apilanguages;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mainsLanguages")
public class Languages {
    
    @Id
    private String id;
    private String title;
    private String image;
    private String ranking;
    
    
    public Languages(String title, String image, String ranking) {
        this.title = title;
        this.image = image;
        this.ranking = ranking;
    }
    
    public String getId() {
        return id;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }
    
    public void setRanking(String ranking) {
        this.ranking = ranking;
    }
    
    public String getRanking() {
        return ranking;
    }

}
