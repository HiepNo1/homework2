package homework;

import java.util.Scanner;

public class CountA19 {
    public static void main(String[] args) {
        String inputString = "";
        int count = 0;
        System.out.println("Nhập chuỗi bất kỳ :");
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.nextLine();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                count ++;
            }
        }
        System.out.println("Số ký tự a trong chuỗi '" + inputString + "' là : " + count);
    }
}
