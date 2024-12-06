package testPackage;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하시오.");
        score = sc.nextInt();
        //System.out.println(score);
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}