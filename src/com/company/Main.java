package com.company;

import java.util.ArrayList;

public class Main {

    public static void libraryExample() {
        // Create an instance of the class Book.
        // This calls the constructor of Book that we defined in the class
        // It initializes the title and author of the book upon creation
        Book snowBook = new Book("Snow", "Orhan Pamuk");

        // Create an instance of the class Book.
        // This calls the constructor of Book that we defined in the class
        // It initializes the title and author of the book upon creation
        Book _1984Book = new Book("1984", "George Orwell");

        // Displays: Snow by Orhan Pamuk
        snowBook.displayBook();
        // Displays: 1984 by George Orwell
        _1984Book.displayBook();

        // Create an instance of the class Library.
        // This calls the constructor of Library that we defined in the class
        // It initializes the name of the library and an array list that holds the book
        // collection
        Library myLibrary = new Library("Aptullah");

        // Adding a book to the library
        myLibrary.addBook(_1984Book);
        // Check if the snow book exists in that libray
        if (myLibrary.contains(snowBook)) {
            System.out.println("Contains Snow by Orhan Pamuk");
        } else {
            System.out.println("Doesn't contains Snow by Orhan Pamuk"); // <-- this should display
        }

        // Displays all the book collection of this library
        myLibrary.displayBooks();
    }

    public static void animalExample() {
        // Create an instance of the class Animal.
        // Calls the default constructor of Animal
        Animal myAnimal = new Animal();

        // Create an instance of the class Dog, which inherits from Animal
        // Calls the constructor of Dog that we defined in the class
        // It initializes the name of the dog
        Dog myDog = new Dog("Cooper");
        // Makes the dog speak
        myDog.speak();

        // Create an instance of the class Dog, which inherits from Animal
        // Calls the constructor of Dog that we defined in the class
        // It initializes the name of the dog
        Cat myCat = new Cat();
        // Makes the dog speak
        myCat.speak();

        // This is an ArrayList of animals
        // The cool thing about it is that this not only can
        // hold objects of instance Animal
        // but also *anything* that is an animal, such as Cat and Dog
        ArrayList<Animal> myAnimals = new ArrayList<>();
        // Add the dog
        myAnimals.add(myDog);
        // Add the cat
        myAnimals.add(myCat);

        // We are iterating over the animals in the array
        // Run this to notice something ;)
        for (int i = 0; i < myAnimals.size(); i++) {
            myAnimals.get(i).speak();
        }
    }

    public void primitiveVsReferenceTypesExample() {
        // In java there is a distinction between two types
        // Primitive types: Are, as the name suggests, the most basic types in Java
        // Example:
        // - int
        // - boolean
        // - char
        // - float
        // - double
        // - short and many others
        // These primitives types are stored in a special place in memory called the
        // Stack

        // Reference types: are on the other hand, used to store objects. They are more
        // complex because they themselves hold other primitive types or reference
        // types.
        // Example:
        // - String
        // - Scanner
        // - Animal
        // - Animal
        // - Dog
        // - Cat
        // - Pretty much any object in Java
        // Objects are *not* stored in Stack, they are stored in a special place in
        // memory called the Heap. But the reference that points to their address in
        // memory can be stored either in heap or in stack.

        // This is stored in the stack
        int a = 0;

        // the `new Animal()` (actual object) is stored in the Heap but the variable
        // `animal` is actually a reference to that `new Animal()` that is stored in the
        // Stack
        Animal animal = new Animal();
        // but animal.age, although it is a primitive type, it is stored with the `new
        // Animal()` therefore it is also located in the heap

        // This is important because Java is pass-by-value
        // This means that when arguments are passed to methods, they are passed by
        // value. Which means that their values are *copied*

        // here a = 0
        increaseByOne(a);
        // here a is still 0!
        // Because `b` in increaseByOne is a copy of the value of a, therefore we have
        // changed the value of `b` but never actually affected the value of a here

        // here animal.age = 0;
        increaseAnimalAge(animal);
        // here animal.age = 1;
        // Because `animal` stores the reference to the animal object in heap
        // therefore `receivedAnimal` has gotten a copy of the *reference* to animal,
        // NOT the a copy of the object itself
        // therefore changing receivedAnimal.age is the same as changing animal.age

    }

    public static void increaseByOne(int b) {
        b = 2;
    }

    public static void increaseAnimalAge(Animal receivedAnimal) {
        receivedAnimal.age++;
    }

    public static void main(String[] args) {
    }
}
