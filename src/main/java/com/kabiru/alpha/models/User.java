package com.kabiru.alpha.models;

public class User {

    private int id, tag_id;
    private String fullnames;

    public User() {
        // Empty constructor
    }

    public User(int id, String fullnames) {
        this.id = id;
        this.fullnames = fullnames;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullnames() {
        return fullnames;
    }

    public void setFullnames(String fullnames) {
        this.fullnames = fullnames;
    }

    public int getTag_id() {
        return tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullnames='" + fullnames + '\'' +
                '}';
    }
}
