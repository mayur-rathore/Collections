// Java program to demonstrate why collection framework was needed
import java.util.Hashtable;
import java.util.Vector;

public class CollectionDemo {

    public static void main(String[] args){

        // Creating instances of Array
        // Array instance creation requires []
        int[] arr = new int[] {1, 2, 3, 4};

        // Creating instance of Vector
        // While Vector and hashtable require ()
        Vector<Integer> vector = new Vector<>();

        // Creating instance of Vector
        Hashtable<Integer, String> hashTable = new Hashtable<>();

        // Adding elements into Vector, Vector element insertion requires addElement()
        vector.add(1);
        vector.add(2);

        // Adding elements into hashtable, hashtable element insertion requires put()
        hashTable.put(1, "Mayur");
        hashTable.put(2, "Mochi");

        // Accessing the first element of the array, vector and hashtable
        System.out.println("Arrays first element : " +arr[0]);
        System.out.println("Vectors first element : " +vector.elementAt(0));
        System.out.println("HashTable first element is : " +hashTable.get(1));
    }
}