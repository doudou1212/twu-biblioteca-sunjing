package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sunjing on 4/23/16.
 */
public class BookList {
    private List<Book> bookList = new ArrayList<Book>();

    public BookList() {
        Book book = new Book("A Ghost Story", "1999-08");
        this.bookList.add(book);
        book = new Book("A House to Let", "1999-10");
        this.bookList.add(book);
        book = new Book("A Message From the Sea", "1979-03");
        this.bookList.add(book);
        book = new Book("A New Crime", "2001-07");
        this.bookList.add(book);
        book = new Book("Adventure", "2003-08");
        this.bookList.add(book);
        book = new Book("Allan Poe's Story", "2010-09");
        this.bookList.add(book);
    }

    public void listBooks() {
        for (int i=0; i<this.bookList.size(); i++ ){
            if(this.bookList.get(i).ischeckout() == false) {
                System.out.println("No: "+i+
                        " Book Name: " + this.bookList.get(i).getName() +
                        " Published Year: " + this.bookList.get(i).getYear_published() +
                        " is check out: " + this.bookList.get(i).ischeckout());
            }
        }
    }

    public boolean checkoutBook(int index) {
        if(index >= this.bookList.size()){
            return false;
        }
        this.bookList.get(index).setIscheckout(true);
        return true;
    }

    public boolean returnBook(int index) {
        if(index >= this.bookList.size()){
            return false;
        }
        this.bookList.get(index).setIscheckout(false);
        return true;
    }
}
