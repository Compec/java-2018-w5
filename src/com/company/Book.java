package com.company;

public class Book {
    private String name;
    private String author;

    Book(String _name, String _author) {
        name = _name;
        author = _author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void displayBook() {
        System.out.println(name + " by " + author);
    }


}
