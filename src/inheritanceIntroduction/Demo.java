package inheritanceIntroduction;

public class Demo {
    public static void main(String[] args) throws Exception {
        // Dog d1 = new Dog();
        // d1.eat();

        // Cat c2 = new Cat();
        // c2.eat();

        Bird b3 = new Bird("鳥1", 10);
        System.out.println("名稱:" + b3.getName());
        System.out.println("年齡:" + b3.getAge());
    }
}
