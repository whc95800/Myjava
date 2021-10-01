package the.co.jp.overload;

public class overLoadTest {
    public static void main(String[] args) {
        overLoadTest a = new overLoadTest();
        a.mOL(2);
        a.mOL(2,3);
        a.mOL("abc");

        overLoadTest b = new overLoadTest();
        b.max(1,2);
        b.max(1.1,2.2);
        b.max(1.1,2.2,3.3);
    }
    public void mOL(int i){
        System.out.println(i*i);
    }
    public void mOL(int i,int j){
        System.out.println(i*j);
    }
    public void mOL(String str){
        System.out.println(str);
    }

    public void max(int i,int j){
        System.out.println(Math.max(i, j));
    }
    public void max(double i,double j){
        System.out.println(Math.max(i,j));
    }
    public void max(double i,double j,double k){
        System.out.println(Math.max(Math.max(i,j),k));
    }
}



