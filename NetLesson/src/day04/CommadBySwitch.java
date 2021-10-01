package day04;

import java.util.Scanner;

public class CommadBySwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请选择功能：1.显示全部记录 2.查询登陆记录 0.退出");
        int num = scan.nextInt();
        switch (num){
            case 1 :
                System.out.println("显示全部记录");
                break;
            case 2 :
                System.out.println("查询登陆记录");
                break;
            case 0 :
                System.out.println("感谢访问再见");
                break;
            default:
                System.out.println("输入错误");
        }
    }
}
