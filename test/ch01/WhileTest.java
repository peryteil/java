package ch01;

public class WhileTest {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while  (i <=10) {
            sum = sum + i;
            i = i + 1;
            System.out.println("print");
        }
        sum = 0;
        i = 1;
        do {
            sum = sum + i;
            i = i + 1;
        }while (i <= 10);
        System.out.println(sum);
    }
}
