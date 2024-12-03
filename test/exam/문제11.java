package exam;


public class 문제11 {
    public static void main(String[] args) {
                // 현재 시간 설정 (예: 10시 10분)
                int H = 0;
                int M = 30;

                // 45분 일찍 설정하기
                M -= 45;
                if (M < 0) {
                    M += 60;
                    H -= 1;
                }
                if (H < 0) {
                    H += 24;
                }

                // 결과 출력
                System.out.println(H + " " + M);
            }
        }

