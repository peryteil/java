package exam;
import java.util.Scanner;
public class quest7 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // 사용자로부터 A와 B 입력받기
        System.out.print("정수 A를 입력하세요 (A > 0): ");
        int A = scanner.nextInt();
        System.out.print("정수 B를 입력하세요 (B < 10): ");
        int B = scanner.nextInt();

        // A와 B의 유효성 검사
        if (A <= 0 || B >= 10) {
            System.out.println("입력값이 조건을 만족하지 않습니다. (A > 0, B < 10)");
            return;
        }

        // 두 수 사이의 모든 정수 더하기
        int start = Math.min(A, B); // A와 B 중 작은 값
        int end = Math.max(A, B);   // A와 B 중 큰 값
        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        // 결과 출력
        System.out.println("두 수 사이의 모든 정수의 합: " + sum);
    }
}

