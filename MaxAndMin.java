package homework;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử : ");
        int number = scanner.nextInt();
        while (number <= 0) {
            System.out.println("Please enter a positive integer!!!");
            System.out.print("Retype : ");
            number = scanner.nextInt();
        }

        int[] inputArray = new int[number];
        System.out.println("Nhập các phần tử :");
        for (int i = 0; i < number; i++) {
            inputArray[i] = scanner.nextInt();
        }

        int max = inputArray[0];
        int min = inputArray[0];
        for (int num : inputArray) {
            if (max < num) {
                max = num;
            }
            if (min > num) {
                min = num;
            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);
    }
}
