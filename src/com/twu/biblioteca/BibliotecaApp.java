package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        BookList bookList = new BookList();

        System.out.println("Hello, world!");
        System.out.println("Please chose an option: 1: List Books 2: quit");

        Scanner input=new Scanner(System.in);
        int stb=input.nextInt();
        while (stb != 2) {
            if(stb != 1) {
                System.out.println("Select a vaild option!");
            }
            else {
                System.out.println("the book list is:");
                bookList.listBooks();
                System.out.println("2: quit");
                System.out.println("3: checkout book");
                System.out.println("4: return book");
                stb=input.nextInt();
                if(stb ==2){
                    return;
                }
                if(stb == 3) {
                    System.out.println("Please input the book number you want to checkout");
                    stb=input.nextInt();
                    if (bookList.checkoutBook(stb) == true) {
                        System.out.println("Thank you! Enjoy the book");
                    } else {
                        System.out.println("The book is not available");
                    }
                }
                if(stb ==4) {
                    System.out.println("Please input the book number you want to return");
                    stb=input.nextInt();
                    if (bookList.returnBook(stb) == true) {
                        System.out.println("Thank you for returning the book");
                    } else {
                        System.out.println("That is not a valid boo to return");
                    }
                }

            }
            System.out.println("Please chose an option: 1: List Books 2: quit");
            stb=input.nextInt();
        }

    }
}
