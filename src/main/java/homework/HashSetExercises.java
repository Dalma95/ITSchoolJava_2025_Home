package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExercises {
    public static void main(String[] args) {
//        addElement("orange");
//        iterateElements();
//        getNumberOfElements();
//        emptyHashSet();
//        isHashSetEmpty();
//        cloneHashSet();
//        convertHashSetToArray();
//        convertHashSetToTreeSet();
//        convertHashSetToArrayList();
//        compareHashSet();
//        commonElementsInSets();
//        removeAllElements();
    }

//    1. Write a Java program to append the specified element to the end of a hash set
    //HashSet  = nu sunt ordonate, nu putem adauga un element la o anumita pozitie (ultimul element)
    public static void addElement(String element){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");

        System.out.println("Before adding: " + fruits);
        fruits.add(element);
        System.out.println("After adding: " + fruits);
    }

//    2.Write a Java program to iterate through all elements in a hash set.
    public static void iterateElements(){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println("Iterating through elements:");
        for (Integer element : numbers){
            System.out.println(element);
        }
    }

//    3. Write a Java program to get the number of elements in a hash set
    public static void getNumberOfElements(){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Number of elements in the hash set: " + numbers.size());
    }

//    4. Write a Java program to empty a hash set.
    public static void emptyHashSet(){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Before emptying: " + numbers);
        numbers.clear();
        System.out.println("After emptying: " + numbers);
    }

//    5. Write a Java program to test a hash set is empty or not.
    public static void isHashSetEmpty(){
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        if (numbers.isEmpty()){
            System.out.println("The hash set is empty.");
        } else {
            System.out.println("The hash set is not empty. It contains: " + numbers);
        }
    }

//    6. Write a Java program to clone a hash set to another hash set.
    public static void cloneHashSet(){
        HashSet<Integer> original = new HashSet<>();
        original.add(1);
        original.add(2);
        original.add(15);

        HashSet<Integer> clone = (HashSet<Integer>) original.clone();
        System.out.println("Original HashSet: " + original);
        System.out.println("Cloned HashSet: " + clone);
    }

//    7. Write a Java program to convert a hash set to an array.
    public static void convertHashSetToArray(){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        String [] fruitsArray = fruits.toArray(new String[0]);
        System.out.println("HashSet converted to array:");
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }

//    8. Write a Java program to convert a hash set to a tree set.
    public static void convertHashSetToTreeSet(){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        TreeSet<String> treeSet =new TreeSet<>(fruits);
        System.out.println("Hashset, unsorted: "+fruits);
        System.out.println("TreeSet, sorted: " + treeSet);
    }

//    9. Write a Java program to convert a hash set to a List/ArrayList.
    public static void convertHashSetToArrayList(){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        ArrayList<String> fruitsList = new ArrayList<>(fruits);
        System.out.println("HashSet converted to ArrayList:" +fruitsList);
    }

//    10. Write a Java program to compare two hash set.
    public static void compareHashSet(){
        HashSet<Integer> num1 = new HashSet<>();
        num1.add(1);
        num1.add(2);
        num1.add(3);

        HashSet<Integer> num2 = new HashSet<>();
        num2.add(1);
        num2.add(2);
        num2.add(5);

        boolean isEqual = num1.equals(num2);
        System.out.println("Are the two hash sets equal?: " + isEqual);
    }

//    11. Write a Java program to compare two sets and retain elements which are same on both sets.
    public static void commonElementsInSets(){
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,6,7));

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);

        HashSet<Integer> commonElements = new HashSet<>(set1);
        commonElements.retainAll(set2);
        System.out.println("Common elements in both sets: " + commonElements);
    }

//    12. Write a Java program to remove all of the elements from a hash set.
    public static void removeAllElements(){
        HashSet<Integer> nums = new HashSet<>(Arrays.asList(1,2,3,4));

        System.out.println("Before removing all elements: " + nums);
        nums.clear();
        System.out.println("After removing all elements: " + nums);
    }


}
