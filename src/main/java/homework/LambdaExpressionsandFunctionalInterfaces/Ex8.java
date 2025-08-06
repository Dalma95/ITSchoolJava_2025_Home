package homework.LambdaExpressionsandFunctionalInterfaces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//8. Create a functional interface that takes a List<Integer> and a function that takes an integer as input and returns an integer. Implement this interface using a lambda expression to apply the function to each element in the list, returning a new list with the mapped values.
public class Ex8 {
    public static void main(String[] args) {

        NumberTransformer transformer = (numbers -> {
            Map<Integer, Integer> transformationMap= new HashMap<>();
            for (int number : numbers) {
                transformationMap.put(number, NumberTransformer.values(number));
            }
            return transformationMap;
        });
        List<Integer> inputNumbers = Arrays.asList(1, 2, 3, 4);
        Map<Integer, Integer> result = transformer.keys(inputNumbers);

        System.out.println(result);
    }
}
@FunctionalInterface
interface NumberTransformer{
    Map<Integer, Integer> keys (List<Integer> elem);

    static int values(int n){
        return n *10;
    }
}