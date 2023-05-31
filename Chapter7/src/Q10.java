import java.util.Scanner;
import java.util.Vector;
class Shape{

}
class Line extends Shape{

}
class Rect extends Shape{

}
class Circle extends Shape{

}
public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        Vector<Shape> v = new Vector<>();
        while (true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)");
            int num = sc.nextInt();

            //line 생성 -> new Vector<Line>();

        }
    }
}
