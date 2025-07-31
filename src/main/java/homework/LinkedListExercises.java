package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExercises {
    public static void main(String[] args) {
//        appendElement();
//        iterateElements();
//        iterateFromPosition(1);
//        iterateInReverse();
//        insertElementAtPosition(2,"lion");
//        insertAtFirstAndLast();
//        insertAtFront("cow");
//        insertAtEnd("goat");
//        insertSomeElementsAtPosition(2);
//        firstAndLastOccurrence("dog");
//        displayElementsAndPositions();
//        removeElement("dog");
//        removeFirstAndLastElement();
//        removeAllElements();
//        swapTwoElements(1,3);
//        shuffleElements();
//        joinTwoLinkedLists();
//        cloneLinkedList();
//        removeFirstElement();
//        retrieveFirstElement();
//

    }
//    1. Write a Java program to append the specified element to the end of a linked list.
    public static void appendElement(){
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        System.out.println("Before appending: " + fruits);
        fruits.add("date");
        System.out.println("After appending: " + fruits);
        fruits.addLast("elderberry");
        System.out.println("After appending: " + fruits);

    }

//    2.Write a Java program to iterate through all elements in a linked list.
    public static void iterateElements(){
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");

        for (String fruit : fruits){
            System.out.println(fruit);
        }
    }

//    3.Write a Java program to iterate through all elements in a linked list starting at the specified position.
    public static void iterateFromPosition(int position){
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

       if (position <0 || position>fruits.size()){
           System.out.println("Invalid position");
           return;
       }
       for ( int i = position; i < fruits.size(); i++){
           System.out.println(fruits.get(i));
       }
    }

//    4.Write a Java program to iterate a linked list in reverse order.
    public static void iterateInReverse(){
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("date");
        fruits.add("elderberry");

        for (int i=fruits.size(); i>0; i--){
            System.out.println(fruits.get(i-1));
        }

        //SAU
        System.out.println("Using descendingIterator:");
        Iterator<String> iterator = fruits.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }
    }

//    5. Write a Java program to insert the specified element at the specified position in the linked list.
    public static void insertElementAtPosition( int position, String element){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");

        if (position<0 || position > animals.size()){
            System.out.println("Invalid position");
            return;
        }
        System.out.println("Before inserting: " + animals);
        animals.add(position,element);
        System.out.println("After inserting " + element + " at position " + position + ": " + animals);
    }

//    6.Write a Java program to insert elements into the linked list at the first and last position
    public static void insertAtFirstAndLast(){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");

        System.out.println("Before inserting: " + animals);
        animals.addFirst("lion");
        animals.addLast("cow");
        System.out.println("After inserting at first and last: " + animals);
    }

//    7.Write a Java program to insert the specified element at the front of a linked list.
    public static void insertAtFront(String element){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");

        System.out.println("Before inserting at front: " + animals);
        animals.addFirst(element);
        System.out.println("After inserting " + element + " at front: " + animals);
    }

//    8. Write a Java program to insert the specified element at the end of a linked list.
    public static void insertAtEnd(String element){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");

        System.out.println("Before inderting at end: "+ animals);
        animals.addLast(element);
        System.out.println("After inserting " + element + " at end: " + animals);
    }

//    9.Write a Java program to insert some elements at the specified position into a linked list.
    public static void insertSomeElementsAtPosition(int position) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        LinkedList<Integer> elements = new LinkedList<>(Arrays.asList(5, 6, 7));

        System.out.println("Before inserting: " + numbers);
        if (position < 0 || position > numbers.size()){
            System.out.println("Invalid position");
        }else{
            numbers.addAll(position,elements);
            System.out.println("After inserting elements at position " + position + ": " + numbers);
        }

    }

