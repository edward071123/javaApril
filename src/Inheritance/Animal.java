package Inheritance;

public class Animal {
    public void eat() {
        System.out.println("這個動物正在吃東西");
    }

    // final: 不允許子類別繼承後覆寫
    public final void sleep() {
        System.out.println("這個動物正在睡覺");
    }
}
