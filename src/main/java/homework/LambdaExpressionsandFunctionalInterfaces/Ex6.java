package homework.LambdaExpressionsandFunctionalInterfaces;
//6. Create a functional interface with a method that takes two strings as input and returns an integer. Implement this interface using a lambda expression to create a custom comparator that compares strings based on their length (not lexicographically).
public class Ex6 {
    public static void main(String[] args) {

        StringLenght comparator = ((w1, w2) -> Integer.compare(w1.length(),w2.length()));

        String word1 = "mere";
        String word2 = "apa";

        int result = comparator.compareLenght(word1,word2);

        if (result > 0){
            System.out.println("\"" + word1 + "\" is longer than \"" + word2 + "\"");
        } else if (result < 0) {
            System.out.println("\"" + word1 + "\" is shorter than \"" + word2 + "\"");
        }
        else {
            System.out.println("They are the same lenght.");
        }


    }
}
@FunctionalInterface
interface StringLenght{
    int compareLenght (String w1, String w2);
}

//* The Integer.compare method returns:
//
//A negative number if s1 is shorter than s2
//
//Zero if they are the same length
//
//A positive number if s1 is longer than s2*//
