package the.co.jp.classTest;

public class TestCircle {
    public static void main(String[] args) {
        Circle b = new Circle();
        b.r(2);
        b.Calculation();
    }
}
 class Circle{
    double radius;
    public double r(double i){
        radius=i;
        return radius;
    }
    public void Calculation(){
        System.out.println(3.14*radius*radius);
    }
 }