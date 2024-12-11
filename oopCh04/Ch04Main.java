package oopCh04;

public class Ch04Main {
    public static void main(String[] args) {
        Character u1 = new 광전사();
        Character u2 = new 궁수();
        Character u3 = new 전사();
        Character u4 = new 흑마법사();

        u4.basicAttack(u2);

        System.out.println(u1.getName());
        u1.basicAttack(u1);

        System.out.println(u2.getName());
        u2.basicAttack(u1);
        // 아무나 공격
        u3.basicAttack(u1);
    }
}
