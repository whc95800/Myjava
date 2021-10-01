package the.co.jp.array;

public class StudentTest {

    public static void main(String[] args) {
        //20個要素を含むのstudent配列を新規する
        Student[] stud = new Student[20];

        for (int i = 0; i < stud.length; i++) {
            //要素を下記のように新規作成、
            //番号を1から20まで作成、学年を1から6ランダムで作成、成績を1から100ランダムで作成
            stud[i] = new Student();
            stud[i].number = (i + 1);
            stud[i].state = (int) (Math.random() * 6 + 1);
            stud[i].score = (int) (Math.random() * 100 + 1);
        }
        //studenttest型のtestを新規作成、printとearchState方法をプリントする
        StudentTest test = new StudentTest();
        test.print(stud);
        test.searchState(stud, 4);
    }
    //print方法を新規作成、Student中のinfo()方法を使って、配列studの中の要素を全部
    public void print(Student[] stud) {
        for (int i = 0; i < stud.length; i++) {
            System.out.println(stud[i].info());
        }
    }
    //searchState方法を新規作成、Student中のinfo()方法を使って、配列stud中のstate：3の要素を全部プリントアウト
    public void searchState(Student[] stud, int state) {
        for (int i = 0; i < stud.length; i++) {
            if (stud[i].state == state) {
                System.out.println(stud[i].info());
            }
        }
    }
}
    //studentクラスを新規し、その中に番号number(int),学年state(int),成績score(int)を含めること
    class Student {
        int number;
        int state;
        int score;

        public String info() {
            return "出席番号：" + number + ",学年：" + state + ",成绩：" + score;
        }
    }
