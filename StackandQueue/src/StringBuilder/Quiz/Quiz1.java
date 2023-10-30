package StringBuilder.Quiz;

import java.util.ArrayList;
import java.util.Scanner;

// 단어뒤집기
public class Quiz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.next();
        }

        for(String x : Quiz1.solution(arr)){
            System.out.println(x);
        }
    }

    public static ArrayList<String> solution(String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            String word = "";
            char[] cArr = x.toCharArray();

            for(int i = cArr.length; i>0; i--){
                word += cArr[i-1];
            }

            answer.add(word);
        }

        return answer;
    }
}
