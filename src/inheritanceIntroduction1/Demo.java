package inheritanceIntroduction1;

public class Demo {
    public static void main(String[] args) throws Exception {
        // 定義：生物 (Living) → 動物 (Animal) → 狗狗 (Dog)
        // Live的屬性 String type; 種類:哺乳類
        // Animal的屬性 String name; 名字: 小白
        // Dog的屬性 String breed; 品種: 柴犬
        Dog d2 = new Dog("哺乳類", "小白", "柴犬");

        // Living 建構子執行：類型是 哺乳類
        // Animal 建構子執行：名字是 小白
        // Dog 建構子執行：品種是 柴犬
    }
}
