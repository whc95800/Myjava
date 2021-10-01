package the.co.jp.forwhile;

public class Test10_1{
    public static void main(String[] args){
        int a=0;
        int sum=0;
        for(int i=0;i<=100;i++){
            if(i %7==0){
                a+=1;
                sum+=i;
            }
        }
        System.out.println("数："+a);
        System.out.println("和："+sum);
    }
}

