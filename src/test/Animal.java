package test;

public class Animal {
    private int age;
    private String name, sex;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

class Whale extends Animal{
    private boolean swim;

    public boolean isSwim() {
        return swim;
    }

    public void setSwim(boolean swim) {
        this.swim = swim;
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Whale w = new Whale();
        w.setName("고래");
        w.setAge(5);
        w.setSwim(true);
        System.out.println("이름: " + w.getName());
        System.out.println("나이: " + w.getAge());
        System.out.println("수영여부: " + w.isSwim());
    }
}