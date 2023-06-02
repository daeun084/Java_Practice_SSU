import java.util.*;

class Nation {
    String country, capital;
    public Nation(String country, String capaital) {
        this.country = country;
        this.capital = capaital;
    }
}

public class Q11_1 {
    static Scanner sc = new Scanner(System.in);

    static void add(Vector v) {
        System.out.println("현재 " + v.size() + "개의 나라와 수도가 입력되어 있습니다.");
        String inpCountry = null;
        String inpCapacity = null;

        while (true) {
            System.out.print("나라와 수도 입력" + v.size() + ">>");
            inpCountry = sc.next();
            if (inpCountry.equals("그만")) return;

            inpCapacity = sc.next();

            Iterator<Nation> it = v.iterator();
            int count=0;
            while (it.hasNext()) {
                if (it.next().country.equals(inpCountry)) {
                    System.out.println(inpCountry + "는 이미 있습니다!");
                    count++;
                    break;
                }
            }
            if(count==0)  v.add(new Nation(inpCountry, inpCapacity));

        }
    }

    static void quiz(Vector v) {
        String input;
        Iterator<Nation> it = v.iterator();

        while (it.hasNext()){
            Nation n = it.next();

            System.out.print(n.country+"의 수도는? ");
            input = sc.next();
            if(input.equals("그만")) return;

            if(input.equals(n.capital)) System.out.println("정답!!");
            else System.out.println("아닙니다!!");

        }
    }

    public static void main(String[] args) {

        Vector<Nation> v = new Vector<>();

        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");

        while (true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3 >>");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    add(v);
                    break;
                case 2:
                    quiz(v);
                    break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    return;
            }

        }
    }
}
