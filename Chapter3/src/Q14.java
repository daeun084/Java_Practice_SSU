import java.awt.*;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String course [] = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
        int score [] = {95, 88, 76, 62, 55};

        while(true){
        System.out.print("과목이름>>");
        String subject = sc.next();

        if(subject.equals("그만")) break;

        int count=0;
        for(int i=0; i<5; i++){
            if(course[i].equals(subject)) {
                System.out.printf("%s의 점수는 %d\n", subject, score[i]);
                break;
            }
            else count++;
        }

        if(count==5) System.out.print("없는 과목입니다.\n");



    }}
}
