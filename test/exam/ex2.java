package exam;

public class ex2 {
    public static void main(String[] args) {
                int i = 10; // 초기값 설정
                do {
                    if (i == 3) {
                        i--; // 숫자 3은 건너뛰고 감소
                        continue;
                    }
                    System.out.println(i);
                    i--; // 다음 숫자로 감소
                } while (i >= 1); // 1 이상일 때 반복
            }
        }

