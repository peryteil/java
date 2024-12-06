package testPackage;

import java.util.Scanner;

public class SumClass {
    public static void main(String[] args) {
        int number;
        int sum;
        sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("합계를 계산 할 숫자를 입력하시요");
        number = scanner.nextInt();
        for (int i = 0; i <= number; i++) {
            sum = sum + i;
        }
        System.out.println("1부터"+number+"까지의 합은"+sum+"입니다.");
    }
}
