package exam;

public class quest2 {
    public static void main(String[] args) {
        int i = 10; // 초기값 설정
        do {
            if (i == 3) {
                i--; // 3을 건너뛰기 위해 감소
                continue;
            }
            System.out.println(i);
            i--; // 다음 숫자로 감소
        } while (i >= 1); // 1까지 반복
    }
}