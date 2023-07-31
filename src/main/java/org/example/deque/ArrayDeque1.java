package org.example.deque;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 {
    public static void main(String args[]){
        ArrayDeque <Integer> value =new ArrayDeque<>();
        value.add(55);
        value.add(45);
        value.offer(52);
        value.addFirst(35);
        value.offerLast(24);
        value.offerFirst(72);
        value.addLast(72);
        value.offer(53);
        value.add(26);
        System.out.println("ArrayDeque List :" +value);


        System.out.println("Head Element: " + value.peek());
        System.out.println("First Element: " + value.peekFirst());
        System.out.println("Last Element: " + value.peekLast());

        System.out.println("Removed Element: " + value.remove());
        System.out.println("Updated List :" +value);

        System.out.println("RemoveFirst Element: " + value.removeFirst());
        System.out.println("Updated List :" +value);

        System.out.println("RemoveLast Element: " + value.removeLast());
        System.out.println("Updated List :" +value);

        System.out.println("GetFirst Element: " + value.getFirst());
        System.out.println("GetLast Element :" +value.getLast());

        System.out.println("Contains or not: " +value.contains(24));

        System.out.println("Find elemant :"+ value.element());

        System.out.println("Updated List :" +value);
        System.out.println("Number of Values in ArrayDeque :" +value.size());

        Iterator<Integer> desIterate = value.descendingIterator();
        System.out.print("ArrayDeque Value: ");
        while (desIterate.hasNext()){
            System.out.println(desIterate.next());
        }
        ArrayDeque<Integer> copy= new ArrayDeque<>(value);

        value.clear();
        System.out.println("ArrayList After Clearing:" + value);

        System.out.println("ArrayDeque values :" +copy);

        System.out.println("Clone value for copy item :" +copy.clone());

        System.out.println(copy.poll());
        System.out.println("Updated copy values: " +copy);

        copy.clear();
        System.out.println(copy);

        System.out.println("Get pollvalue in copy :" +copy.pollFirst());






    }
}
