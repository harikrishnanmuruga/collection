package org.example.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Linked1 {
    public static void main(String args[]){
        LinkedList<String> alist = new LinkedList<>();
        alist.add("krish");
        alist.add("ela");
        alist.add("kumar");
        alist.add("venkat");
        System.out.println("LinkedList: " + alist);

        System.out.println("Element at index 2: " + alist.get(2));

        System.out.println("Updated LinkedList: " +  alist.set(3, "vel"));
        System.out.println(alist);

        System.out.println("After removing String: " + alist.remove("kumar"));
        System.out.println(alist);

        // get the number of elements of arraylist
        int size = alist.size();
        System.out.println("Length of ArrayList: " + size);

        // change elements at index 2
        System.out.println("Updated LinkedList 2: " + alist.set(2,"kumar"));
        System.out.println(alist);

        Collections.sort(alist);
        System.out.println("sort ArrayList:" +alist);

        // add() method with the index parameter
        alist.add(1, "hari");
        System.out.println("Updated LinkedList: " + alist);

        // access the first element
        String str1 = alist.peek();
        System.out.println("Accessed Element: " + str1);

        // access and remove the first element
        String str2 = alist.poll();
        System.out.println("Removed Element: " + str2);
        System.out.println("LinkedList after poll(): " + alist);

        // add element at the end
        alist.offer("elavarasan");
        System.out.println("LinkedList after offer(): " + alist);

        alist.addFirst("murali");
        alist.addLast("vel");
        System.out.println("After adding elements: " + alist);

        alist.removeFirst();
        alist.removeLast();
        System.out.println("After removing first & last: " + alist);

        Collections.reverse(alist);
        System.out.println("Reversed LinkedList: " + alist);


    }
}
