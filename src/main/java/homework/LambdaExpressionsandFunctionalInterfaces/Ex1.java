package homework.LambdaExpressionsandFunctionalInterfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// 1. Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
public class Ex1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Predicate<Integer> isEven = n -> n % 2 ==0 ;

        List<Integer> evenNumbers = new ArrayList<>();

        numbers.forEach(n ->{
            if (isEven.test(n)){
                evenNumbers.add(n);
            }
        });
        System.out.println(evenNumbers);




    }
}

