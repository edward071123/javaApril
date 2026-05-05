package Inheritance;

public class Animal1 {
    private String name;
    public Animal1(String name){
        this.setName(name);
        System.out.println("Animal1 呼叫");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void eat() {
        System.out.println("這個動物正在吃東西");
    }

    // final: 不允許子類別繼承後覆寫
    public final void sleep() {
        System.out.println("這個動物正在睡覺");
    }
}
