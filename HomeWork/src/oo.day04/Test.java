package oo.day04;

public class Test {
    public static void main(String[] args) {
        Person[] ps = new Person[5];
        ps[0]=new Student("zhangsan",25,"LF","111");
        ps[1]=new Student("lisi",24,"MJF","111");
        ps[2]=new Teacher("wangwu",26,"DL",3000);
        ps[3]=new Teacher("aaa",27,"FJ",5000);
        ps[4]=new Docter("bbb",29,"PF","主治医师");
        for (int i=0;i<ps.length;i++){
            ps[i].sayHi();
        }
    }
}
class Person{
    String name;
    int age;
    String address;
    Person(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
    void sayHi(){
        System.out.println("大家好，我叫："+name+"今年"+age+"岁了，家住："+address);
    }
}

class Student extends Person{
    String stuId;
    Student(String name,int age,String address,String stuId){
        super(name, age, address);
        this.stuId=stuId;
    }
}

class Teacher extends Person{
    double salary;
    Teacher(String name,int age,String address,double salary){
        super(name, age, address);
        this.salary=salary;
    }
}

class Docter extends Person{
    String level;
    Docter(String name,int age,String address,String level){
        super(name, age, address);
        this.level= level;
    }
}

