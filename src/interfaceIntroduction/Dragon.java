package interfaceIntroduction;

public class Dragon implements IFlyable , IFireable{

    @Override
    public void fly(){
        System.out.println("這條龍學會了直線飛行");
    }

    @Override
    public void circle(){
        System.out.println("這條龍學會了盤旋飛行");
    }

    @Override
    public void fire(){
        System.out.println("這條龍學會了噴火");
    }
}
