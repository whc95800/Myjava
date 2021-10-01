package day05;

public class Test {
    public static void main(String[] args) {
        /*int [] arr = new int[10];
        int [] arr2 ={2,4,5,8};
        int [] arr3 =new int[]{2,4,5,8};
        int [] arr4;
        arr4=new int[]{2,4,5,8};

        int[] arr5 =new int[3];
        System.out.println(arr5.length);
        arr5[0]=100;
        arr5[1]=200;
        arr5[2]=300;
        System.out.println(arr5[arr5.length-1]);

         */
        int [] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i]=(int)(Math.random()*99);
            System.out.print(arr[i]+"\t");
        }

    }
}
