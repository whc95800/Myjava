package the.co.jp.forwhile;

public class Test10 {
    public static void main(String[] args) {
        //奇数と偶数を定義する
        int sumOdd = 0;
        int sumEven = 0;
        //for文でiを宣言して、その変数を1から100までプリントする
        for (int i=1;i<=100;i++){
            //if文でiが偶数の場合、その和を求める
            if (i%2==0){
                sumEven += i;
            //他の場合は、すなわち奇数の場合は、その和を求める
            }else
                sumOdd +=i;
        }
        System.out.println("奇数の和："+sumOdd);
        System.out.println("偶数の和："+sumEven);
/*
        int sumOdd = 0;
        int sumEven = 0;

        int i=1;
        while(i<=100){
            if(i%2==0){
                sumEven += i;
            }else{
                sumOdd += i;
            }
            i++;
        }
        System.out.println("奇数の和："+sumOdd);
        System.out.println("偶数の和："+sumEven);
*/
    }
}
