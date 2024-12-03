package exam;

public class ex1while {
    public static void main(String[] args) {
        int i = 1; // 초기값 설정
        while (i <= 10) { // 1부터 10까지 반복
            if (i == 6) {
                i++; // 6을 건너뛰기 위해 증가
                continue;
            }
            System.out.println(i);
            i++; // 다음 숫자로 증가
        }
    }
}


