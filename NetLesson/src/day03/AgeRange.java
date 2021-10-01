package day03;

import java.util.Scanner;

public class AgeRange {
    public static void main(String[] args) {
        System.out.print("请输入年龄：");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        System.out.println("年龄是："+age);
    }
}
