package org.example.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array3 {
    public static void main(String args[]) {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(5);
        alist.add(8);
        alist.add(10);


        Iterator <Integer>iterate = alist.iterator();
        System.out.print("ArrayList: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.println(" ");
        }
        // multiply each element by 10
        // using the lambda expression
        alist.forEach((e) -> {
            e = e * 10;
            System.out.print(e + " ");
        });

        // remove all even numbers
        alist.removeIf(e -> (e % 2) == 0);;
        System.out.println("Odd Numbers: " + alist);

        Collections.sort(alist);
        System.out.println("sort ArrayList:" +alist);

        Collections.reverse(alist);
        System.out.println("reverse ArrayList:" +alist);




    }
}
