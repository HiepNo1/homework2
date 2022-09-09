package homework;

import java.util.Scanner;

public class Sum14 {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int evenOrOdd = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n :");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Please enter a positive integer!!!");
            System.out.print("Retype : ");
            number = scanner.nextInt();
        }
        for (int n = 1; n <= number; n++) {
            if (number % 2 == 0 && n % 2 == 0) {
                sumEven += n;
                evenOrOdd = 0;
            } else if (n % 2 == 1) {
                sumOdd += n;
                evenOrOdd = 1;
            }
        }
        if (evenOrOdd == 0) {
            System.out.println("Sum of even numbers from 1 to " + number + " is : " + sumEven);
        } else {
            System.out.println("Sum of odd numbers from 1 to " + number + " is : " + sumOdd);
        }
    }
}
