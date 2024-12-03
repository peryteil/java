package exam;

import java.io.*;
import java.util.*;

public class quest6 {
    public static void main(String[] args) {
        // 파일에서 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 입력된 문자열에서 A와 B 분리
        System.out.println("첫번째 수를 입력하세요: ");
        int a = scanner.nextInt();
        System.out.println("두번째 수를 입력하세요: ");
        int b = scanner.nextInt();

        // A와 B의 합 계산 및 출력
        System.out.println("합계 : " + (a + b));
    }
}

