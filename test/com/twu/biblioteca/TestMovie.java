package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 4/23/16.
 */
public class TestMovie {
    @Test
    public void test() {
        Movie movie = new Movie("Brave Rabbit 2 Crazy Circus", "2010", "Zeng Xian Lin", "5");
        assertEquals("Brave Rabbit 2 Crazy Circus", movie.getName());
        assertEquals("2010", movie.getYear());
        assertEquals("Zeng Xian Lin", movie.getDirector());
        assertEquals("5", movie.getRating());

        movie.setName("sunjing");
        assertEquals("sunjing", movie.getName());

        movie.setYear("2016");
        assertEquals("2016",movie.getYear());

        movie.setDirector("sunjing");
        assertEquals("sunjing", movie.getDirector());

        movie.setIscheckout(true);
        assertEquals(true,movie.ischeckout());
    }
}
