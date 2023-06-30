import java.util.function.Predicate;

public class TwentyNine {
    public static int myFilter(int[] myArray, Predicate<Integer> callback) {
        int sum = 0;
        for (int number : myArray) {
            if (callback.test(number)) {
                sum += number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int result = myFilter(myArray, number -> {
            int sum = 0;
            for (char digit : String.valueOf(number).toCharArray()) {
                sum += Character.getNumericValue(digit);
            }
            return sum % 2 == 0;
        });
        System.out.println(result); // Output: 15
    }
}