package homework;

import java.util.Scanner;

public class SumPrime {
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n :");
        int inputNumber = scanner.nextInt();
        while (inputNumber <= 0) {
            System.out.println("Please enter a positive integer!!!");
            System.out.print("Retype : ");
            inputNumber = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < inputNumber; i++){
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("Tổng các số nguyên tố nhỏ hơn n : " + sum);
    }
}
