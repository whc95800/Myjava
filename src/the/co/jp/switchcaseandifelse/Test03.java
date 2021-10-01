package the.co.jp.switchcaseandifelse;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        //キーボードからの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        //入力値をint型のiに与える
        int i = scanner.nextInt();
        //switch-case文を使い 3,4,5いずれの数字を入力された場合、文字列”春季”を出力する。
        //6,7,8いずれの数字を入力された場合、文字列”夏季”を出力する。
        //9,10,11いずれの数字を入力された場合、文字列”秋季”を出力する。
        //12,1,2いずれの数字を入力された場合、文字列”冬季”を出力する。
        switch (i){
            case 3,4,5:
                System.out.println("春");
                break;
            case 6,7,8:
                System.out.println("夏");
                break;
            case 9,10,11:
                System.out.println("秋");
                break;
            case 12,1,2:
                System.out.println("冬");
                break;
            default:
                System.out.println("入力エラー");
                break;
        }
    }
}
