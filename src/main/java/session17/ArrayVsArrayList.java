package session17;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        int [] array = new int[5];

        array[0]=10;
        array[1]=20;
        array[2]=15;
        array[3]=30;

        System.out.println(Arrays.toString(array));

        for ( int i=0; i<5; i++){
            System.out.println("Element from array from position "+i+ " with value "+array[i]);
        }
        for (int elements : array){
            System.out.println(elements);
        }

        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(20);
        myArrayList.add(12);
        myArrayList.add(30);
        System.out.println(myArrayList);
        myArrayList.remove(2);
        System.out.println(myArrayList);
    }



}
