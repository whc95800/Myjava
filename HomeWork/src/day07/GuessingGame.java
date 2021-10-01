package day07;

import java.util.Locale;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        char[] chs = generate();
        System.out.println(chs);
        int count=0;
        while (true){
            System.out.println("Guess");
            String str = scanner.next().toUpperCase(Locale.ROOT);
            if (str.equals("EXIT")){
                System.out.println("退出");
                break;
            }
            char[] input=str.toCharArray();
            int[] result =check(chs,input);
            if(result[1]== chs.length){
                int score = chs.length*100-10*count;
                System.out.println("恭喜你猜对了。得分为"+score);
            }else {
                System.out.println("字符对个数为："+result[0]+"位置对个数为："+result[1]);
                count++;
            }

        }

    }

    public static char[] generate() {
        char[] chs = new char[5];
        char[] letters = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        boolean [] flags= new boolean[letters.length];
        for (int i = 0; i < chs.length; i++) {
            int index;
            do{
                index=(int) (Math.random() * letters.length);
            }while (flags[index]==true);
            chs[i]=letters[index];
            flags[index]=true;
        }return chs;
    }

    public static int[] check(char[] chs,char[] input){
        int[] result = new int[2];
        for(int i=0;i<chs.length;i++){
            for (int j=0;j<input.length;j++){
                if(chs[i]==input[j]){
                    result[0]++;
                    if(i==j){
                        result[1]++;
                    }break;
                }
            }
        }return result;
    }
}