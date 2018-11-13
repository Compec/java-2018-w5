package com.company;

public class Dog extends Animal {

    /**
     * This property is specific to Dogs (and anything that *is* a Dog) Therefore
     * this property does not exist for the super-classes of Dog (super means the
     * classes from which Dog inherits from, such as Animal)
     */
    String doggyName;

    /**
     * Specific constructor for Dog's. This allows us to initialize the `doggyName`
     * property.
     * 
     * @param _doggyName Name of the dog
     */
    Dog(String _doggyName) {
        doggyName = _doggyName;
    }

    /**
     * This is an overriden method. Animal also has `speak` method, but when we call
     * the `speak` method on a Dog object, or an Animal that happens to be a Dog
     * (because at compile time we might know the exact type of the object) then
     * this will get called instead of the speak method defined Animal.
     */
    @Override
    public void speak() {
        System.out.println("I am a dog, woof woof");
    }

    /**
     * This method is specific to Dogs (and anything that *is* a Dog) Therefore this
     * property does not exist for the super-classes of Dog (super means the classes
     * from which Dog inherits from, such as Animal) Therefore, as things are
     * implemented this way, an Animal cannot display its age, but a Dog is able to
     * do that!
     */
    public void displayAge() {
        System.out.println(age);
    }
}
