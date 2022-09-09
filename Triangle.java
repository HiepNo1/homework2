package tamgiac;

import java.util.Scanner;

public class Triangle {
    private double edgeA;
    private double edgeB;
    private double edgeC;

    Triangle() {

    }
    public void inputEdgeAndExport() {
        System.out.println("Enter 3 edge of triangle");
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Edge a = ");
            edgeA = scanner.nextDouble();
            System.out.println("Edge b = ");
            edgeB = scanner.nextDouble();
            System.out.println("Edge c = ");
            edgeC = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Wrong format !!!");
        }
        if(Math.abs(edgeA - edgeB) < edgeC || edgeA + edgeB > edgeC) {
            System.out.println("Perimeter of triangle is :" + this.perimeterOfTriangle());
        } else {
            while (true) {
                System.out.println("Retype");
                System.out.println("Edge a = ");
                edgeA = scanner.nextDouble();
                System.out.println("Edge b = ");
                edgeB = scanner.nextDouble();
                System.out.println("Edge c = ");
                edgeC = scanner.nextDouble();
            }
        }
    }
    public double perimeterOfTriangle() {
        return this.edgeA + this.edgeB + this.edgeC;
    }
}
