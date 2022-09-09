package homework;

public class SumEvenNumber10 {
    public static void main(String[] args) {
        int count = 0;
        int sumEvenNumber = 0;
        for (int number = 1; number < 100 ; number++) {
            if (number % 2 == 0) {
                count++;
                sumEvenNumber += number;
                if (count == 10){
                    break;
                }
            }
        }
        System.out.println("Sum of the first 10 even numbers is :" + sumEvenNumber);
    }
}
