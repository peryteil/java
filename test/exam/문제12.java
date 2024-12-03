package exam;

import java.util.Scanner;

public class 문제12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 받기
        System.out.print("현재 알람 시각 (시 분): ");
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        // 45분 일찍 설정하기
        M -= 45;
        if (M < 0) {
            M += 60;
            H -= 1;
        }
        if (H < 0) {
            H += 24;
        }

        // 결과 출력
        System.out.println(H + " " + M);

        scanner.close();
    }
}

