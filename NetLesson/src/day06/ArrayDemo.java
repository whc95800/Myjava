package day06;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {10,20,30,40,50};
        int[] a1 = new int[6];
        System.arraycopy(a,0,a1,0,5);
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}
