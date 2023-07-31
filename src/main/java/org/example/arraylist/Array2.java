package org.example.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Array2 {
    public static void main(String args[]) {
        ArrayList  alist = new ArrayList<>();
        alist.add("sathish");
        alist.add("venkat");
        alist.add("nisha");
        alist.add(10);

        Iterator iterate = alist.iterator();
        System.out.print("ArrayList1: " );

        // loop through ArrayList till it has all elements
        // Use methods of Iterator to access elements
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
        System.out.println(alist.contains(10));
        System.out.println(alist.contains(11));

        ArrayList  alist2 = new ArrayList<>();
        alist2.add(25);
        alist2.add("krish");
        alist2.add("sathish");
        alist2.add("venkat");
        alist2.add("nisha");
        alist2.add(10);

        System.out.println("ArrayList2: " +alist2);

        boolean result1 = alist2.containsAll(alist);
        System.out.println("ArrayList 2 contains all elements of ArrayList : " + result1);

        boolean result2 = alist.containsAll(alist2);
        System.out.println("ArrayList 1 contains all elements of ArrayList 2: " + result2);

        alist.retainAll(alist2);
        System.out.println("Common Elements: " + alist);







    }
}
