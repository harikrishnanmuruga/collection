package org.example.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class Test1 {
    public static void main(String args[]){

        HashSet<Integer> evennumber = new HashSet<>();
        // Using add() method
        evennumber.add(4);
        evennumber.add(6);
        evennumber.add(8);
        evennumber.add(10);

        System.out.println("EvenNumber Valiues :" +evennumber);


        HashSet<Integer> number = new HashSet<>();
        // Using addAll() method
        number.add(3);
        number.add(7);
        number.addAll(evennumber);
        System.out.println("New HashSet : " +number);

        Iterator<Integer> iterate = number.iterator();
        System.out.println("HashSet using Iterator : ");
        while(iterate.hasNext()){
            System.out.println(iterate.next());
        }

        System.out.println("Is 6 removed? " + number.remove(6));
        System.out.println("Updated Values : " +number);

        System.out.println("Removed ALL : " +number.removeAll(number));
        System.out.println("Final vaules  : " +number);


    }
}
