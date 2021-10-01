package day03;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入单价(¥):");
        double unitPrice = scan.nextDouble();
        System.out.println("请输入数量:");
        double amount = scan.nextInt();
        System.out.println("请输入金额:");
        double money = scan.nextDouble();

        double totalPrice = unitPrice * amount;

        if (totalPrice >= 500) {
            totalPrice *= 0.8;
        }
        if (money >= totalPrice) {
            double change = money - totalPrice;
            System.out.print("应收金额为:¥" + totalPrice + ",找零为:" + change);
        } else {
            System.out.println("您给的钱现金不够，还差:"+(totalPrice-money));
        }
    }
}
