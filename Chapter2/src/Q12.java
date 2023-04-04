import  java.util.Scanner;
public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //피연산자는 모두 정수로 가정
        System.out.print("연산>>");
        int n1 = sc.nextInt();
        String x = sc.next();
        int n2 = sc.nextInt();


        switch (x){
            case("+"):
                System.out.printf("%d%s%d의 계산 결과는 %1d\n", n1, x, n2, n1+n2);
                break;
            case("-"):
                System.out.printf("%d%s%d의 계산 결과는 %d\n", n1, x, n2, n1-n2);
                break;
            case ("*"):
                System.out.printf("%d%s%d의 계산 결과는 %d\n", n1, x, n2, n1*n2);
                break;
            case("/"):
                if(n2==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;  //종료
                }
                System.out.printf("%d%s%d의 계산 결과는 %d\n", n1, x, n2, n1/n2);

        }


        //if-else문
/*
        if(x.equals("+")){
            System.out.printf("%d%s%d의 계산 결과는 %d\n", n1, x, n2, n1+n2);
        }
        else if(x.equals("-")){
            System.out.printf("%d%s%d의 계산 결과는 %d\n", n1, x, n2, n1-n2);
        }
        else if(x.equals("*")){
            System.out.printf("%d%s%d의 계산 결과는 %d\n", n1, x, n2, n1*n2);
        }
        else if(x.equals("/")){
            if(n2==0){
                System.out.println("0으로 나눌 수 없습니다.");
               return;  //종료
            }
            System.out.printf("%d%s%d의 계산 결과는 %d\n", n1, x, n2, n1/n2);
        }
*/



    }
}
