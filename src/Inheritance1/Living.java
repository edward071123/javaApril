package Inheritance1;

public class Living {
    private String type;

    public Living(String type) {
        setType(type);
        System.out.println("Living 建構子執行：類型是" + getType());
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}
