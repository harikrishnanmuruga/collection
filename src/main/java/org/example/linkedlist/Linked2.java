package org.example.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked2 {
    public static void main(String args[]){
        LinkedList list=new LinkedList<>();
        list.add("sam");
        list.add("B");
        list.add(50);
        list.add("mani");
        list.add(40);
        System.out.println(list);

        LinkedList<String> Copylist = new LinkedList<>(list);
        list.clear();
        System.out.println("After Clear:" +list);

        System.out.println("Is empty :" +list.isEmpty());

        Copylist.add("roni");
        Copylist.add("mary");

        list.addAll(Copylist);
        System.out.println("Adding names from the copied list :" +list);

        System.out.println("Index of element: " + list.indexOf("Pooja"));

        Iterator<Integer> iterate = list.iterator();
        System.out.print("Linked List: ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.println(" ");
        }
    }
}
