package com.twu.biblioteca;

/**
 * Created by sunjing on 4/23/16.
 */
public class Movie {
    private String name;
    private String year;
    private String director;
    private String rating;
    private boolean ischeckout = false;

    public Movie(String name, String year, String director, String rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRatint(String rating) {
        this.rating = rating;
    }

    public boolean ischeckout() {
        return ischeckout;
    }

    public void setIscheckout(boolean ischeckout) {
        this.ischeckout = ischeckout;
    }
}
