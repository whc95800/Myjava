package the.co.jp.switchcaseandifelse;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        //キーボードからの入力を受け取る
        Scanner scanner = new Scanner(System.in);
        //入力値をdouble型のiに与える
        double i = scanner.nextDouble();
        //if-else文を使い、i>=60以上の条件で"合格"を出力する、それ以外は"不合格"を出力する
        if (i>=60){
            System.out.println("合格");
        }else {
            System.out.println("不合格");
        }
    }
}
