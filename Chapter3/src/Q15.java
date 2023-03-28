import java.util.InputMismatchException;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;
        while(true) {
            try {
                System.out.print("곱하고자 하는 두 수 입력>>");
                n1 = sc.nextInt();
                n2 = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("실수는 입력하면 안됩니다.");
                sc.nextLine(); //입력된 수 제거
            }
        }
        System.out.print(n1 + "x" + n2+"="+n1*n2);
        sc.close();

}}
