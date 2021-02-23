package LAB8;

public class Triangle extends Object2D {

    //constant
    private  static  final  double Con = 0.5;

    //attribute
    private  double base;
    private  double height;

    //constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calArea() {
        double area = Con * base * height;
        super.setArea(area);
    }

}
