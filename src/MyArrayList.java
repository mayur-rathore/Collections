// Java program to demonstrate the working of ArrayList in Java

import java.util.*;

public class MyArrayList {

    public static void main( String[] args){

        // Declaring the ArrayList with initial size n
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Appending new elements at the end of the list
        for(int i=1; i<=5; i++)
            arrayList.add(i);

        // Printing elements
        System.out.println(arrayList);          // output - [1, 2, 3, 4, 5]

        // Remove element at index 3
        arrayList.remove(3);

        // Displaying the ArrayList after deletion
        System.out.println("Array List after deletion : "+arrayList);   // Array List after deletion : [1, 2, 3, 5]

        // Printing elements one by one
        for(int i = 0; i < arrayList.size(); i++)
            System.out.print(arrayList.get(i) + " ");       // output - 1 2 3 5

        // Above for loop can be replaced with enhanced for loop
        for (Integer integer : arrayList)
            System.out.print(integer + " ");
    }
}
