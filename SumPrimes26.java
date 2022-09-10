package homework;

import java.util.Scanner;

public class SumPrimes26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng số nguyên tố : ");
        int inputNumber = scanner.nextInt();
        while (inputNumber <= 0) {
            System.out.println("Chỉ nhập số nguyên dương");
            System.out.println("Nhập lại : ");
            inputNumber = scanner.nextInt();
        }
        int sum = 0;
        int n = 2;
        int count = 0;
        while (count < inputNumber) {
            if (Prime22.isPrime(n)) {
                count ++;
                sum += n;
            }
            n ++;
        }
        System.out.println("Tổng của " + inputNumber + " số nguyên tố đầu tiên là : " + sum);
    }
}
