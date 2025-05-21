package classsample;

/*
 * これがクラスを理解するためのファイル
 * Personクラスを定義し，それをインスタンス化することで，値を呼び出している
 * Main.Javaを実行すれば良い
 * 
 * personクラス(person.java)で定義した属性が，pubricなので，Gojo.nameなどとすれば，その値にアクセスできてしまう
 * これは，あまり芳しくない．そのため，カプセル化をする必要がある．
*/

public class Main {
    public static void main(String[] args) {
        Person Gojo ;
        Gojo = new Person("Gojo Masaru", 28);

        System.out.println(Gojo.name+"と申します");
        System.out.println(Gojo.age+"歳です");

        Person Geto ;
        Geto = new Person("Geto satoru", 27);

        System.out.println(Geto.name+"と申します");
        System.out.println(Geto.age+"歳です");
    }
}
