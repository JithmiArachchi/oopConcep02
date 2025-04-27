package org.example;

public class Outer {
   static private String message = "hello world";

   public static class Inner{
        public void display(){
            System.out.println(message);
        }
    }
}
