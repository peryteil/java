package carPackage;

public class CarMain {
    public static void main(String[] args) {
        boolean navigation = true;
        String navi;

        Car 현대 = new Car("현대", 2000, "그랜져", true, "흰색",0);
        Car 현대기아 = new Car("현대기아", 2000, "K5", false, "검정", 0);
        Car 삼성 = new Car("삼성", 2000, "sm6", true, "회색", 0);
        if ( 현대.navigation == true) {
            navi = "있습니다.";

        } else {  //&& 양쪽이 다 맞을 때 || 한쪽이라도 다 맞을 때
            navi = "없습니다.";
        }

                    System.out.println("나의 애마 "+현대.name+"는 "+현대.brand+" 브랜드 "+현대.power+" cc입니다.");
            System.out.println("색상은 " + 현대.color +"이고, "+ "네비게이션은 " + navi);
        if ( 현대기아.navigation == true) {
            navi = "있습니다.";

        } else {
            navi = "없습니다.";
        }
            System.out.println("나의 애마 "+현대기아.name+"는 "+현대기아.brand+" 브랜드 "+현대기아.power+" cc입니다.");
            System.out.println("색상은 " + 현대기아.color +"이고, "+ "네비게이션은 " + navi);
        if ( 삼성.navigation == true) {
            navi = "있습니다.";

        } else {
            navi = "없습니다.";
        }
            System.out.println("나의 애마 "+삼성.name+"는 "+삼성.brand+" 브랜드 "+삼성.power+" cc입니다.");
            System.out.println("색상은 " + 삼성.color +"이고, "+ "네비게이션은 " + navi);
    }
}
