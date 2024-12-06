package testPackage;

import java.util.Scanner;

public class TestClass5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        while (true) {
            System.out.println("프로그램이 시작되었습니다.");
            System.out.println("종료하시겠습니까? (Y/N)");
            answer = scanner.next();
            answer = answer.toUpperCase();
            if (answer.equals("Y")) {
                return;
            }
        }
    }
}
