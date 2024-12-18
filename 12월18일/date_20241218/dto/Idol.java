package date_20241218.dto;

public class Idol {
    private String name;
    private int age;

    // 기본 생성자
    public Idol(){}

    public Idol(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void action() {

    }
}
