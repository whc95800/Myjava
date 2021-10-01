package the.co.jp.ifelse;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //キーボードで入力された3つの整数を変数num1、num2、num3、に与える。
        System.out.println("１個目の整数：");
        int num1 = scan.nextInt();
        System.out.println("２個目の整数：");
        int num2 = scan.nextInt();
        System.out.println("３個目の整数：");
        int num3 = scan.nextInt();
        System.out.println("小さい順：");
        //if-else if 文で変数num1、num2、num3、を小さい顺に并べる
        if (num1>num2) {
            if (num3>num1)
                System.out.println(num2+","+num1+","+num3);
            else if (num3<num2)
                System.out.println(num3+","+num2+","+num1);
            else
                System.out.println(num2+","+num3+","+num1);
        }
        else{
            if (num3>num2)
                System.out.println(num1+","+num2+","+num3);
            else if(num3<num1)
                System.out.println(num3+","+num1+","+num2);
            else
                System.out.println(num1+","+num3+","+num2);
        }
    }
}

