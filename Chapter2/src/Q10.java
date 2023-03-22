import java.util.Scanner;
public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 원의 중심과 반지름 입력>>");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        double r1 = sc.nextDouble();

        System.out.print("두번째 원의 중심과 반지름 입력>>");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double r2 = sc.nextDouble();

        double tmp = (x1-x2)*(x1-x2) + (y1-y2)*(y1-y2);
        double result = Math.sqrt(tmp);

        if(result<r1+r2){
            System.out.println("두 원은 서로 겹친다");
        }
        else{
            System.out.println("두 원은 서로 겹치지 않는다");
        }

    }
}
