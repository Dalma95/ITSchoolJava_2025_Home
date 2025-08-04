package homework.EqualsHashcodeGenericsEnum;
import java.util.ArrayList;
import java.util.List;

//10. Implement the toString method in a class holding a large dataset to print a “summary” version of the dataset, facilitating debugging and logging.
public class Exercise10 {
    public static void main(String[] args) {
        List<Double> values = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            values.add((double) i);
        }

        LargeDataSet dataset = new LargeDataSet(values);
        System.out.println(dataset);
    }
    }


