import java.util.Scanner;
//(100,100), (200,200)으로 이루어진 사각형 안, 입력받는 점의 존재 유무 출력
public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.printf("점 (x,y)의 좌표를 입력하시오>>");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x>100 && x<200 && y>100 && y<200){
            System.out.printf("(%d,%d)는 사각형 안에 있습니다.", x, y);
        }
        else{
            System.out.printf("(%d,%d)는 사각형 안에 없습니다.", x, y);
        }

    }
}
