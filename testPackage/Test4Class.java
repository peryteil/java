package testPackage;

import java.util.Arrays;
import java.util.Scanner;

public class Test4Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        int numner; //과일박스 번호 받는 용도
        int[] a = {1, 2, 3, 4};
        String[] 과일박스 = new String[5]; //제품명
        int[] price = new int[5]; //단가
        System.out.println(a[2]);
        a[1] = 7;
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        과일박스[0] = "사과";
        과일박스[1] = "배";
        과일박스[2] = "귤";
        price[0] = 500;
        price[1] = 1000;
        price[2] = 300;
        //System.out.println(Arrays.toString(과일박스));

        while (true) {
            System.out.println("과일 박스 번호를 입력하세요.");
            numner = scanner.nextInt();
            if (과일박스[numner] == null) {
                System.out.println("해당하는 제품은 없습니다.");
            } else {
                System.out.println(과일박스[numner] + ":" + price[numner]);
            }
            System.out.println("종료하시겠습니까? (Y/N)");
            answer = scanner.next();
            answer = answer.toUpperCase();
            if (answer.equals("Y")) {
                return;
        }
    }
}
}
