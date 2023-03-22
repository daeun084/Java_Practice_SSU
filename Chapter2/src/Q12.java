import  java.util.Scanner;
public class Q12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("연산>>");
        double n1 = sc.nextDouble();
        String x = sc.next();
        double n2 = sc.nextDouble();


        //if-else문

        if(x.equals("+")){
            System.out.printf("%1f%s%1f의 계산 결과는 %1f\n", n1, x, n2, n1+n2);
        }
        else if(x.equals("=")){
            System.out.printf("%.1f%s%.1f의 계산 결과는 ", n1, x, n2);

            if(n1==n2) System.out.println("true");
            else System.out.println("false");
        }
        else if(x.equals("*")){
            System.out.printf("%.1f%s%.1f의 계산 결과는 %.1f\n", n1, x, n2, n1*n2);
        }
        else if(x.equals("/")){
            if(n2==0){
                System.out.println("0으로 나눌 수 없습니다.");
               Thread Interrupt;  //종료
            }
            System.out.printf("%.1f%s%.1f의 계산 결과는 %.1f\n", n1, x, n2, n1/n2);
        }


        //switch문
        switch (x){
            case("+"):
                System.out.printf("%1f%s%1f의 계산 결과는 %1f\n", n1, x, n2, n1+n2);
                break;
            case("="):
                System.out.printf("%.1f%s%.1f의 계산 결과는 ", n1, x, n2);

                if(n1==n2) System.out.println("true");
                else System.out.println("false");
                break;
            case ("*"):
                System.out.printf("%.1f%s%.1f의 계산 결과는 %.1f\n", n1, x, n2, n1*n2);
                break;
            case("/"):
                if(n2==0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    Thread Interrupt;  //종료
                }
                System.out.printf("%.1f%s%.1f의 계산 결과는 %.1f\n", n1, x, n2, n1/n2);

        }
    }
}
