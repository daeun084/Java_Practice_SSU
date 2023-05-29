import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arrayList = new ArrayList<Character>();
        double sum = 0;

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/f)>>");
        for(int i=0; i<6; i++){
            arrayList.add(sc.next().charAt(0));

            switch (arrayList.get(i)){
                case 'A':
                    sum+=4;
                    break;
                case 'B':
                    sum+=3;
                    break;
                case 'C':
                    sum+=2;
                    break;
                case 'D':
                    sum+=1;
            }
        }
        System.out.println(sum/6);

    }
}
