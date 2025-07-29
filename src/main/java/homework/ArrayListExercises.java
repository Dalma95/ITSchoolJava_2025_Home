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


}
