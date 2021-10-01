package day04;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
       /* int times = 0;
        while (times<10){
            System.out.println("行动是成功的阶梯");
            times++;
        }
        System.out.println("over");


        int num = 1;
        while (num<10){
            System.out.println(num+"*9="+num*9);
            num++;
        }

        int num = 9;
        while (num>0){
            System.out.println(num+"*9="+num*9);
            num--;
        }
         */

        Scanner scanner = new Scanner(System.in);
        int a = (int)(Math.random()*1000+1);
        System.out.println("猜吧！");
        int score = scanner.nextInt();
        while (score!=a){
            if(score==0){
                break;
            }
            if(score>a){
                System.out.println("太大了");
            }else {
                System.out.println("太小了");
            }
            score = scanner.nextInt();
        }
        if(score==a){
            System.out.println("恭喜你，猜对了！");
        }else{
            System.out.println("不猜了退出");
        }
    }
}