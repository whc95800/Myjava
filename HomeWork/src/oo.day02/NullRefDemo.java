package oo.day02;

public class NullRefDemo {
    public static void main(String[] args) {
        Student zs = new Student("zhangsan",25,"LF");
        Student lls = zs;
        lls.age=99;
        System.out.println(zs.age);
        zs=null;
        System.out.println(zs.age);
    }
}
