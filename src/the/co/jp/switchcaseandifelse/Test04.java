package the.co.jp.switchcaseandifelse;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //キーボードからの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        System.out.println("month:");
        int month = scanner.nextInt();
        System.out.println("day:");
        int day = scanner.nextInt();
        //入力された月と日の整合性を判断する
        if (month==12&day>0&day<=31||
            month==11&day>0&day<=30||
            month==10&day>0&day<=31||
            month==9&day>0&day<=30||
            month==8&day>0&day<=31||
            month==7&day>0&day<=31||
            month==6&day>0&day<=30||
            month==5&day>0&day<=31||
            month==4&day>0&day<=30||
            month==3&day>0&day<=31||
            month==2&day>0&day<=28||
            month==1&day>0&day<=31){
            //合計値を記録するため,int型のsumDayを定義する
            int sumDays = 0;
            switch (month){
                case 12:sumDays += 30;
                case 11:sumDays += 31;
                case 10:sumDays += 30;
                case 9:sumDays += 31;
                case 8:sumDays += 31;
                case 7:sumDays += 30;
                case 6:sumDays += 31;
                case 5:sumDays += 30;
                case 4:sumDays += 31;
                case 3:sumDays += 28;
                case 2:sumDays += 31;//１月の日数
                case 1:sumDays += day;
                    System.out.println( "この日は：2021年の"+sumDays+"日目です。");
            }
        }else {
            System.out.println("入力エラー");
        }
    }
}