package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by sunjing on 4/23/16.
 */
public class TestBookList {

    @Test
    public void testCheckoutBook() {
        BookList bookList = new BookList();
        assertEquals(true,bookList.checkoutBook(1));
        assertEquals(false,bookList.checkoutBook(10));
    }

    @Test
    public void testReturnBook() {
        BookList bookList = new BookList();
        assertEquals(true, bookList.returnBook(1));
        assertEquals(false, bookList.returnBook(10));
    }
}
