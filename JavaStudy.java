package basic;

import java.util.Scanner;

public class JavaStudy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("나이를 입력해주세요.");
        //나이 입력받기
        age = scanner.nextInt();
        System.out.println(age);
        //20세 이상인지 아닌지 여부 판단
        if (age >= 20) {
            System.out.println("투표가 가능합니다.");
        } else {
            System.out.println("투표가 가능하지 않습니다.");
        }
    }
}
