import java.util.Scanner;
public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("1~99 사이의 정수를 입력하시오>>");
        int num = sc.nextInt();
        int n1 = num/10;
        int n2 = num%10;

        if(n1==3 || n1==6 || n1==9 ){ //num의 10의 자리 수가 3 혹은 6 혹은 9일 떄
            if(n2==3 || n2==6 || n2==9){ //num의 10의 자리 수와 1의 자리 수가 모두 3, 6, 9 중 하나를 만족
                System.out.println("박수짝짝");
            }
            else System.out.println("박수짝");   //num의 10의 자리 수만 3, 6, 9 중 하나를 만족
        }
        else{                        //num의 10의 자리 수가 3, 6, 9가 모두 아닐 때
            if(n2==3 || n2==6 || n2==9){
                System.out.println("박수짝");  //num의 1의 자리 수만 3, 6, 9 중 하나를 만족
            } //num의 10의 자리 수와 1의 자리 수 모두 3, 6, 9가 모두 아니면 미출력
        }
    }
}
