package org.example.abstractions;

public class main {

    //14. we can create constant variables by using puplic static final
    public static final int a =100;

    public static void main (String[] args){
        Dog dog = new Dog();
        dog.sleep();
        dog.makeSound();

        // 6. can create object , but method must be overrided
        Animal animal = new Animal() {
            @Override
            public void makeSound() {

            }
        };

    }
}
