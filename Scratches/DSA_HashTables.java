/*
    * DEMONSTRATION OF HASH TABLES IN JAVA 
 */

import java.util.*;

public class DSA_HashTables {
   
    public static void main(String[] args) {
        
        // HASH TABLE

        /*
            * Collection of Key Value Pairs. 
            * Each Key Value Pairs known as entry. 
            * It has two pieces of Data. First is known as Key Value, second is the Value.
            * For entry of keys to know what index should it place, we can use "key.hashCode()"
            * Since the hashCode entry might be too big for the indexes, it always divide it by the capacity of the 
                hash table and get its modulus. Whatever the modulus is, the result will be the declare the index 
                position of the hashCode entry. 
            * Hash Tables often making a data collision when the hashCode entry of both value has the same result after 
                getting the modulo of them. The solution provided there is in one index or bucket, it automatically creates
                a linked list where the first entry holds the address of the next entry that has collided on the same 
                bucket. 

            * HashTable is a class from Java Utilities (java.util.Hashtable)

            * On HashTables, "the key is always the first argument given on the declaration". 
                On this case, it is the Integer.

            // Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
            //			   Each key/value pair is known as an Entry
            //			   FAST insertion, look up, deletion of key/value pairs
            // 			   Not ideal for small data sets, great with large data sets
            
            // hashing = Takes a key and computes an integer (formula will vary based on key & data type)
            //		       In a Hashtable, we use the hash % capacity to calculate an index number 
            
            //			key.hashCode() % capacity = index  
            
            // bucket = an indexed storage location for one or more Entries
            //	            can store multiple Entries in case of a collision (linked similarly a LinkedList)
            
            // collision = hash function generates the same index for more than one key
            //			less collisions = more efficiency
         */

        // Declaring the HashTable. 
        Hashtable<Integer, String> studentData = new Hashtable<>(); 
        // Since Hashtable is a class, it needs to get instantiated. 
        // if you want to change the load factor and the size, here's the syntax:
        // Hashtable<Integer, String> studentData = new Hashtable<>(10, 0.8f);
        // 0.8f defines the 80%, for 80% of the capacity the hash table will automatically expand its storage.
        // you can also just declare specific storage. Just put the desired storage in the argument.
        
        // to put entry in the hashtable, use put() method. 
        studentData.put(0001, "Cedie Castro");
        studentData.put(0002, "Ryan Zamudio");
        studentData.put(0003, "Amado Galzote");

        // to print all the data in the hashtable, you need to loop thru it using enhanced for loop. 
        printHashTable(studentData);
        
    }

    private static void printHashTable(Hashtable<Integer, String> hashTable) {

        System.out.println("Students : ");
        // Enhanced for loop is essential to print all the data in the hash table. 
        for (Integer key : hashTable.keySet()) 
            // keySet() method returns all the keys in one HashTable. So it can be numerous of data and can traverse. 
            System.out.println(key + " : "  + hashTable.get(key));
            // get() method returns the key value. 

    }

}
