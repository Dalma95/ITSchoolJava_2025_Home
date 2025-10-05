package homework.StreamsOptional;


import java.util.List;
import java.util.stream.IntStream;
//3. Create a stream of numbers from 1 to 100 and use the filter operation to retain only those numbers which are prime.
public class Ex3 {
    public static void main(String[] args) {

        List<Integer> primeNumbers = IntStream.rangeClosed(1,100)
                .filter(Ex3 :: isPrime)
                .boxed()
                .toList();

        System.out.println(primeNumbers);
        
    }

    private static boolean isPrime(int n) {

        if(n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if ( n % i == 0) return false;
        }
        return true;
    }
}





