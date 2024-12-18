package date_20241218.dto;

public class BoyGroup extends Group{
    private String name;

    @Override
    public void greeting() {
        System.out.println("안녕하세요 세븐틴이에요");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
