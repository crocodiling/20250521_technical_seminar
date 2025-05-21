package capsule;
public class Person {
    // プロパティ（フィールド）
    private String name;
    private int age;
    
    // コンストラクタ
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // ゲッター
    public String getName() {
        return this.name;
    }
    
    public int getAge() {
        return this.age;
    }
    
    // セッター
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
}
