package com.example.restservice;

public class Languages {
    private long id;
    private String name;

    public Languages(long _id, String _name) {
        this.id = _id;
        this.name = _name;

    }

    public String getLanguage() {
        return name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLanguage(String name) {
        this.name = name;
    }
}
