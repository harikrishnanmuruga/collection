package org.example.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String args[]) {
        PriorityQueue<Integer> list = new PriorityQueue<>();
        list.add(6);
        list.add(4);
        list.add(1);
        list.add(7);
        list.add(3);
        System.out.println("PriorityQueue list : " + list);

        list.offer(5);
        System.out.println("Updated PriorityQueue : " + list);

        System.out.println("Accessed Element: " + list.peek());

        System.out.println("Is the element 2 removed? " + list.remove(2));
        System.out.println("Updated list :" + list);

        System.out.println("Removed Element Using poll():  " + list.poll());
        System.out.println("Updated list : " + list);


        Iterator iterate = list.iterator();
        System.out.println("Queuelist : ");
        while (iterate.hasNext()){
            System.out.println(iterate.next());

    }

        System.out.println("Is contains or not : " +list.contains(7));

        System.out.println("Number of value in Queue : " +list.size());
    }
}
