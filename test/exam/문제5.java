package exam;

public class 문제5 {
    public static void main(String[] args) {
        //money 변수 3780원의 금액이 있습니다.
        //  이를 다음과 같은 결과가 나오도록 출력합니다.
        //1000원 : 3개 ===  1000으로 나눈 몫
        //남은금액 : 780원 == 1000으로 나눈 나머지 ==> 재활용
        int money=3_780;
        System.out.println("1000원 : "+ money +"개");
        money = money % 1000;
        System.out.println("남은금액:"+money+ "원");
        System.out.println("500원 : "+ money +"개");
        money = money % 500;
        System.out.println("남은금액:"+money+ "원");
        System.out.println("100원 : "+ money +"개");
        money = money % 100;
        System.out.println("남은금액:"+money+ "원");
        System.out.println("10원 : "+ money +"개");
        money = money % 10;
        System.out.println("남은금액:"+money+ "원");
        System.out.println("10원 : "+ money +"개");
    }
}
