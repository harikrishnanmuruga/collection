package org.example.treeset;

import java.util.TreeSet;

public class Test1 {
    public static void main(String args[]){
        TreeSet number = new TreeSet();
        number.add(5);
        number.add(8);
        number.add(12);
        number.add(11);
        number.add(7);
        number.add(13);
        System.out.println("list of the element : " +number);

        System.out.println("First Number: " + number.first());
        System.out.println("Last Number: " + number.last());

        // Using higher()
        System.out.println("Using higher: " + number.higher(9));
        System.out.println("Using higher: " + number.higher(4));
        System.out.println("Using higher: " + number.higher(14));
        System.out.println("higher: "+number.higher(8));

        System.out.println("list of the element : " +number);

        // Using lower()
        System.out.println("Using lower: " + number.lower(7));
        System.out.println("Using lower: " + number.lower(3));
        System.out.println("Using lower: " + number.lower(15));
        System.out.println("lower: "+number.lower(12));

        System.out.println("list of the element : " +number);
        // Using ceiling()
        System.out.println("Using ceiling: " + number.ceiling(7));
        System.out.println("Using ceiling: " + number.ceiling(15));
        System.out.println("Using ceiling: " + number.ceiling(9));
        System.out.println("Using ceiling: " + number.ceiling(3));

        System.out.println("list of the element : " +number);
        // Using floor()
        System.out.println("Using floor: " + number.floor(3));
        System.out.println("Using floor: " + number.floor(14));
        System.out.println("Using floor: " + number.floor(8));
        System.out.println("Using floor: " + number.floor(6));





    }
}
