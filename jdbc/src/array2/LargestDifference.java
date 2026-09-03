package array2;
public class LargestDifference {
    public static void main(String[] args) {

        int[] arr = {10, 5, 20, 8, 30};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {

            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest difference = " + (max - min));
    }
}