package day17;
class SecondSmallest {
    public static void main(String[] args) {

        int n = 583924;
        int smallest = 10;
        int secondSmallest = 10;

        while (n > 0) {
            int digit = n % 10;

            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            }
            else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }

            n = n / 10;
        }

        System.out.println("Second smallest digit: " + secondSmallest);
    }
}