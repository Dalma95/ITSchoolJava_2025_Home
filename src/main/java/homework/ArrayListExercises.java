package homework;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercises {
    public static void main(String[] args) {
//        arrayListColors();
//        iterateArrayList();
//        insertElement();
//        retrieveElement();
//        updateElement();
//        removeElement();
//        searchElement();
//        sortArrayList();
//        copyArrayList();
//        shuffleArrayList();
//        reverseArrayList();
//        extractPortionOfArrayList();
//        compareArrayLists();
//        swapElements();
//        joinArrayLists();
//        cloneArrayList();
//        clearArrayList();
//        isArrayListEmpty();
//        trimArrayListCapacity();
//        increaseArrayListSize();
    }


    // 1. Create a new array list, add some colors (string) and print out the collection.
    public  static void arrayListColors(){
        ArrayList<String> colors = new ArrayList();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);
    }
    // 2. Iterate through all elements in an array list.
    public static void iterateArrayList(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        for (String color:colors){
            System.out.println(color);
        }
    }

    // 3. Write a Java program to insert an element into the array list at the first position.
    public static void insertElement(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);
        colors.add(0,"yellow");
        System.out.println(colors);
    }

//    4.Write a Java program to retrieve an element (at a specified index) from a given array list.
    public static void retrieveElement(){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");

        System.out.println(colors);
        String colorAtIndex1 = colors.get(1);
        System.out.println("Color at index 1: " + colorAtIndex1);
    }

//    5.Write a Java program to update specific array element by given element.
    public static void updateElement(){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("Before update: "+ fruits);
        fruits.set(1,"orange");
        System.out.println("After update: " + fruits);
    }

//    6.Write a Java program to remove the third element from a array list.
    public static void removeElement(){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");

        System.out.println("Before removal: " + fruits);
        if (fruits.size() >= 3) {
            fruits.remove(2);
        }
        System.out.println("After removal: " + fruits);
    }

//    7.Write a Java program to search an element in a array list.
    public static void searchElement(){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        String findElement = "banana";
        if (fruits.contains(findElement)) {
            System.out.println(findElement + " is found in the list.");
        } else {
            System.out.println(findElement + " is not found in the list.");
        }
    }

//    8. Write a Java program to sort a given array list.
    public static void sortArrayList(){
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("banana");
        fruits.add("apple");
        fruits.add("cherry");

        System.out.println("Before sorting: " + fruits);
        Collections.sort(fruits);
        System.out.println("After sorting: " + fruits);
    }

//    9.Write a Java program to copy one array list into another.
    public static void copyArrayList(){
        ArrayList<String> original = new ArrayList<>();
        original.add("apple");
        original.add("cherry");
        original.add("dog");
        original.add("cat");
        System.out.println("Original ArrayList: " + original);

        ArrayList<String> copy = new ArrayList<>(original);
        System.out.println("Copied ArrayList: " + copy);
    }

//    10.Write a Java program to shuffle elements in a array list.
    public static void shuffleArrayList(){
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("Before shuffling: " + list);
        Collections.shuffle(list);
        System.out.println("After shuffling: " + list);
    }

//    11.Write a Java program to reverse elements in a array list.
    public static void reverseArrayList(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        System.out.println("Before reversing: " + fruits);
        Collections.reverse(fruits);
        System.out.println("After reversing: " + fruits);
    }

//    12.Write a Java program to extract a portion of a array list.
        public static void extractPortionOfArrayList(){
                ArrayList<String> fruits = new ArrayList<>();
                fruits.add("banana");
                fruits.add("cherry");
                fruits.add("durian");
                fruits.add("apple");
                fruits.add("grape");
                fruits.add("kiwi");

            System.out.println("Original ArrayList: " + fruits);
            fruits.subList(2,5);
            System.out.println("Extracted portion: " + fruits.subList(2, 5));
        }

//        13. Write a Java program to compare two array lists.
    public static void compareArrayLists(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        if (list1.containsAll(list2)){
            System.out.println("Both lists are equal.");
        } else {
            System.out.println("Lists are not equal.");
        }
    }

//    14.Write a Java program of swap two elements in an array list.
    public static void swapElements(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("kiwi");

        System.out.println("Before swapping: " + fruits);
        Collections.swap(fruits,1,5);
        System.out.println("After swapping: " + fruits);
    }

//    15.Write a Java program to join two array lists.
    public static void joinArrayLists(){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        System.out.println("First ArrayList: " + list1);
        System.out.println("Second ArrayList: " + list2);
        list1.addAll(list2);
        System.out.println("Joined ArrayList: " + list1);
    }

//    16.Write a Java program to clone an array list to another array list.
    public static void cloneArrayList(){
        ArrayList<String> original = new ArrayList<>();
        original.add("dog");
        original.add("cat");
        original.add("fish");

        System.out.println("Original ArrayList: " + original);
        ArrayList<String> cloned = (ArrayList<String>) original.clone();
        System.out.println("Cloned ArrayList: " + cloned);
    }

//    17.Write a Java program to empty an array list.
    public static void clearArrayList(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        System.out.println("Before clearing: " + fruits);
        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }

//    18.Write a Java program to test an array list is empty or not.
    public static void isArrayListEmpty(){
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("durian");

        System.out.println(fruits.isEmpty());
    }

//    19.. Write a Java program to trim the capacity of an array list the current list size.
    public static void trimArrayListCapacity(){
        ArrayList<Integer> numbers = new ArrayList<>(50);
        for (int i = 0; i < 15; i++) {
            numbers.add(i);
        }
        System.out.println("Before trimming: " + numbers.size() + " elements");
        numbers.trimToSize();
        System.out.println("After trimming: " + numbers.size() + " elements");
    }

//    20. Write a Java program to increase the size of an array list.
    public static void increaseArrayListSize(){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        System.out.println("Before increasing size: " + numbers.size() + " elements");

        numbers.add(102);
        numbers.add(104);
        numbers.add(106);
        numbers.add(110);
        System.out.println("After increasing size: " + numbers.size() + " elements");
    }





}
