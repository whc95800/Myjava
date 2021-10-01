package the.co.jp.switchcaseandifelse;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //キーボードからの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        //入力値をchar型のiに与える
        char i = scanner.next().charAt(0);
        //switch-case文を使い a,b,c,dを大文字A,B,C,Dに変換し、出力する。それ以外をotherで出力する。
        switch (i) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
