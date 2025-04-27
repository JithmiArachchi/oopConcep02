package org.example.generics;

public class Main {
    public static void main(String[] args) {

        display(50);
        display("ammal");
        display(50.35);

        display02(8 ,"hi");

        Box box = new Box();
        box.setItem(8);
        System.out.println(box.getItem());

        box.setItem2(100);
        System.out.println(box.getItem2());


        // passing strings only
        Box  <String> box1 = new Box();
        box1.setItem2("abs");
        System.out.println(box1.getItem2());

        //box1.setItem2(10); //

    }

    public static <T> void display(T val) { // generic type method
        System.out.println(" hii wrapper " + val);
    }

    public static <P, K > void  display02(P val1 , K val2){
        System.out.println("generics "+ val1 +"--- "+ val2);
    }
}