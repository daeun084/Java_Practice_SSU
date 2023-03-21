import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("원화를 입력하세요(단위 원)>>");
        int money = sc.nextInt();

        System.out.printf("%d원은 $%.1f입니다.\n", money, (float)money/1100);
    }
}
