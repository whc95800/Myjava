package the.co.jp.classTest;

public class TestPerson {
    public static void main(String[] args) {
        Person a = new Person();
        a.study();
        a.showAge();
        a.addAge(2);
        a.showAge();

        Person b = new Person();
        b.study();
        b.showAge();
        b.addAge(3);
        b.showAge();
    }
}
class Person {
    String name;
    int age;
    int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println(age);
    }
    public int addAge(int i){
        age+=i;
        return age;
    }
}
