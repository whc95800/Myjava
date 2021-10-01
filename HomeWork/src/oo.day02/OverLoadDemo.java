package oo.day02;

public class OverLoadDemo {
    public static void main(String[] args) {
        Aoo o = new Aoo();
        o.say();
        o.say("zhangsan");
        o.say(25);
        o.say(25,"zhangsan");
        o.say("zhangsan",25);

    }
}

class Aoo{
    void say(){}
    void say(String name){}
    void say(int age){}
    void say(String name,int age){}
    void say(int age,String name){}
}
