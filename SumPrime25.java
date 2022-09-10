package homework;

import java.util.Scanner;

public class SumPrime25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer n : ");
        int inputNumber = scanner.nextInt();
        while (inputNumber <= 0) {
            System.out.println("Please enter a positive integer!!!");
            System.out.print("Retype : ");
            inputNumber = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 1; i < inputNumber; i++){
            if (Prime22.isPrime(i)) {
                sum += i;
            }
        }
        System.out.println("Tổng các số nguyên tố nhỏ hơn " + inputNumber + " là : " + sum);
    }
}
