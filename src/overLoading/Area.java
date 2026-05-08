package overLoading;

public class Area {

    public void cal(int h , int w){
        int area = h * w;
        System.out.println("長方形的面積為:" + area);
    }

    public void cal(int r){
        int area = r * r;
        System.out.println("正方形的面積為:" + area);
    }

    public void cal(int r, String shape){
        double area = r * r * 3.14;
        System.out.println(shape + "的面積為:" + area);
    }

    public void cal(double r){
        double area = r * r * 3.14;
        System.out.println("圓形的面積為:" + area);
    }

    public void cal(int b, int h, String shape){
        int area = b * h / 2;
        System.out.println(shape + "的面積為:" + area);
    }

}
