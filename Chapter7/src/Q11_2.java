import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Q11_2 {
    static Scanner sc = new Scanner(System.in);

    static void add(HashMap hs){
        System.out.println("현재 " + hs.size() + "개의 나라와 수도가 입력되어 있습니다.");
        String inpCountry = null;
        String inpCapacity = null;

        while(true){
            System.out.print("나라와 수도 입력" + hs.size() + ">>");
            inpCountry = sc.next();
            if (inpCountry.equals("그만")) return;

            inpCapacity = sc.next();

            if(hs.keySet().equals(inpCountry)) System.out.println(inpCountry + "는 이미 있습니다!");
            else hs.put(inpCountry, inpCapacity);
        }
    }
    static void quiz(HashMap hs){
        String input;
        Iterator<String> it = hs.keySet().iterator();
        while (it.hasNext()){
            String n = it.next();

            System.out.print(n+"의 수도는? ");
            input = sc.next();
            if(input.equals("그만")) return;

            if(input.equals(hs.get(n))) System.out.println("정답!!");
            else System.out.println("아닙니다!!");
        }

    }
    public static void main(String[] args) {
        HashMap<String, String> hs = new HashMap<>();

        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

        while (true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    add(hs);
                    break;
                case 2:
                    quiz(hs);
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    return;
            }

        }

    }
}
