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
    System.out.println("Line");
}
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}
public class  GraphicEditor {
    static Scanner sc = new Scanner(System.in);

    public static void add(Shape s){ //삽입
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int num = sc.nextInt();

        Shape cursor = s;
        for(;cursor.getNext()!=null; cursor = cursor.getNext());
         //커서를 맨 끝으로 이동
        if(num==1) cursor.setNext(new Line());
        if(num==2) cursor.setNext(new Rect());
        if(num==3) cursor.setNext(new Circle());

    }
    public static void delete(Shape s){ //삭제
        System.out.print("삭제할 도형의 위치>>");
        int address = sc.nextInt();
        Shape cursor = s.getNext();
        for(int i=1; i<address-1; i++){
            cursor = cursor.getNext();
        }
        if(cursor.getNext()==null){
            System.out.println("삭제할 수 없습니다.");
        }
        else{
            cursor.setNext(cursor.getNext().getNext());
        }
    }
    public static void show(Shape s){ //모두 보기
       Shape cursor = s.getNext();
       for(;cursor!=null; cursor = cursor.getNext()) cursor.draw();


    }
    public static void main(String [] args){
        int n;
        Shape s = new Line();

        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            n = sc.nextInt();

            switch (n){
                case 1:
                    add(s);
                    break;
                case 2:
                    delete(s);
                    break;
                case 3:
                    show(s);
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    return;
            }
        }

    }
}
