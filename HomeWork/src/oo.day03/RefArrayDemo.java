package oo.day03;

public class RefArrayDemo {
    public static void main(String[] args) {
        Student [] stus = new Student[3];
        stus[0]=new Student("zhangsan",25,"LF");
        stus[1]=new Student("lisi",22,"JMS");
        stus[2]=new Student("wangwu",35,"SD");
        System.out.println(stus[1].age);
        stus[2].sayHi();

        Student[] ss = new Student[]{
                new Student("zhangsan",25,"LF"),
                new Student("lisi",22,"JMS"),
                new Student("wangwu",35,"SD")
        };

        int[][] as = new int[3][];
        as[0]=new int[3];
        as[1]=new int[2];
        as[2]=new int[3];
        as[1][0]=100;


        int[][] arr = new int[3][4];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=100;
            }
        }

    }
}
