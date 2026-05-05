package Inheritance1;

public class Dog extends Animal{
    private String breed;

    public Dog(String type, String name, String breed) {
        super(name, type);
        setBreed(breed);
        System.out.println("Dog 建構子執行：品種是 " + getBreed());
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }
}
