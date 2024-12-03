package exam;

import java.util.Scanner;

public class quest8 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // 정수 N 입력 받기
        System.out.print("출력할 줄 수를 입력하세요: ");
        int N = scanner.nextInt();

        // N번 반복하며 별 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // 줄바꿈
        }
    }
}
