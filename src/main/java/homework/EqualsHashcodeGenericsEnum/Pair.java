package homework.EqualsHashcodeGenericsEnum;
//12. Create a class Pair which can hold a pair of objects, the objects can be of any type.
public class Pair <T, U>{
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }

}
