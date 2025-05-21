package capsule;

public class Main {
    public static void main(String[] args) {
        Person Gojo;
        Gojo  = new Person ("Gojo Masaru",28);

        Person Geto;
        Geto = new Person ("Geto Suguru",27);
        
        // ゲッターによって値を獲得
        System.out.println(Gojo.getName()+"と申します");
        System.out.println(Gojo.getAge()+"歳です");

        System.out.println(Geto.getName()+"と申します");
        System.out.println(Geto.getAge()+"歳です");

        System.out.println("Geto Satoruは誕生日を迎えて，28歳になりました");

        //セッターによって，年齢を更新
        Geto.setAge(28);
        System.out.println("Geto Satoruの年齢は" + Geto.getAge()+"歳です");
    }
}