package inheritanceIntroduction;

public class Bird extends Animal1{
    int age;
    public Bird(String name, int age){
        // 呼叫父類別的建構子
        super(name);
        this.setAge(age);
        System.out.println("Bird 呼叫");
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
}
