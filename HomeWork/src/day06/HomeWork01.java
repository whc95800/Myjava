package day06;

public class HomeWork01 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i]=(int) (Math.random()*100);
            //System.out.println(arr[i]);
        }
        int min = arr[0];
        for(int i=1;i< arr.length;i++){
           if(arr[i]<min){
               min=arr[i];
           }
        }
        System.out.println("最小值为："+min);


        int [] as = new int[arr.length+1];
        as[0]=min;
        System.arraycopy(arr,0,as,1,arr.length);
        for(int i=0;i<as.length;i++){
            System.out.println(as[i]);
        }

    }
}
