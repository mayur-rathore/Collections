import java.util.*;

public class MyVector {

    public static void main(String[] args){

        List<Integer> vector = new Vector();

        // Appending new elements at the end of the list
        for(int i=1; i <= 5 ; i++)
            vector.add(i);

        // Printing elements
        System.out.println("Vector elements are :"+vector);

        // Remove element at index 3
        vector.remove(3);


        // Displaying the Vector after deletion
        System.out.println("Vector after removing element at index 3 :"+vector);

        // Printing elements one by one
        for(int i=0 ; i < vector.size(); i++) {
            System.out.print(vector.get(i) + " ");
        }

        // Above for loop can be replaced with enhanced for loop
        for (Integer integer : vector) {
            System.out.print(integer + " ");
        }
    }
}
