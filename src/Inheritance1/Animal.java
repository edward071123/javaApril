package Inheritance1;

public class Animal extends Living{
    private String name;
    // 因為繼承了Living 所以Animal的建構子會呼叫父類別的建構子
    public Animal(String name, String type) {
        // super(): 呼叫父類別建構子
        super(type);
        setName(name);
        System.out.println("Animal 建構子執行：名字是 " + getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
