import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = sc.nextInt();
        int n1 = num/10;
        int n2 = num%10;

        if(n1==3 || n1==6 || n1==9 ){
            if(n2==3 || n2==6 || n2==9){
                System.out.println("박수짝짝");
            }
            else System.out.println("박수짝");
        }
        else{
            if(n2==3 || n2==6 || n2==9){
                System.out.println("박수짝");
            }
        }
    }
}
