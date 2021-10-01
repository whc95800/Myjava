package the.co.jp.forwhile;

public class Test09 {
    public static void main(String[] args) {
        //for文を使って1から150まで繰り返しする
        for(int i =1;i<=150;i++){
            //iを出力する
            System.out.print(i);
            /*if 文で1から150までの数字を判断し、
             対象の数字の後ろに文字列をプリントして終わり*/
            if (i%3==0)
                System.out.print("foo");
            if (i%5==0)
                System.out.print("biz");
            if (i%7==0)
                System.out.print("baz");
            //改行する
            System.out.println();
        }
    }
}
