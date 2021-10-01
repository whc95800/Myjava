package day03;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请依次输入三个整数：a，b，c（以空格隔）");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int max = (a>b?a:b)>c?(a>b?a:b):c;
        System.out.println("最大值为"+max);
    }
}
