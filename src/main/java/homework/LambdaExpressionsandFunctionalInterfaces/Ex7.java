package homework.LambdaExpressionsandFunctionalInterfaces;
//7. Create a functional interface that takes a string and an integer n as parameters and returns a string. Implement it using a lambda expression that returns the first n characters of the string. If n is larger than the length of the string, it should return the full string.
public class Ex7 {
    public static void main(String[] args) {

        Characters firstN = ((word, n) -> word.substring(0,n));

        String word = "hipopotamus";
        int n = 3;

        if (n < 0){
            System.out.println("Invalid index");
        } else if (n > word.length()) {
            System.out.println(word);
        }else {
            System.out.println(firstN.firstCharacters(word,n));
        }
    }
}
@FunctionalInterface
interface Characters{
    String firstCharacters(String word, int n);
}
