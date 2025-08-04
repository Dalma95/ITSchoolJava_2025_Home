package homework.EqualsHashcodeGenericsEnum;
//11. Create a generic method to swap the positions of two elements in an array.
public class Exercise11 {
    public static <T> void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            System.out.println("Invalid indices or array is null.");
            return;
        }
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
