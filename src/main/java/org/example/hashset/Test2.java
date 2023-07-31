package org.example.hashset;

import java.util.HashSet;

public class Test2 {
    public static void main(String args[]){
        HashSet<Integer> evennumber = new HashSet<>();
        evennumber.add(2);
        evennumber.add(4);
        evennumber.add(6);
        evennumber.add(8);
        System.out.println("EvenNumber Values : " +evennumber);

        System.out.println("Hashcode : " +evennumber.hashCode());

//        for(Integer number:evennumber)
//            System.out.println(number);

        HashSet<Integer> primeNumber = new HashSet<>();
        primeNumber.add(2);
        primeNumber.add(3);
        primeNumber.add(5);
        primeNumber.add(6);
        System.out.println("PrimeNuber Values : " +primeNumber);

        // Union of two set
        evennumber.addAll(primeNumber);
        System.out.println("Union Is : " +evennumber);

        // Intersection of two sets
        evennumber.retainAll(primeNumber);
        System.out.println("Intersection Values : " +evennumber);

        evennumber.add(14);
        evennumber.add(10);
        evennumber.add(12);
        System.out.println("Updated EvenNumber Values : " +evennumber);

        // Difference between evennumber and primeNumber
        evennumber.removeAll(primeNumber);
        System.out.println("Difference : " +evennumber);


    }
}
