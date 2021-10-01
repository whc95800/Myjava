package day04;

import java.util.Scanner;

public class ScoreLevel {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("请输入分数：");
        int score = scanner.nextInt();
        if(0<=score&score<=100){
            if(score>=90){
                System.out.println("A-优秀");
            }else if(score>=80){
                System.out.println("B-中等");
            }else if (score>=60){
                System.out.println("C-及格");
            }else {
                System.out.println("D-不及格");
            }
        }else {
            System.out.println("输入错误");
        }
    }
}
