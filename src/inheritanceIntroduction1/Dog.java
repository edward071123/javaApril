package inheritanceIntroduction1;

public class Dog extends Animal{
    private String breed;

    // 因為繼承了Animal 所以Dog的建構子會呼叫父類別的建構子
    public Dog(String type, String name, String breed) {
        // super(): 呼叫父類別建構子
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
