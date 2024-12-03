package exam;

public class ex1 {
    public static void main(String[] args) {
        for ( int i = 1; i <= 10; i++ ){
            if (i == 6 ) continue;
            System.out.println(i);
        }
        int j = 1;
        while (j <= 10) {
            if (j == 6 ) {
                j= j+1;
                continue;
            }
            System.out.println(j);
            j= j+1;

        }
    }
}



