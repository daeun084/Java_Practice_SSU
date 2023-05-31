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

                if(hashMap.containsKey(name)){
                    hashMap.replace(name, hashMap.get(name)+score);
                    //점수 누적
                }
                else{
                    hashMap.put(name, score);
                }


            hashPrint(hashMap);
        }
    }
    static void hashPrint(HashMap<String, Integer> h){
        Iterator<String> it = h.keySet().iterator();

        String n = null;
       for(int i=0; i<h.size(); i++) {
           n = it.next();
           System.out.print("(" + n + "," + h.get(n) + ")");
       }
        System.out.println();

    }


}
