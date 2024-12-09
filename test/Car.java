package carPackage;

public class Car {
    private String brand;
    private int power;
    private String name;
    public boolean navigation;
    public String color;
    public int speed =0;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void modelPrint() {
        System.out.println("나의 애마"+this.name+"은"+this.brand+"브랜드"+power+"cc입니다.");
        System.out.println("색상은" + this.color +" 이고, "+ "네비게이션은");
    }

    public String getBrand() {
        return brand;
    }

    public int getPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public Car(String brand, int power, String name, boolean navigation, String color, int speed) {
        this.brand = brand;
        this.power = power;
        this.name = name;
        this.navigation = navigation;
        this.color = color;
        this.speed = speed;
    }

}

