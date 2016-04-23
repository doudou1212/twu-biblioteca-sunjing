package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        MovieList movieList = new MovieList();
        User user = new User("sunjing", "doudou","404891954@qq.com","smith street", "1509182408");
        UserAccount userAccount = new UserAccount();

        System.out.println("Hello, world!");
        System.out.println("Please chose an option: " +
                "1: List Books and Movies " +
                "2: quit " +
                "0: check user info");

        Scanner input=new Scanner(System.in);
        int stb=input.nextInt();
        while (stb != 2) {
            if(stb == 1) {
                System.out.println("the book list is:");
                bookList.listBooks();

                System.out.println("the movie list is:");
                movieList.listMovies();

                System.out.println("2: quit");
                System.out.println("3: checkout book");
                System.out.println("4: return book");
                System.out.println("5: checkout movie");
                System.out.println("6: return movie");
                stb=input.nextInt();
                if(stb ==2){
                    return;
                }
                if(stb == 3) {
                    System.out.println("Please input the book number you want to checkout");
                    stb=input.nextInt();
                    if(user.getIslogin() != true){
                        input.nextLine();
                        System.out.println("Please Login");
                        System.out.println("library number:");
                        String libraryNumber = input.nextLine();
                        System.out.println("password:");
                        String password = input.nextLine();

                        user.setIslogin(userAccount.login(libraryNumber,password));
                    }

                    if (bookList.checkoutBook(stb) == true) {
                        System.out.println("Thank you! Enjoy the book");
                    } else {
                        System.out.println("The book is not available");
                    }
                }

                if(stb ==4) {
                    System.out.println("Please input the book number you want to return");
                    stb=input.nextInt();
                    if(user.getIslogin() != true){
                        input.nextLine();
                        System.out.println("Please Login");
                        System.out.println("library number:");
                        String libraryNumber = input.nextLine();
                        System.out.println("password:");
                        String password = input.nextLine();

                        user.setIslogin(userAccount.login(libraryNumber,password));
                    }

                    if (bookList.returnBook(stb) == true) {
                        System.out.println("Thank you for returning the book");
                    } else {
                        System.out.println("That is not a valid boo to return");
                    }
                }

                if(stb ==5) {
                    System.out.println("Please input the movie number you want to checkout");
                    stb=input.nextInt();
                    if(user.getIslogin() != true){
                        input.nextLine();
                        System.out.println("Please Login");
                        System.out.println("library number:");
                        String libraryNumber = input.nextLine();
                        System.out.println("password:");
                        String password = input.nextLine();

                        user.setIslogin(userAccount.login(libraryNumber,password));
                    }

                    if (movieList.checkoutMovie(stb) == true) {
                        System.out.println("TThank you! Enjoy the boo");
                    } else {
                        System.out.println("The book is not available");
                    }
                }

                if(stb ==6) {
                    System.out.println("Please input the movie number you want to return");
                    stb=input.nextInt();
                    if(user.getIslogin() != true){
                        input.nextLine();
                        System.out.println("Please Login");
                        System.out.println("library number:");
                        String libraryNumber = input.nextLine();
                        System.out.println("password:");
                        String password = input.nextLine();

                        user.setIslogin(userAccount.login(libraryNumber,password));
                    }

                    if (movieList.returnMovie(stb) == true) {
                        System.out.println("Thank you for returning the book");
                    } else {
                        System.out.println("That is not a valid boo to return");
                    }
                }



            }

            else if (stb == 0 ){
                System.out.println("Your info is: ");
                if(user.getIslogin() != true){
                    System.out.println("Please Login");
                    System.out.println("library number:");
                    String libraryNumber = input.nextLine();
                    System.out.println("password:");
                    String password = input.nextLine();

                    user.setIslogin(userAccount.login(libraryNumber,password));
                }
                System.out.println("name is "+ user.getName() +
                        "library conut is "+user.getLibraryNumber()+
                        "email is "+user.getEmail()+
                        "address is "+user.getAddress()+
                        "phone number is "+user.getPhoneNumber());

            }
            else {
                System.out.println("Select a vaild option!");
            }
            System.out.println("Please chose an option: 1: List Books 2: quit");
            stb=input.nextInt();
        }

    }
}
