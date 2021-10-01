package oo.day03;

public class Student {
    String name;
    int age;
    String address;
    Student(String name, int age, String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    Student(String name, int age){
        this(name,age,null);
    }
    Student(String name){
        this(name,0,null);
    }

    void study(){
        System.out.println(name+"在学习。。。");
    }
    void sayHi(){
        System.out.println("大家好，我叫"+name+"。今年"+age+"岁"+",家在"+address);
    }
}

