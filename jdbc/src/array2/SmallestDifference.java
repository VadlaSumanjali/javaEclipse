package array2;
import java.util.Arrays;

public class SmallestDifference {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 30};

        Arrays.sort(arr);

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {

            int difference = arr[i + 1] - arr[i];

            if (difference < minDifference) {
                minDifference = difference;
            }
        }

        System.out.println("Smallest difference = " + minDifference);
    }
}
