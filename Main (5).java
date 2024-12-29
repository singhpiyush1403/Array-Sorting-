import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 1, 2};

        System.out.println("Original Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));
    }
}