import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Q5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Student> hashMap = new HashMap<>(4);

        System.out.println("학생 이름, 학과, 학번, 학점 평균 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String name = sc.next();
            hashMap.put(name, new Student(name, sc.next(), sc.nextInt(), sc.nextDouble()));
        }
        System.out.println("--------------------");


        Iterator<String> it = hashMap.keySet().iterator();

        for (int i = 0; i < 4; i++) {
            System.out.println(hashMap.get(it.next()));
            System.out.println("--------------------");
        }

        String search;

        while (true) {
            System.out.print("학생 이름 >> ");
            search = sc.next();
            if (search.equals("그만")) return;

            it = hashMap.keySet().iterator();

            for(int i=0; i<4; i++){
                if(hashMap.get(it.next()).name.equals(search)){
                    hashMap.get(it.next()).Print();
                    //Iterator 순환 관련 이슈
                }
            }

        }
    }
}
