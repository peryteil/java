package exam;

import java.util.Scanner;

public class 문제6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번쨰 수를 입력하세요 : ");
        int firstNumber = sc.nextInt();
        System.out.println("두번쨰 수를 입력하세요 : ");
        int secondNumber = sc.nextInt();
        //두 수릴 비교해서 첫째 값이 더 크면 두 수를 바꿔준다.

        System.out.println("두 수의 합은 :" + (firstNumber+secondNumber));
    }
}
