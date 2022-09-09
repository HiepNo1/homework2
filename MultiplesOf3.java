package homework;

public class MultiplesOf3 {
    public static void main(String[] args) {
        for (int number = 300; number >= 3; number--) {
            if (number % 3 == 0) {
                System.out.println(number);
            }
        }
    }
}
