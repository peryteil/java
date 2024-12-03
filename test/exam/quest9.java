package exam;
import java.util.Scanner;
public class quest9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력 받기
        System.out.print("출력할 줄 수를 입력하세요: ");
        int n = scanner.nextInt();

        // 별 출력
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}


