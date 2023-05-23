import java.util.Scanner;
import java.util.StringTokenizer;

public class Q7_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp;
        StringTokenizer st;

        do{
            System.out.print(">>");
            inp = sc.nextLine();

            st = new StringTokenizer(inp, " ");

            System.out.println("어절 개수는 "+ st.countTokens());
        }while(!inp.equals("그만"));
        System.out.println("종료합니다...");
    }
}
