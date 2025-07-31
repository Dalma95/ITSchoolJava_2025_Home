package homework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercises {
    public static void main(String[] args) {
//        addElement("Maria",25);
//        addElement("John",30);
//        getNumberOfPairs();
//        copyMappings();
//        removeAll();
//        isMapEmpty();
//        shallowCopy();
//        containsKey();
//        containsValue();
//        createSetView();
//        getValueOfKey();
//        getKeySetView();
//        collectionViewOfValues();

    }

//    1. Write a Java program to associate the specified value with the specified key in a HashMap.
private static HashMap<String,Integer> students = new HashMap<>();
    public static void addElement(String key, Integer value) {
        System.out.println("Before adding: " + students);
        students.put(key, value);
        System.out.println("After adding: " + students);

    }

//    2. Write a Java program to count the number of key-value (size) mappings in a map.
    public static void getNumberOfPairs(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);
        System.out.println("Number of key-value pairs in the map: " + map.size());
    }

//    3. Write a Java program to copy all of the mappings from the specified map to another map.
    public static void copyMappings(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        HashMap<String,Integer> copyMap = new HashMap<>();
        copyMap.putAll(map);
        System.out.println("Original map: " + map);
        System.out.println("Copied map: " + copyMap);

    }

//    4. Write a Java program to remove all of the mappings from a map.
    public static void removeAll(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        System.out.println("Before removing all mappings: "+ map);
        map.clear();
        System.out.println("After removing all mappings: " + map);
    }

//    5.Write a Java program to check whether a map contains key-value mappings (empty) or not.
    public static void isMapEmpty(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        if(map.isEmpty()){
            System.out.println("The map is empty.");
        } else {
            System.out.println("The map is not empty. It contains: " + map);
        }
    }

//    6.Write a Java program to get a shallow copy of a HashMap instance.
    public static void shallowCopy(){
        HashMap<String,Integer> original = new HashMap<>();
        original.put("Alice",22);
        original.put("score",97);

        HashMap<String,Integer> copy = (HashMap<String, Integer>) original.clone();
        System.out.println("Original HashMap: " + original);
        System.out.println("Shallow copy of HashMap: " + copy);
    }

//    7.Write a Java program to test if a map contains a mapping for the specified key.
    public static void containsKey(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        String keyToCheck = "Alice";
        if (map.containsKey(keyToCheck)){
            System.out.println("The map contains the key: " + keyToCheck + " with value: " + map.get(keyToCheck));
        } else {
            System.out.println("The map does not contain the key: " + keyToCheck);
        }
    }
//    8. Write a Java program to test if a map contains a mapping for the specified value.
    public static void containsValue(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        Integer valueToCheck = 25;

        if(map.containsValue(valueToCheck)){
            System.out.println("The map contains the value: " + valueToCheck);
        } else {
            System.out.println("The map does not contain the value: " + valueToCheck);
        }
    }

//    9. Write a Java program to create a set view of the mappings contained in a map.
    public static void createSetView(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        System.out.println("Set view of the mappings in the map: " + map.entrySet());
    }

//    10. Write a Java program to get the value of a specified key in a map.
    public static void getValueOfKey(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        String key = "Bob";

        if(map.containsKey(key)){
            Integer value = map.get(key);
            System.out.println("The value for the key '" + key + "' is: " + value);
        } else {
            System.out.println("The key '" + key + "' does not exist in the map.");
        }
    }

//    11. Write a Java program to get a set view of the keys contained in this map.
    public static void getKeySetView(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        Set<String> keys = map.keySet();
        System.out.println("Set view of the keys in the map: " + keys);

    }

//    12. Write a Java program to get a collection view of the values contained in this map.
    public static void collectionViewOfValues(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 22);
        map.put("Bob", 25);
        map.put("Charlie", 30);

        Collection<Integer> values = map.values();
        System.out.println("Collection view of the values in the map: " + values);
    }
}
