package the.co.jp.array;

public class TestArray {
    public static void main(String[] args) {
        //int型の二次元配列を定義する
        int [][] scores=new int[][]{{3,8,2,},{2,7},{9,0,1,6}};
        //sum総和を定義する
        int sum=0;
        //for文で配列内の要素をトラバースし、その総和を求める
        for (int i=0;i<scores.length;i++){
            for (int j=0;j<scores[i].length;j++){
                sum += scores[i][j];
            }
        }
        System.out.println("総和は："+sum);
    }
}
