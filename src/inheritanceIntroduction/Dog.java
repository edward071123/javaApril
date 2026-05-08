package inheritanceIntroduction;

public class Dog extends Animal{
    // Dog 為 Animal 的 sub class
    // Animal 為 Dog 的 parent class

    // 覆寫: 去改父類別的方法, 注意:要同樣的回傳型態 同樣輸入參數類型跟數量
    @Override
    public void eat() {
        System.out.println("這隻狗正在吃東西");
    }
}
