package org.example.innerClass;

public class Main {

    public static  void  main (String[] arg){
        Outer outer = new Outer();

        Outer.Inner inner  =   outer.new Inner();
        inner.display();
    }
}
