package the.co.jp.ifelse;

import java.util.Scanner;

public class Test005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = scan.nextInt();
        System.out.println("请输入第三个整数：");
        int num3 = scan.nextInt();
        System.out.println("从小到大输出结果为：");
        if(num1>num2){
            int temp = 0;
            temp=num1;
            num1=num2;
            num2=temp;
        }
        if (num1>num3){
            int temp = 0;
            temp=num1;
            num1=num3;
            num3=temp;
        }
        if (num2>num3){
            int temp = 0;
            temp=num2;
            num2=num3;
            num3=temp;
        }
        System.out.println(num1+ "," + num2 + "," + num3);
    }
}
