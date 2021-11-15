package ru.netology.domain;

public class MovieItem {
    private int id;
    private String nameUrl;
    private String genre;
    private String image;

    public MovieItem(int id, String nameUrl, String genre, String image) {
        this.id = id;
        this.nameUrl = nameUrl;
        this.genre = genre;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameUrl() {
        return nameUrl;
    }

    public void setNameUrl(String nameUrl) {
        this.nameUrl = nameUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

