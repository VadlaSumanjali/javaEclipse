package array;

public class LastOccurrence {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};

        int target = 20;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                index = i;
            }
        }

        System.out.println("Last occurrence index = " + index);
    }
}