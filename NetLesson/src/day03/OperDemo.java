package day03;

public class OperDemo {
    public static void main(String[] args) {
       /* System.out.println(5%3);//2
        System.out.println(6%3);//0
        System.out.println(3%6);//3
        int a = 5;
        System.out.println(a++);//5
        System.out.println(a);//6
        int b =5;
        System.out.println(++b);//6
        System.out.println(b);//6
        int c=5,d=5;
        int e = c++;
        System.out.println(c);//6
        System.out.println(e);//5
        int f =++d;
        System.out.println(d);//6
        System.out.println(f);//6
        int g=5,h=5;
        System.out.println(g--);//5
        System.out.println(g);//4
        System.out.println(--h);//4
        System.out.println(h);//4

        */
        int a = 5;
        a+=10;
        System.out.println(a);
        a*=4;
        System.out.println(a);
        a/=5;
        System.out.println(a);

        int age = 37;
        System.out.println("age="+age);
        System.out.println("我的年龄是"+age);
        System.out.println("我今年"+37+"岁了");
        System.out.println(10+20+""+30);
        System.out.println(""+12+20+30);
        System.out.println(10+20+30+"");

        int b=8,c=5;
        int max = b>c?8:5;
        System.out.println(max);



    }
}
