package Inheritance1;

public class Animal extends Living{
    private String name;

    public Animal(String name, String type) {
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
