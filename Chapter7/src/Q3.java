import java.util.HashMap;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("나라 이름과 인구를 입력하세요.(예: Korea 5000)");

        HashMap<String, Integer> nations = new HashMap<>();
        String country;
        int person;
        while(true){
            System.out.print("나라 이름, 인구 >> ");
            country = sc.next();
            if (country.equals("그만"))
                break;

            person = sc.nextInt();
            nations.put(country, person);
        }

        String search;
        while(true){
            System.out.print("인구 검색 >> ");
            search = sc.next();
            if(search.equals("그만")) return;


            if(nations.get(search)==null)
                System.out.println(search+"나라는 없습니다.");
            else System.out.println(search+"의 인구는 "+ nations.get(search));
        }
    }

}
