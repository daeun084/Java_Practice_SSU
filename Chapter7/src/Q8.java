import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("** 포인트 관리 프로그램입니다 **");
        HashMap<String, Integer> hashMap = new HashMap<>();

        String name;
        int score;
        while(true){
            System.out.print("이름과 포인트 입력>> ");
            name = sc.next();
            if(name.equals("그만")) break;

            score = sc.nextInt();

            //name이 이미 있으면 score 수정
            //없으면 k, v 추가

            hashPrint(hashMap);
        }
    }
    static void hashPrint(HashMap<String, Integer> h){
        Iterator<String> it = h.keySet().iterator();
        while(it.hasNext()){
            System.out.print("");
            //모든 쌍 출력
        }
    }
}
