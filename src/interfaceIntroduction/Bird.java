package interfaceIntroduction;

public class Bird implements IFlyable{

    @Override
    public void fly(){
        System.out.println("這隻鳥學會了直線慢飛行");
    }

    @Override
    public void circle(){
        System.out.println("這隻鳥學會了盤旋慢飛行");
    }
}
