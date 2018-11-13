package com.company;

public class Cat extends Animal {

    /**
     * This property is specific to Cats (and anything that *is* a cat) Therefore
     * this property does not exist for the super-classes of Cat (super means the
     * classes from which Cat inherits from, such as Animal)
     */
    public int selfishnessLevel;

    /**
     * This is an overriden method. Animal also has `speak` method, but when we call
     * the `speak` method on a Cat object, or an Animal that happens to be a cat
     * (because at compile time we might know the exact type of the object) then
     * this will get called instead of the speak method defined Animal.
     */
    @Override
    public void speak() {
        System.out.println("I am a cat, miaouw");
    }
}
