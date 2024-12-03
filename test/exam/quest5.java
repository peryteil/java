package exam;

// money 변수 3780원의 금액이 있습니다.
//  이를 다음과 같은 결과가 나오도록 출력합니다.
public class quest5 {
    public static void main(String[] args) {
        int money = 3780; // 총 금액
        int[] units = {1000, 500, 100, 10}; // 화폐 단위 배열

        System.out.println("초기 금액: " + money + "원");

        for (int unit : units) {
            int count = money / unit; // 각 화폐 단위의 개수 계산
            money %= unit; // 남은 금액 계산

            System.out.println(unit + "원: " + count + "개");
            System.out.println("남은금액: " + money + "원");
        }
    }
}


