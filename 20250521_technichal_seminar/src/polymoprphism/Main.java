package polymoprphism;

public class Main{
    public static void main(String[] args) {
        Animal Hachi = new Dog(); // Animal型としてDogを扱う
        Animal Tama = new Cat(); // Animal型としてCatを扱う

        Hachi.speak(); // 実行時には Dog の speak が呼ばれる →
        Tama.speak(); // 実行時には Cat の speak が呼ばれる → 

    }
}