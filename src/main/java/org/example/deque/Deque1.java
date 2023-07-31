package org.example.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Deque1 {
    public static void main(String args[]){
        Deque<Integer> number = new LinkedList<>();
        number.offer(2);
        number.addFirst(8);
        number.offerFirst(3);
        number.offer(4);
        number.offerLast(1);
        number.addLast(5);

        System.out.println("Deque:" +number);

        System.out.println("First Element: " + number.peekFirst());
        System.out.println("Last Element: " + number.peekLast());

        System.out.println("Removed First Element: " + number.pollFirst());
        System.out.println("Last First Element: " + number.pollLast());

        System.out.println("Updated Deque:" +number);

        System.out.println("Removed Element: " + number.pop());
        System.out.println("Updated Deque:" +number);

        System.out.println("Get First Element: " + number.getFirst());
        System.out.println("Get Last Element: " + number.getLast());

        number.clear();
        System.out.println(number);

        System.out.println(number.peek());


    }
}
