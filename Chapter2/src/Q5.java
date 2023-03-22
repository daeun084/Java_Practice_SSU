import java.util.Scanner;
public class Q5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("정수 3개를 입력하시오>>");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if(n1>=n2 && n1>=n3){
            if(n1 < n2+n3) System.out.println("삼각형이 됩니다");
            else System.out.println("삼각형이 되지 않습니다");
        }
        else if(n2>=n1 && n2>=n3) {
            if (n2 < n1 + n3) System.out.println("삼각형이 됩니다");
            else System.out.println("삼각형이 되지 않습니다");
        }
        else if(n3>=n2 && n3>=n1){
            if(n3 < n2+n1) System.out.println("삼각형이 됩니다");
            else System.out.println("삼각형이 되지 않습니다");
    }}
}
