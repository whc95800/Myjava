package the.co.jp.ifelse;

import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("身長180以上（y/n）");
        char a = scan.next().charAt(0);
        System.out.println("貯金1,000万元以上（y/n）");
        char b = scan.next().charAt(0);
        System.out.println("イケメン（y/n）");
        char c = scan.next().charAt(0);
        if (a=='y'|| b=='y'||c=='y')
            System.out.println("結婚できる");
        else if (a=='n'&& b=='n' && c=='n')
            System.out.println("結婚出来ない");
        else
            System.out.println("入力エラー");
    }
}
