package org.example.arraylist;



import java.util.ArrayList;

public class Array1 {
    public static void main (String args[]){
        ArrayList al = new ArrayList();
        al.add("hari");
        al.add("A");
        al.add("40");
        al.add("hari");
        al.add(null);
        System.out.println("List of al: " +al);

        ArrayList al1 = new ArrayList(); // list 2.
        al1.add("a");
        al1.add("b");
        al1.add("c");
        System.out.println("List of al1: " +al1);

        al.addAll(al1);
        System.out.println("List of al & al1: " +al);

        al1.addAll(2, al);
        System.out.println(al1);

        al.remove("A");
        System.out.println("Remove The object A in al: "+al);

        al.remove(3);
        System.out.println("Remove The Index 3 in al: "+al);


        al.set(2, "kumar");
        System.out.println(al);

        // access element at index 1
        System.out.println("Element at index 1: " + al.get(1));

        // get the number of elements of arraylist
        System.out.println("Length of ArrayList: " + al.size());

        // create an arraylist
        ArrayList<String> Copy = new ArrayList<>(al);

        // remove all elements
        al.clear();
        System.out.println("ArrayList After Clearing:" + al);

        // checks if the ArrayList is empty
        System.out.println("is ArrayList empty:" +al.isEmpty());

        // Adding elements to the copied ArrayList
        Copy.add("lavanya");  //adding to copied
        Copy.add("nandhu");

        // adding copy to alist
        al.addAll(Copy);
        System.out.println("ArrayList after adding elements from the copied ArrayList: " + al);

        // create an arraylist
        /* ArrayList<Integer> Copys = new ArrayList<>(al);

        al.clear();
        System.out.println("ArrayList After Clearing:" + al);

        Copys.add(110);

        al.addAll(Copys);
        System.out.println("ArrayList after adding elements from the copied ArrayList: " + al); */

        System.out.println("Clone :" + al.clone());  //clone

        System.out.println("Index Of: "+ al.indexOf("lavanya")); //index

        // System.out.println("Last Index Of: "+aList.lastIndexOf(3)); //index of ele, if not

        System.out.println("SubList: " + al.subList(0, 7));  //index 0 to 7

        //  System.out.println("Remove All: " + al.removeAll(al));  //removeAll









    }
}

