import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("2자리 정수 입력(10~99) >> ");
        int num = sc.nextInt();

        int n1 = num/10;
        int n2 = num%10;

        if(n1==n2) System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
        else System.out.println("No! 10의 자리와 1의 자리가 같지 않습니다.");

    }
}
