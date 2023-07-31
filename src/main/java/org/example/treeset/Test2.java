package org.example.treeset;

import java.util.TreeSet;

public class Test2 {
    public static void main(String args[]){
        TreeSet<String> name = new TreeSet<>();
        name.add("hari");
        name.add("mary");
        name.add("ela");
        name.add("amar");
        name.add("krish");
        name.add("priya");
        System.out.println("list of name : " +name);

        // Using headSet()
        System.out.println("Using headSet without boolean value: " + name.headSet("krish"));
        System.out.println("Using headSet with boolean value: " + name.headSet("krish", true));

        // Using tailSet()
        System.out.println("Using tailSet without boolean value: " + name.tailSet("mary"));
        System.out.println("Using tailSet with boolean value: " + name.tailSet("mary", false));

        // Using subSet()
        System.out.println("Using subSet without boolean value: " + name.subSet("ela", "mary"));
        System.out.println("Using subSet with boolean value: " + name.subSet("ela", false, "mary", true));
        System.out.println("Using subSet with boolean value: " + name.subSet("ela", true, "mary", true));
        System.out.println("Using subSet with boolean value: " + name.subSet("ela", false, "mary", false));


    }
}
