package day06;

import java.util.Arrays;

public class MinOfArray {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int)(Math.random()*100);
            System.out.print(arr[i]+"\t");
        }
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
            min=arr[i];
            }
        }
        System.out.println();
        System.out.println("最小值为："+min);

        arr = Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1] = min;
        Arrays.sort(arr);
        for(int i =0;i< arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
