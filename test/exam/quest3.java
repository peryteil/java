package exam;
//1부터 20까지의 수를 출력하세요. (단, 2의 배수일 때만 출력하세요)
//      for 문법 사용
public class quest3 {
    public static void main(String[] args) {
        // for 문 사용
        for (int i = 10; i >= 1; i--) { // 10부터 1까지 감소
            if (i == 3) {
                continue; // 숫자가 3일 경우 출력하지 않고 건너뜀
            }
            System.out.println(i);
        }
    }
}
