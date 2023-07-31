package org.example.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
    public static void main(String  args[]){
        Queue <String> name=new LinkedList<>();

        //System.out.println("Accessed Element: " + name.element());
        //System.out.println("Accessed Element: " + name.remove());

        System.out.println("Accessed Element: " + name.peek());
        System.out.println("Accessed Element: " + name.poll());

        name.offer("hari");
        name.add("krish");
        name.offer("vel");
        name.add("rose");
        System.out.println(name);

        System.out.println("Accessed Element: " + name.peek());

        System.out.println("Removed Element: " + name.poll());
        System.out.println("Updated Element: " + name);

        Queue<Integer> name1 = new PriorityQueue<>();
        name1.offer(5);
        name1.offer(6);
        name1.add(2);
        System.out.println("Queue: " + name1);

        System.out.println("Accessed Element: " + name1.peek());


        }


    }

