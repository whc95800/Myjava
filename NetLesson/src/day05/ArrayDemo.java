package day05;

public class ArrayDemo {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
        for(int i=0; i<arr1.length; i++){
            arr1[i] = (int)(Math.random()*100);
        }
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
        System.out.println();
        for(int i= arr1.length-1;i>=0;i--){
            System.out.println(arr1[i]);
        }
    }
}
