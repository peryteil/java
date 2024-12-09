package myClass.chicken;

import java.awt.color.ICC_ColorSpace;

public class Chicken {
    public String brand;
    public String meun;
    public int price;
    public String model;

    public void modelPrint(){
        System.out.println(this.brand+"의 모델은 " + this.model+"입니다.");
    }


    public void setModel(String model) {
        this.model = model;
    }

    public Chicken() {

    }

    public Chicken(String chickenbrand, String chickenmeun, int chickenprice) {
        this.brand = chickenbrand;
        this.meun = chickenmeun;
        this.price = chickenprice;
    }
}

