package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunjing on 4/23/16.
 */
public class MovieList {
    private List<Movie> movieList = new ArrayList<Movie>();

    public MovieList() {
        Movie movie = new Movie("Brave Rabbit 2 Crazy Circus", "2010", "Zeng Xian Lin", "5");
        this.movieList.add(movie);
        movie = new Movie("Miss Granny", "2014", "Chen Zheng Dao", "unrated");
        this.movieList.add(movie);
    }


    public void listBooks() {
        for (int i=0; i<this.movieList.size(); i++ ){
            if(this.movieList.get(i).ischeckout() == false) {
                System.out.println("No: "+i+
                        " Movie Name: " + this.movieList.get(i).getName() +
                        " Year: " + this.movieList.get(i).getYear() +
                        " Director: " + this.movieList.get(i).getDirector() +
                        " Rating: " + this.movieList.get(i).getRating() +
                        " is check out: " + this.movieList.get(i).ischeckout());
            }
        }
    }

    public boolean checkoutMovie(int index) {
        if(index >= this.movieList.size()){
            return false;
        }
        this.movieList.get(index).setIscheckout(true);
        return true;
    }

    public boolean returnMovie(int index) {
        if(index >= this.movieList.size()){
            return false;
        }
        this.movieList.get(index).setIscheckout(false);
        return true;
    }
}
