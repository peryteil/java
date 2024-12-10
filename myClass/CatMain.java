package myClass;

import myClass.createClass.Cat;

public class CatMain {
    public static void main(String[] args) {
        Cat 야옹이 = new Cat();
        야옹이.catName = "야옹이";
        야옹이.catColor = "검정색";
        System.out.println(야옹이.catColor);
        System.out.println(야옹이.catName);

        // 토토 입양
        Cat toto = new Cat("토토", "노랑색");
        System.out.println(toto.catName);
        System.out.println(toto.catColor);
        // 오버 로딩
        Cat tutu = new Cat("투투", "흰색");
        System.out.println(tutu.catColor);
        System.out.println(tutu.catName);
    }
}
