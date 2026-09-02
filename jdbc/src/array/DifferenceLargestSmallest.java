package array;

public class DifferenceLargestSmallest {
    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 5, 30};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int difference = largest - smallest;

        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
        System.out.println("Difference = " + difference);
    }
}
