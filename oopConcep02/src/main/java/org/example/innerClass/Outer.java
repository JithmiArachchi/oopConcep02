package org.example.innerClass;

public class Outer {
    private  String message = "Hello world!";

    class Inner{
        void display(){
            System.out.println("inner class");
        }
    }
}
