package day04;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        System.out.println("请输入你的工资的税前金额(¥):");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        double taxSalary = salary-3500;
        double tax =0;
        if(taxSalary>80000){
            tax=taxSalary*0.45-13505;
        }else if(taxSalary>55000){
            tax=taxSalary*0.35-5505;
        }else if(taxSalary>35000){
            tax=taxSalary*0.30-2755;
        }else if(taxSalary>9000){
            tax=taxSalary*0.25-1005;
        }else if(taxSalary>4500){
            tax=taxSalary*0.20-555;
        }else if(taxSalary>1500) {
            tax = taxSalary * 0.10 - 105;
        }else if(taxSalary>0){
                tax=taxSalary*0.3-0.0;
        }else{
            tax=0;
        }
        System.out.println("应缴税额是："+tax);
    }

}
