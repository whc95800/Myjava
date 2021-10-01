package the.co.jp.PassObject;

class Circle {
    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
}

public class PassObject {
    public void printArea(Circle c, int time) {
        System.out.println("Radius" + "\t\t" + "Area");
        int temp  = 0;
        for (int i = 1; i <=time; i++,temp=i) {
            c.setRadius(i);
            System.out.println(c.getRadius() + "\t\t\t" + c.findArea());
        }
        c.setRadius(temp);
    }

    public static void main(String[] args) {
        PassObject a = new PassObject();
        Circle c = new Circle();
        a.printArea(c, 5);
        System.out.println("now radius is "+c.getRadius());
    }
}