//    10.Write a Java program to get the first and last occurrence of the specified elements in a linked list.
    public static void firstAndLastOccurrence(String element){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");
        animals.add("dog");

        int firstIndex = animals.indexOf(element);
        int lastIndex = animals.lastIndexOf(element);
        if (firstIndex >= 0) {
            System.out.println("First occurrence of " + element + " is at index: " + firstIndex);
        } else {
            System.out.println(element + " not found in the list.");
        }
        if (lastIndex >= 0) {
            System.out.println("Last occurrence of " + element + " is at index: " + lastIndex);
        } else {
            System.out.println(element + " not found in the list.");
        }
        


    }

//    11. Write a Java program to display the elements and their positions in a linked list.
    public static void displayElementsAndPositions(){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");

        for ( int i=0; i<animals.size(); i++){
            System.out.println("Element: " + animals.get(i) + ", Position: " + i);
        }
    }

//    12. Write a Java program to remove a specified element from a linked list.
    public static void removeElement(String element){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");

        System.out.println("Before removing: " + animals);
        if (animals.remove(element)){
            System.out.println("After removing " + element + ": " + animals);
        } else {
            System.out.println(element + " not found in the list.");
        }
    }

//    13. Write a Java program to remove first and last element from a linked list.
    public static void removeFirstAndLastElement(){
        LinkedList<String> animals = new LinkedList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        animals.add("rabbit");

        System.out.println("Before removing first and last: "+animals);
        if (!animals.isEmpty()){
            animals.removeFirst();
            animals.removeLast();
            System.out.println("After removing first and last: " + animals);
        }
        else {
            System.out.println("The list is empty, cannot remove elements.");
        }
    }

//    14. Write a Java program to remove all the elements from a linked list.
    public static void removeAllElements(){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Before removing all elements: " + numbers);
        numbers.clear();
        System.out.println("After removing all elements: " + numbers);
    }

//    15.Write a Java program of swap two elements in a linked list.
    public static void swapTwoElements(int index1, int index2){
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        if (index1 < 0 && index1 > numbers.size() && index2 < 0 && index2 > numbers.size()){
            System.out.println("Invalid indices");
            return;
        }
        System.out.println("Before swapping: " + numbers);
//        Integer temp1 = numbers.get(index1);
//        Integer temp2 = numbers.get(index2);
//        numbers.set(index1,temp2);
//        numbers.set(index2,temp1);
//       SAU
        Collections.swap(numbers,index1,index2);
        System.out.println("After swapping elements at indices " + index1 + " and " + index2 + ": " + numbers);
    }

//    16. Write a Java program to shuffle the elements in a linked list.
    public static void shuffleElements(){
        LinkedList<Integer> numbers =new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Before shuffling: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("After shuffling: " + numbers);
    }

//    17.Write a Java program to join two linked lists.
    public static void joinTwoLinkedLists(){
        LinkedList<String> list1 = new LinkedList<>(Arrays.asList("apple", "banana","cherry"));
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("dog","cat","horse"));
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        LinkedList<String> joinedList =new LinkedList<>(list1);
        joinedList.addAll(list2);
        System.out.println("Joined List: " + joinedList);
    }

//    18. Write a Java program to clone an linked list to another linked list.
    public static void cloneLinkedList(){
        LinkedList<String> original = new LinkedList<>(Arrays.asList("apple", "banana", "cherry"));
        LinkedList<String> cloned = (LinkedList<String>) original.clone();
        System.out.println("Original List: " + original);
        System.out.println("Cloned List: " + cloned);

    }

//    19.Write a Java program to remove and return the first element of a linked list.
    public static void removeFirstElement(){
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Before removing first element: " + numbers);
        if (!numbers.isEmpty()){
            int firstElement = numbers.removeFirst();
            System.out.println("After removing first element " + firstElement +": " + numbers);
        }
        else {
            System.out.println("The list is empty, cannot remove first element.");
        }
    }

//    20. Write a Java program to retrieve but does not remove, the first element of a linked list.
    public static void retrieveFirstElement(){
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println("Before retrieving first element: " + numbers);
        if (numbers.isEmpty()){
            System.out.println("The list is empty, cannot retrieve first element.");
        }

        int firstElement = numbers.peekFirst();
        System.out.println("First element: " + firstElement);
        System.out.println("After retrieving first element: " + numbers);


    }



}
