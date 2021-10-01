package day06;

public class MethodDemo {
    public static void main(String[] args) {
        sayHi("王华臣",31);
        double a = getNum();
        System.out.println(a);
        int m=5,n=6;
        int b = plus(m,n);
        System.out.println(b);
    }
    public static void sayHi(String name,int age) {
        System.out.println("大家好，我叫"+name+"，今年"+age+"岁。");
    }
    public static double getNum(){
        return 88.88;
    }
    public static int plus(int num1,int num2){
        return num1+num2;
    }
}
