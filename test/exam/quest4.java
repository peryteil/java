package exam;
//임의의 값 n이 주어지면
//   예를들어 n=5이면
//   1+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)
//   의 결과를 출력하세요.
public class quest4 {
    public static void main(String[] args) {
        int n = 5; // n 값을 설정
        int totalSum = 0; // 결과를 저장할 변수

        for (int i = 1; i <= n; i++) { // 1부터 n까지 반복
            for (int j = 1; j <= i; j++) { // 1부터 i까지 합산
                totalSum += j;
            }
        }

        System.out.println("결과: " + totalSum); // 최종 합 출력
    }
}
