package br.com.alura.apilanguages;

import org.springframework.data.annotation.Id;

// @Document(name = "")
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

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public String getRanking() {
        return ranking;
    }

}
