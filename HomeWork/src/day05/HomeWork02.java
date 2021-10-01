package day05;

public class HomeWork02 {
    public static void main(String[] args) {
        long sum = 0;
        long num = 0;
        for(int i=1;i<=10;i++){
            num = num*10+9;
            sum += num;
        }
        System.out.println("sum="+sum);
    }
}
