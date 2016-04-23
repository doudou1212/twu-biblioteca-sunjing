package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 4/23/16.
 */
public class TestMovieList {
    @Test
    public void testCheckoutMovie() {
        MovieList movieList = new MovieList();
        assertEquals(true,movieList.checkoutMovie(1));
        assertEquals(false,movieList.checkoutMovie(10));
    }

    @Test
    public void testReturnBook() {
        MovieList movieList = new MovieList();
        assertEquals(true, movieList.returnMovie(1));
        assertEquals(false, movieList.returnMovie(10));
    }
}
