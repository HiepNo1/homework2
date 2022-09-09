package homework;

public class MultiplesOf7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1; number <= 100; number++) {
            if (number % 7 == 0) {
                sum += number;
                System.out.println(number);
            }
        }
        System.out.println("Sum of numbers that are multiples of 7 is : " + sum);
    }
}
