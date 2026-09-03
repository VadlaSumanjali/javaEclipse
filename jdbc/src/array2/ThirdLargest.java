package array2;
public class ThirdLargest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 30, 15, 25};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                third = second;
                second = num;
            }
            else if (num > third && num != second && num != first) {
                third = num;
            }
        }

        System.out.println("Third largest = " + third);
    }
}