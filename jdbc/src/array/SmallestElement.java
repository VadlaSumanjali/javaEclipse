package array;
public class SmallestElement {
    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 80, 5};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest = " + smallest);
    }
}