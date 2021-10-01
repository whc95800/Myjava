package day03;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("请输入年份：");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        boolean flag = (year%4==0&&year%100!=0)||year%400==0;
        String str = flag?year+"是闰年":year+"是平年";
        System.out.println(str);

        //System.out.println("今年是："+year+"年");
    }
}
