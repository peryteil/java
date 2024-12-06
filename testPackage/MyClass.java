package testPackage;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("나이를 입력하세요.");
        age = sc.nextInt();
        //System.out.println(age);
        if (age >= 20) {
            System.out.println("투표가능");
        } else {
            System.out.println("투표불가능");
        }
    }
}
