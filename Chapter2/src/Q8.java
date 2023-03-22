import java.util.Scanner;
public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("점 (x1,y1)의 좌표를 입력하시오>>");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.printf("점 (x2,y2)의 좌표를 입력하시오>>");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        boolean result1 = inRect(x1, y1, 100, 100, 200, 200);
        boolean result2 = inRect(x2, y2, 100, 100, 200, 200);

        if(result1 == true && result2 == true) System.out.printf("(%d,%d), (%d,%d)는 기존의 사각형과 충돌하지 않는다\n",
                x1, y1, x2, y2);
        else System.out.printf("(%d,%d), (%d,%d)는 기존의 사각형과 충돌한다\n",
                x1, y1, x2, y2);

    }
    public static boolean inRect(int x, int y, int rectx1, int rexty1, int rextx2, int rexty2){
        if((x>=rectx1 && x<=rextx2)&& (y>=rexty1 && y<=rexty2)) return true;
        else return false;
    }
}
