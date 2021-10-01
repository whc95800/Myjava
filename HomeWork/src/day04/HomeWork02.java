package day04;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份(例如：2020)");
        int year = scanner.nextInt();
        System.out.println("请输入月份(例如：1)");
        int month = scanner.nextInt();
        int day=0;
            switch (month){
                case 1,3,5,7,8,10,12:
                    day=31;
                    break;
                case 4,6,9,11:
                    day=30;
                    break;
                case 2:
                    if((year%4==0&&year%100!=0)||year%400==0){
                        day=29;
                    }else {
                        day=28;
                    }
                    break;
                default:
                    System.out.println("输入错误");;
            }
            System.out.println(year+"年"+month+"月有"+day+"天");
        }

    }

