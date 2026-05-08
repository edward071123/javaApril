package interfaceIntroduction;

public class Demo {
    public static void main(String[] args) throws Exception {
        // 介面interface 介紹&使用
        Dragon dragon1 = new Dragon();
        dragon1.fly();
        dragon1.circle();
        dragon1.fire(); 

        Bird bird1 = new Bird();
        bird1.circle();
        bird1.fly();
    }
}
