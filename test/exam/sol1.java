package exam;

public class sol1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 6) continue;

            System.out.println(" i = " + i);
            //while
            int j = 0;
            while (j <= 10) {
                j++;
                if (j == 6) {
                    continue;
                }
                System.out.println("j=" + j);
                j++;
            }
        }
    }
}
