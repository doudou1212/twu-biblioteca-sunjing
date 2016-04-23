package com.twu.biblioteca;

/**
 * Created by sunjing on 4/23/16.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {
    @Test
    public void test() {
        Book book = new Book("doudou", "2016-04");
        assertEquals("doudou", book.getName());
        assertEquals("2016-04", book.getYear_published());

        book.setName("sunjing");
        assertEquals("sunjing", book.getName());

        book.setYear_published("2016-05");
        assertEquals("2016-05",book.getYear_published());

        book.setIscheckout(true);
        assertEquals(true,book.ischeckout());
    }
}
