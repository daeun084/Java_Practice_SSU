import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        Double score;
        System.out.println("미래장학금관리시스템입니다.");

        HashMap<Double, String> hashMap = new HashMap<>();
        for(int i=0; i<5; i++){
            System.out.print("이름과 학점>> ");
            name = sc.next();
            score = sc.nextDouble();
            hashMap.put(score, name);
        }
        System.out.print("장학생 선발 학점 기준 입력>> ");
        Double line = sc.nextDouble();
        System.out.print("장학생 명단 : ");

        Iterator<Double> it = hashMap.keySet().iterator();
        while(it.hasNext()){
            double n = it.next();
            System.out.print(hashMap.get(n)+" ");
            System.out.println();
            if(n >= 3.2) System.out.print(hashMap.get(n)+" ");
        }
        //Iterator 이슈
    }
}
