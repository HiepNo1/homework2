package homework;

import java.util.Scanner;

public class UCLN23 {
    public static void main(String[] args) {
        int input1 = 0;
        int input2 = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter number 1 : ");
            input1 = scanner.nextInt();
            System.out.println();
            System.out.print("Enter number 2 : ");
            input2 = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Chỉ nhập số nguyên");
        }
        while (input1 != input2) {
            if (input1 > input2) {
                input1 -= input2;
            }
            else {
                input2 -= input1;
            }
        }
        System.out.println("UCLN là : " + input2);
    }
}
