package ch01;

public class SwitchCastTest {
    public static void main(String[] args) {
        int value = 83;
        value = value / 10;
        switch (value) {
            case 8:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("case 4");

        }
    }
}
