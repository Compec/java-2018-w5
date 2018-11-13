package com.company;

import java.util.ArrayList;

public class Library {

    public String name;
    public ArrayList<Book> books;

    Library(String name) {
        books = new ArrayList<>();
        name = name;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public boolean contains(Book book) {
        return books.contains(book);
    }

    public void displayBooks() {
        if(books.size() == 0) {
            System.out.println(name + " library contains no book :(");
        } else {
            System.out.println(name + " contains " + books.size());
            for(int i = 0; i < books.size(); i++) {
                books.get(i).displayBook();
            }

        }
    }
}
