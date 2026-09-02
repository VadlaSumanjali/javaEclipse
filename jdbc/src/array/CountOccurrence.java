package array;

public class CountOccurrence {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 10, 40};

        int target = 10;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                count++;
            }
        }

        System.out.println("Occurrence = " + count);
    }
}
