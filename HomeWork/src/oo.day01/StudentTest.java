package oo.day01;

public class StudentTest {
    public static void main(String[] args) {
        Student whc = new Student();
        whc.name="王华臣";
        whc.age=31;
        whc.address="辽宁省大连市";
        whc.study();
        whc.sayHi();

        Student wmn = new Student();
        wmn.study();
        wmn.sayHi();




    }
}
