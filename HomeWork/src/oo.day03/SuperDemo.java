package oo.day03;

public class SuperDemo {
    public static void main(String[] args) {
        Boo o = new Boo();
    }
}


class Aoo{
    Aoo(){
        System.out.println("超类的构造方法");
    }
}

class Boo extends Aoo{
    Boo(){
        System.out.println("派生类的构造方法");
    }
}