package javaCollections;

import java.util.ArrayList;
import java.util.Collection;
import static org.testng.Assert.*;



public class ArrayListExamples {

	public static void main(String[] args) {

        // Creating a collection
        Collection<String> fruits = new ArrayList<>();

        // ---- ADDING ELEMENTS ----
        fruits.add("Apple");           // true
        fruits.add("Banana");          // true
        fruits.add("Cherry");          // true

        System.out.println(fruits);    // [Apple, Banana, Cherry]

        // ---- SIZE & EMPTY CHECK ----
        System.out.println("Size: " + fruits.size());        // 3
        System.out.println("Empty? " + fruits.isEmpty());    // false

        // ---- CONTAINS CHECK ----
        System.out.println("Has Apple? " + fruits.contains("Apple"));  // true
        System.out.println("Has Mango? " + fruits.contains("Mango"));  // false

        // ---- REMOVING ELEMENTS ----
        fruits.remove("Banana");
        System.out.println(fruits);    // [Apple, Cherry]

        // ---- CLEARING ALL ----
        fruits.clear();
        System.out.println("After clear: " + fruits.isEmpty());  // true
        
             
     // Arrange
        Collection<String> testData = new ArrayList<>();

        // Act
        testData.add("Item1");
        testData.add("Item2");

        // Assert
        assertEquals(2, testData.size());
        assertTrue(testData.contains("Item1"));
        assertFalse(testData.isEmpty());
        
        
        
        
        
        
    }

}
