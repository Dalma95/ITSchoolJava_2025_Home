package homework.LambdaExpressionsandFunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

//3. Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
public class Ex3 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,4,6,2);

        IntBinaryOperator addition = (a, b) -> a+b;

        int sum = 0;

        for (int n : numbers){
            sum = addition.applyAsInt(sum, n);
        }
        System.out.println("Sum = " + sum);
    }
}
