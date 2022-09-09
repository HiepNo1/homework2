package homework;

import java.util.Scanner;

public class EquationOfDegree1 {
    public static void main(String[] args) {
        System.out.println("Giải pt bậc 1 ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        double inputA = 0;
        double inputB = 0;
        try {
            System.out.print("Enter a = ");
            inputA = scanner.nextDouble();
            System.out.println();
            System.out.print("Enter b = ");
            inputB = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Wrong format");
        }
        if (inputA == 0) {
            if (inputB == 0) {
                System.out.println("Pt có vô số nghiệm");
            }
            else {
                System.out.println("Pt vô nghiệm");
            }
        }
        else {
            System.out.println("Pt có nghiệm là : x = " + (-inputB / inputA));
        }
    }
}
