package homework.LambdaExpressionsandFunctionalInterfaces;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//5. Create a functional interface that takes a list of integers and returns the maximum value from the list. Implement this interface using a lambda expression. Ensure your lambda correctly handles an empty list case.
public class Ex5 {
    public static void main(String[] args) {

        MaxFinder maxFinder = numbers -> {
            if (numbers == null || numbers.isEmpty()){
                System.out.println("The list is empty");
                return 0;
            }
            return Collections.max(numbers);
        };

        List<Integer> num1 = Arrays.asList(1,2,3,4,5);
        List<Integer> num2 = Arrays.asList();
        List<Integer> num3 = null;

        System.out.println(maxFinder.maxVal(num1));
        System.out.println(maxFinder.maxVal(num2));
        System.out.println(maxFinder.maxVal(num3));

    }
}
@FunctionalInterface
interface MaxFinder{
    int maxVal(List<Integer> numbers);
}
