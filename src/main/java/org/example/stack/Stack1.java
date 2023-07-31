package org.example.stack;

import java.util.Iterator;
import java.util.Stack;

public class Stack1 {
    public static void main (String args[]){
        Stack list1 = new Stack<>();
        list1.push("ram");
        list1.push("sita");
        list1.push(10);
        list1.push("rome");
        list1.push("ela");
        list1.push("krish");

        System.out.println("StackList1: " +list1);

        Iterator iterate = list1.iterator();
        System.out.print("StackList: " );
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }
        System.out.println(list1);



        System.out.println("Element at top: " + list1.peek());

        System.out.println("Position of 10: " + list1.search(10) );

        System.out.println("Is the stack empty? " + list1.empty());

        System.out.println("Position of 10: " + list1.indexOf(10) );

        System.out.println("Removed Element: " + list1.pop());
        System.out.println("Updated list: " +list1);

        System.out.println("contains elemant ram:" +list1.contains("ram"));
        System.out.println("Removed Element: " + list1.pop());
        System.out.println(list1);

    }
}
