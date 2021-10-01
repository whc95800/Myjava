package the.co.jp.forwhile;

public class Test11 {
    public static void main(String[] args) {
        //変数iを100から999まで定義する
        for (int i=100;i<1000;i++){
            //iの100の位の数字
            int j = i/100;
            //iの10の位の数字
            int k = (i/10)-(i/100*10);
            ////iの1の位の数字
            int l = i-(i/10*10);
            if(j*j*j+k*k*k+l*l*l==i){
                System.out.println(i);
            }
        }
    }
}
