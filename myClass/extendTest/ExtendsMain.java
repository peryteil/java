package myClass.extendTest;

public class ExtendsMain {
    public static void main(String[] args) {
        CheeseHamburger cheeseHamburger = new CheeseHamburger();
        System.out.println(cheeseHamburger.getName());
        System.out.println(cheeseHamburger.get재료1());
        System.out.println(cheeseHamburger.get재료2());
        System.out.println(cheeseHamburger.get재료3());
        System.out.println("======================================");
        ChickenBurger chickenBurger = new ChickenBurger();
        System.out.println(chickenBurger.getName());
        System.out.println(chickenBurger.get재료2());
        System.out.println(chickenBurger.get재료3());
        System.out.println("======================================");

        Hamburger burger = new Hamburger();
        System.out.println(burger.toString());

    }
}
