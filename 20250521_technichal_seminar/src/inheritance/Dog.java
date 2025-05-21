package inheritance;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public void speak() {
        System.out.println(getName() + "(" + getAge() + "歳): ワンワン");
    }
}