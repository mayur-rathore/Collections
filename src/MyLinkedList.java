import java.io.OutputStream;
import java.util.*;

public class MyLinkedList {

    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList();

        // Appending new elements at the end of the list
        for(int i=1 ; i<=5; i++)
            linkedList.add(i);

        // Printing all elements of list
        System.out.println("Linked list elements are : "+linkedList);

        // Remove element at index 3
        linkedList.remove(3);

        System.out.println("Linked list after removing element at index 3 : "+linkedList);

        // Printing elements one by one
        for(int i=0; i < linkedList.size(); i++)
            System.out.print(linkedList.get(i) + " ");

        // Above for loop can be replaced with enhanced for loop
        for(Integer integer : linkedList)
            System.out.print(integer + " ");
    }
}
