package com.sau.voting.Model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

public class Product {
    private int id;
    private String name;
    private String description;
    private String figUrl;
    private int like;
    private int dislike;

    public Product() {
    }

    public Product(int id, String name, String description, String figUrl, int like, int dislike) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.figUrl = figUrl;
        this.like = like;
        this.dislike = dislike;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFigUrl() {
        return figUrl;
    }

    public void setFigUrl(String figUrl) {
        this.figUrl = figUrl;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getDislike() {
        return dislike;
    }

    public void setDislike(int dislike) {
        this.dislike = dislike;
    }
}
