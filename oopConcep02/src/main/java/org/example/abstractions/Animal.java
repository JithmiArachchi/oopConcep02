package org.example.abstractions;

// 2.) if class have one or more abstract methods , then class should be abstract too
abstract public class Animal {

    // 1.) if method dont have a body use abstract
    abstract public void makeSound();
    public void sleep(){
        System.out.println("sleep ... ");
    }

    // 7. can make constructor class
    //8. why we need abstract methods ? -> for hide the complexity like a content of a book
}
