package day04;

import java.util.Scanner;

public class DoWhileDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int snum = (int) (Math.random()*1000+1);
        System.out.println("猜数字");
        int num;
        do{
            num=scanner.nextInt();
            if(num==0){
                break;
            }else if(num>snum){
                System.out.println("太大了");
            }else if (num<snum){
                System.out.println("太小了");
            }
        }while (num!=snum);

        if(num==snum){
        System.out.println("恭喜你！猜对了。");
        }else{
            System.out.println("不猜了，退出。");
        }
    }
}
