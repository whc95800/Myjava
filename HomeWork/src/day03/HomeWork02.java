package day03;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请依次输入三个整数：a，b，c（以空格隔）");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        int temp = 0;
        if(a>b) {
            temp = a;
            a = b;
            b = temp;
        }
        if(a>c){
            temp =a;
            a=c;
            c=temp;
        }
        if(b>c){
            temp =b;
            b=c;
            c=temp;
        }
        System.out.println("升序排列后，结果为：");
        System.out.print(a+","+b+","+c);
    }
}

