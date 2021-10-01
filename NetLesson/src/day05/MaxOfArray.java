package day05;

public class MaxOfArray {
    public static void main(String[] args) {
        int [] arr = new int[10];
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            arr[i] = (int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println();
        System.out.println("最大值为："+max);
    }
}
