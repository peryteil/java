package myClass.extendTest;

public class CheeseHamburger extends Hamburger {
    private String name = "치즈햄버거";
    private String 재료3 = "치즈듬뿍";

    @Override
    public void order() {
        
        System.out.println("치즈버거 주문완료");
    }

    public String get재료3() {
        return this.재료3;
    }

    public void setName(String name) {
        this.name = name;
    }
    // 상속은 부모가 정의한 걸 내가 다시 가져다 쓰는 것
    // overriding 부모 클래스를 재정의 해서 자식게 다시 쓰이는 것
    public String getName() {
        return name;
    }
}
