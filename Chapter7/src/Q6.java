import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location {
    String name;
    int a, b;

    public Location(String name, int a, int b) {
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return String.format("%-4s %-3d %-3d", name, a, b);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Location> hashMap = new HashMap<>(4);

        System.out.println("도시, 경도, 위도를 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            String[] input = sc.nextLine().split(", ");

            hashMap.put(input[0], new Location(input[0], Integer.parseInt(input[1]), Integer.parseInt(input[2])));
        }
        System.out.println("--------------------");

        Iterator<String> it = hashMap.keySet().iterator();
        for (int i = 0; i < 4; i++) {
            System.out.println(hashMap.get(it.next()));
        }

        System.out.println("--------------------");

        String search;
        while (true) {
            System.out.print("도시 이름 >> ");
            search = sc.next();
            if (search.equals("그만")) break;

            if (hashMap.get(search) == null) System.out.println(search + "는 없습니다.");
            else System.out.println(hashMap.get(search));

        }
    }
}
