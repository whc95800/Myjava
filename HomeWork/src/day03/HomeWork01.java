package day03;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请依次输入两个整数：a，b（以空格隔）");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a>b?a:b;
        System.out.println("最大值为"+c);


    }
}
