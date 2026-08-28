package day17;
class Difference {
    public static void main(String[] args) {

        int n = 583924;

        int largest = 0;
        int smallest = 9;

        while (n > 0) {
            int digit = n % 10;

            if (digit > largest) {
                largest = digit;
            }

            if (digit < smallest) {
                smallest = digit;
            }

            n = n / 10;
        }

        int difference = largest - smallest;

        System.out.println("Difference: " + difference);
    }
}
