package org.Manish;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRevision {

    public static void main(String[] args) {

        // Create a map of type HashMap
        Map<String, String> map = new HashMap<>();

        // Add key value pairs to the map
        map.put("name", "John");
        map.put("age", "25");
        map.put("city", "New York");

        // Print the map
        System.out.println(map);
        System.out.println(map.keySet()); // keys are stored as a set since keys are unique
        System.out.println(map.values()); // values are stored as a collection since values can be duplicate
        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        // Print the map using for loop
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Print the map using forEach
        entrySet.forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue())) ;

        // Check if the map contains a key
        System.out.println("Contains key [name]" + map.containsKey("name"));

        // Check if the map contains a value
        System.out.println("Contains value [John]" + map.containsValue("John"));

        // Get the value of a key
        System.out.println("Value of key [name] is " + map.get("name"));

        // Get the key of a value
        for (Map.Entry<String, String> entry : entrySet) {
            if (entry.getValue().equals("John")) {
                System.out.println("Key of value [John] is " + entry.getKey());
            }
        }

        entrySet
                .stream()
                .filter(entry -> entry.getValue().equals("John"))
                .findAny()
                .ifPresent(entry -> System.out.println("Key of value [John] is " + entry.getKey()));

        // update a value of a key
        map.put("name", "Doe");

        // Remove a key value pair
        map.remove("city");
        System.out.println(map);

        // Get the size of the map
        System.out.println("Size of the map is " + map.size());

        // Clear the map
        map.clear();
        System.out.println("Map is empty: " + map.isEmpty() );
        // Print the map
        System.out.println(map);
    }

}
