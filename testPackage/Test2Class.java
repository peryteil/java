package testPackage;

import java.util.Scanner;

public class Test2Class {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        //1.수 한개를 입력받는다
        //2.홀수인지 짝수인지 확인한다.
        //3.결과를 출력한다.
        System.out.println("수(한개)를 입력 하세요");
        number= sc.nextInt();
        if ((number % 2) != 0) {
            System.out.println("홀수");
        } else {
            System.out.println("짝수");
        }
    }
}
