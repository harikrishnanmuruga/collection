package org.example.hashset;

import java.util.HashSet;

public class Test3 {
    public static void main(String args[]){
        HashSet<String> name = new HashSet<>();
        name.add("hari");
        name.add("vicky");
        name.add("sathish");
        System.out.println("element of name : " +name);

        HashSet<String> name1 = new HashSet<>();
        name1.add("vicky");
        name1.add("sathish");
        name1.add("hari");
        name1.add("venkat");
        System.out.println("element of name1 : " +name1);

        System.out.println("Is HashSet1 is subset of HashSet2? " + name1.containsAll(name));
        System.out.println("Is HashSet2 is subset of HashSet1? " + name.containsAll(name1));

        name.addAll(name1);
        System.out.println("Union Is : " +name);

        System.out.println("Contains hari in the hash : " +name.contains("hari"));

        System.out.println("Size of the hashset : " +name.size());

        System.out.println("Clone the hashset : " +name.clone());

        name.clear();
        System.out.println(name);

        System.out.println("name hashset is empty : " +name.isEmpty() );

        System.out.println("name1 hashset is empty : " +name1.isEmpty() );

        for(String value:name1)
            System.out.println(value);



    }
}
