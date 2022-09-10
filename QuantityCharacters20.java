package homework;

import java.util.Scanner;

public class QuantityCharacters20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chuỗi ký tự bất kỳ :");
        String inputString = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.codePointAt(i) > 47 && inputString.codePointAt(i) < 58) {
                count ++;
            }
        }
        System.out.println("Số lượng ký tự số có trong chuỗi '" + inputString + "' là : " + count);
    }
}
