package animalgame.animals;

import animalgame.abstractmodels.Animal;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat(Animal animal) {
        if( animal instanceof Dog ){
            Dog dog = (Dog) animal;
            // Type Casting
                // 1. Up Casting
                // 2. Down Casting
            // IT IS NOT GENERICS
        }

    }
}
