package array;

public class EvenIndexSum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Even index sum = " + sum);
    }
}