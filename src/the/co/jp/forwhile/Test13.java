package the.co.jp.forwhile;

import java.util.Scanner;

public class Test13 {
    public static void main(String[] args) {
        System.out.println("整数を入力：");
        Scanner scan = new Scanner(System.in);
        //正の数をa、負の数をbに定義する
        int a = 0;
        int b = 0;
        //while文で無限ループ作り、毎回入力した値の正負を判断し、正負の数の和をそれぞれ求める
        //入力した値が0の時、ループから抜け出し、終了する
        while (true) {
            int number = scan.nextInt();
            if (number > 0) {
                a++;
            } else if (number < 0) {
                b++;
            } else {
                System.out.println("プラスの数：" + a + "，マイナスの数：" + b);
                break;
            }
        }
    }
}
