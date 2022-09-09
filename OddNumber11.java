package homework;

public class OddNumber11 {
    public static void main(String[] args) {
        for (int number = 0; number < 100; number++) {
            if(number % 2 != 1) {
                continue;
            }
            System.out.print(number + " ");
        }
    }
}
