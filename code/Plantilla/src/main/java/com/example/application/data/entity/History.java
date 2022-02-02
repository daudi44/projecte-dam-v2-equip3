package com.example.application.data.entity;

import com.example.application.data.AbstractEntity;
import com.vaadin.flow.component.html.Image;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

public class History extends AbstractEntity{
    @NotEmpty
    private Integer id;

    @NotEmpty
    private String title = "";

    @NotEmpty
    private String author = "";

    @NotEmpty
    private String category = "";

    @NotEmpty
    private Integer img_id;

    public History(Integer id, String title, String author, String category, Integer img_id) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.img_id = img_id;
    }

    public History() {

    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getImg_id() {
        return img_id;
    }

    public void setImg_id(Integer img_id) {
        this.img_id = img_id;
    }
}
