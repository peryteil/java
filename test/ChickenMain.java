package myClass.chicken;

public class ChickenMain {
    public static void main(String[] args) {
        Chicken jadam = new Chicken();
        jadam.setModel("권원비");

        jadam.brand = "자담";
        jadam.meun = "간장순살치킨";
        jadam.price = 19000;
        System.out.println(jadam.brand + " " + jadam.meun + "을 " + jadam.price+"원에 주문했습니다.");
//        System.out.println(jadam.brand + " 모델은 "+ jadam.getModel());
        jadam.modelPrint();

    Chicken 교촌 = new Chicken("교촌", " 간장치킨", 21000);
        System.out.println(교촌.brand+" "+교촌.meun+"을 "+교촌.price+"원에 주문햇습니다.");
    Chicken 비비큐 = new Chicken("비비큐", " 황금올리브치킨", 23000);
        System.out.println(비비큐.brand + " " + 비비큐.meun + "을 " + 비비큐.price + "원에 주문했습니다.");
    }
}
