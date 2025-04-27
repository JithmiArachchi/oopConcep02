package org.example.abstractions;

public class Dog extends Animal{

    // 3.) now implement the method which mark as abstract
    // 4. ) this call as override
    // 5.) abstract classes must be override
    @Override
    public void makeSound() {
        System.out.println("this is abstract ");
    }

    //override - super class's method's body changing in sub class

    @Override
    public void sleep(){
        System.out.println("Dog sleep");
    }


}
