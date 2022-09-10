package homework;

import java.util.Scanner;

public class Fibonacci27 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập vào số lượng số fibonacci(lớn hơn 2) : ");
        int inputNumber = scanner.nextInt();
        System.out.println();
        int[] fibonacci = new int[inputNumber];

        fibonacci[0] = 1;
        fibonacci[1] = 1;
        for (int i = 2; i < inputNumber; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        System.out.println(inputNumber + " số đầu tiên của dãy Fibonacci là : ");
        for (int n : fibonacci) {
            System.out.print(n + "\t");
        }
    }
}
