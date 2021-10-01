package day06;

public class HomeWork02 {
    public static void main(String[] args) {
        int [] arr = generateArray(5,20);
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] generateArray(int len,int max) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * max);
        }
        return arr;
    }
}

