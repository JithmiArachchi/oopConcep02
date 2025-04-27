package org.example.CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List l = new ArrayList();

        List<String> ls = new ArrayList();
        ls.add("java");
        ls.add("python");
        System.out.println(ls);

        ls.remove(1);
        System.out.println(ls);

        ls.add("JAVA");
        ls.add("JAVA"); // allow duplicates
        ls.add("C#");
        ls.add(null);
        System.out.println(ls);
    }
}
