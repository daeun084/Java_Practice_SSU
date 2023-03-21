import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 3개 입력 >> ");
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();

    int result;

    if(n1>= n2){
        if(n1<=n3) result = n1;
        else if(n2>n3) result = n2;
        else result = n3;
    }
    else{
        if(n3>=n2) result=n2;
        else if(n3<=n1) result = n1;
        else result = n3;
    }

    System.out.printf("중간값은 %d\n", result);

    }
}
