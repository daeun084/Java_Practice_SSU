import java.util.Scanner;
public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("원의 중심과 반지름 입력>>");
        int rx = sc.nextInt();
        int ry = sc.nextInt();
        double r = sc.nextDouble();

        System.out.print("점 입력>>");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double tmp = (x-rx)*(x-rx) + (y-ry)*(y-ry);
        double result = Math.sqrt(tmp);

        if(result<=r){
            System.out.printf("점 (%.1f, %.1f는 원 안에 있다)\n", x, y);
        }
        else{
            System.out.printf("점 (%.1f, %.1f는 원 안에 없다)\n", x, y);
        }
    }
}
