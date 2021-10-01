package the.co.jp.array;

public class TestPritimive {
    public static void main(String[] args) {
        //Pritimive型のdを新規作成
        Pritimive d = new Pritimive();
        //for文で変数tの3つの要素値を出力する
        for (int i = 0; i < 3; i++)
            System.out.println(d.t[i]);
        //for文で変数tの3つの要素に値trueを割り当てる
        for (int i = 0; i < 3; i++) {
            d.t[i] = true;
            System.out.println(d.t[i]);
            }
        }
    }
    //Pritimiveクラスを定義
    class Pritimive {
        //クラスのメンバー変数として3つの要素を持つブール配列tを定義する
        boolean[] t = new boolean[3];
    }
