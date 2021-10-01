package the.co.jp.forwhile;

import java.util.Scanner;

public class Test12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            //正の数をa、負の数をbに定義する
            int a = 0;
            int b = 0;
            //for文で10回循環し毎回入力した値の正負を判断し、正負の数の和をそれぞれ求める
            for(int i = 0; i < 10; i++){
                System.out.println("第" + (i + 1) +"個目の整数を入力して下さい：");
                int num = scan.nextInt();
                if(num > 0)
                    a++;
                else if(num < 0)
                    b++;
            }
            System.out.println("プラスの数：" + a);
            System.out.println("マイナスの数：" + b);
    }
}
