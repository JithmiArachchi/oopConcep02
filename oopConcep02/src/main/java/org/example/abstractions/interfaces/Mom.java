package org.example.abstractions.interfaces;

public interface Mom {
    //9.  methods which we create in interfaces , are default abstract)
    void hi();
    // 11. can't create objects & concreat classes in interfaces

    // 12. there are only 2 ways of creating methods inside interface "default & static"
    default void stop(){
        System.out.println("stop...");
    }
    static void log(){
        System.out.println("log....");
    }

    // 13.  this call "constance variable" ; means we cant re assign value for a , unless 10
    int a =100;
    
}
