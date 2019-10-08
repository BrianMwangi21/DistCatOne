package com.kabiru.alpha.models;

public class Movie {

    private int id, movie_length;
    private String name, type, company;
    private User create_user;
    private Category category;

    public Movie() {
        // Empty constructor
    }

    public Movie(int id, int movie_length, String name, String type, String company, User create_user, Category category ) {
        this.id = id;
        this.movie_length = movie_length;
        this.name = name;
        this.type = type;
        this.company = company;
        this.create_user = create_user;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMovie_length() {
        return movie_length;
    }

    public void setMovie_length(int movie_length) {
        this.movie_length = movie_length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public User getCreate_user() {
        return create_user;
    }

    public void setCreate_user(User create_user) {
        this.create_user = create_user;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", movie_length=" + movie_length +
                ", name='" + name + '\'' +
                ", category='" + category.toString() + '\'' +
                ", type='" + type + '\'' +
                ", company='" + company + '\'' +
                ", create_user=" + create_user.toString() +
                '}';
    }
}
