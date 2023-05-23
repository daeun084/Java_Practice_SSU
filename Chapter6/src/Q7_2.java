import java.util.Scanner;

public class Q7_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String inp;
        String[] arr;

        do{
            System.out.print(">>");
            inp = sc.nextLine();

            arr = inp.split(" ");

            System.out.println("어절 개수는 "+arr.length);
        }while(!inp.equals("그만"));
        System.out.println("종료합니다...");
    }
}
