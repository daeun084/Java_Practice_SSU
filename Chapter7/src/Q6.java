import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

class Location{
    String name;
    int a, b;

    public Location(String name, int a, int b){
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public String toString(){
        return name+"\t"+a+"\t"+b;
    }

}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<String, Location> hashMap = new HashMap<>(4);

        System.out.println("도시, 경도, 위도를 입력하세요.");
        for(int i=0; i<4; i++){
            System.out.print(">> ");
            String name = sc.next();
            hashMap.put(name, new Location(name, sc.nextInt(), sc.nextInt()));
        }
        System.out.println("--------------------");





    }
}
