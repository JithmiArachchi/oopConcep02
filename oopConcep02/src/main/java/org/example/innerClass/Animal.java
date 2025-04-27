package org.example.innerClass;

public interface Animal {

         public default void makeSound(){
            System.out.println("sound");
        }

}
