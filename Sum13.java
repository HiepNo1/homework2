package homework;

import java.util.Scanner;

public class Sum13 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n :");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Please enter a positive integer!!!");
            System.out.print("Retype : ");
            number = scanner.nextInt();
        }
        for (int i = 1; i <= number; i++) {
            sum += number;
        }
        System.out.println();
        System.out.println("Sum of numbers from 1 to " + number + " is :" + sum);
    }
}
