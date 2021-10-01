package oo.day04;

public class UploadDemo {
    public static void main(String[] args) {
        Aoo o1 =new Aoo();
        o1.a =1;
        o1.shou();
        //o1.test(); 编译错误
        //o1.b=2; 超类不能访问派生类

        Boo o2 =new Boo();
        o2.b=1;
        o2.test();
        o2.a=1;
        o2.shou();

        Aoo o3=new Boo();
        //o3.b=1; 编译错误
        //o3.test(); 能点出什么看引用类型
        o3.a=1;
        o3.shou();
    }
}

class Aoo{
    int a;
    void shou(){}
}

class Boo extends Aoo{
    int b;
    void test(){}
}
