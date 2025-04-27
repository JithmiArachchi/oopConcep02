package org.example.encapsulation;

import org.example.Outer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
         // Outer outer = new Outer();
          Outer.Inner inner=new Outer.Inner();
          inner.display();
    }
}