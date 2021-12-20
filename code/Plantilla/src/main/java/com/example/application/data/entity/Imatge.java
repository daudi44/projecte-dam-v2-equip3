package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;
import com.vaadin.flow.component.html.Image;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

@Entity
public class Imatge extends AbstractEntity {

    @NotEmpty
    private Integer id;

    @NotEmpty
    private String title = "";

    @NotEmpty
    private String author = "";

    @NotEmpty
    private String category = "";

    @NotEmpty
    private Image src;

    public Imatge(Integer id, String title, String author, String category, Image src) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.src = src;
    }

    public Imatge() {

    }

    public Image getSrc() {
        return src;
    }

    public void setSrc(Image src) {
        this.src = src;
    }

    public int getIdImg() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTheme() {
        return category;
    }

    public void setTheme(String theme) {
        this.category = theme;
    }
}


