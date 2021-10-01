package the.co.jp.array;

import java.util.Scanner;

public class TestStudentScore {
    public static void main(String[] args) {
        //キーボードからの入力した学生数を受け取る
        Scanner scan = new Scanner(System.in);
        System.out.print("生徒人数を入力：");
        int n = scan.nextInt();
        //入力された学生数nに応じて、長さnのint配列studを新規する
        int [] Stud = new int[n];
        System.out.println(n+"人の成績を入力：");
        int max =Stud[0];
        //キーボードからの入力した数をn個の成績に与える、その中の最高点をプリントする
        for(int i=0;i<Stud.length;i++){
            Stud [i]=scan.nextInt();
            if(Stud[i]>max){
                max=Stud[i];
            }
        }
        System.out.println("最高得点："+max);
        //学生の成績の配列をトラバースし、
        //最高点を基付いて、その差に応じてレベルを与えて、プリントアウトする
        char j;
        for (int i = 0;i<Stud.length;i++){
            if (Stud[i]>=max-10)
                j='A';
            else if (Stud[i]>=max-20)
                j='B';
            else if (Stud[i]>=max-30)
                j='C';
            else
                j='D';
            System.out.println("student "+i+" score is "+Stud[i]+" grade is "+j);
        }


    }
}
