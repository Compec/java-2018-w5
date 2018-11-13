package com.company;

/**
 * Base class for all animals Has properties and fields that apply to all
 * animals, therefore can be inhertied (for example by Cat, Dog classes)
 */
public class Animal {
    /**
     * Age of the animal
     */
    public int age;
    /**
     * Some property that can only be accessed by the Animal class AND all its
     * inherited classes
     */
    protected int inhertitedProperty;
    /**
     * Some property that can only be accesed by the Animal class (not even its
     * inherited classes!)
     */
    private int privateProperty;

    /**
     * Generic speak method
     */
    public void speak() {
        System.out.println("I am some animal");
    }

    /**
     * Generic walk method
     */
    public void walk() {
        System.out.println("I walk somehow...");
    }
}
