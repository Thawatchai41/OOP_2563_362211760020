package LAB8;

public abstract class Object2D {

    //attributes
    private String b_color;
    private Double area;

    //abstract method
    abstract public void calArea();

    //getter and setter
    public String getB_color() {
        return b_color;
    }

    public void setB_color(String b_color) {
        this.b_color = b_color;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

}
