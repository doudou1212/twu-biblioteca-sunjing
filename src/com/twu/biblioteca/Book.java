package com.twu.biblioteca;

/**
 * Created by sunjing on 4/23/16.
 */
public class Book {
    private String name;
    private String year_published;
    private boolean ischeckout = false;

    public Book(String name, String year_published) {
        this.name = name;
        this.year_published = year_published;
    }

    public String getName() {
        return name;
    }

    public String getYear_published() {
        return year_published;
    }

    public boolean ischeckout() {
        return ischeckout;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear_published(String year_published) {
        this.year_published = year_published;
    }

    public void setIscheckout(boolean ischeckout) {
        this.ischeckout = ischeckout;
    }
}
