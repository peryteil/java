package carPackage;

public class Car {
    private String brand;
    private int power;
    private String name;
    private boolean navigation;
    private String color;
    private int speed;

    public String carInfo() {
        //출력
        String info = " 나의 애마 " + this.name + "은 " + this.brand + "브랜드 " + this.power + "cc입니다.";
        return info;
    }

    public Car( String brand, int power, String name) {
        this.brand = brand;
        this.power = power;
        this.name = name;
    }

    public void speedUp() {
        this.speed = this.speed + 5;

    }

    public void speedDown() {
        this.speed = this.speed - 5;

    }

    //speed getter 생성
    public int getSpeed() {
        return this.speed;
    }
    //color getter
    public String getColor() {
        return this.color;
    }

    //color setter
    public void setColor(String color) {
        this.color = color;
    }
    //네비게이션의 getter
    public boolean getNavigation() {
        return this.navigation;
    }

    //네비게이션의 setter
    public void setNavigation(boolean navigation) {
        this.navigation = navigation;
    }



}

