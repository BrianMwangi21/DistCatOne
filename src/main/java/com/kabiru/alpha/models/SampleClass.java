package com.kabiru.alpha.models;

public class SampleClass {

    private long id;
    private String username;

    public SampleClass() {
        // Empty constructor
    }

    public SampleClass(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "SampleClass{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }
}
