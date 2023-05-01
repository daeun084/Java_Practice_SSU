//Q12
import java.util.Scanner;

abstract class Shape{
    private Shape next;
    public Shape(){next = null;}
    public void setNext(Shape obj){next = obj;}
    public Shape getNext(){return next;}
    abstract public void draw();
}
class Line extends Shape{
public void draw(){

}
}
class Circle extends Shape{
    public void draw(){

    }
}
class Rect extends Shape{
    public void draw(){

    }
}
public class  GraphicEditor {
    static Scanner sc = new Scanner(System.in);

    public static void add(){ //삽입
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int num = sc.nextInt();
    }
    public static void delete(){ //삭제
        System.out.print("삭제할 도형의 위치>>");
        int address = sc.nextInt();
    }
    public static void show(){ //모두 보기

    }
    public static void main(String [] args){
        int n;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            n = sc.nextInt();

            switch (n){
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    return;
            }
        }

    }
}
