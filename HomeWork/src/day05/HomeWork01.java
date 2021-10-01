package day05;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数(例如)：");
        int a = scanner.nextInt();
        double sum=0.0;
        for(int i =1;i<=a;i++){
            sum += (1.0/i);
        }
        System.out.println("sum="+sum);
    }
}
