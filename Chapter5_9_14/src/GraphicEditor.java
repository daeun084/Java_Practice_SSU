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

    public static void add(Shape start){ //삽입
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int num = sc.nextInt();

        Shape cursor = start;
        for(;cursor.getNext()!=null; cursor = cursor.getNext());
         //커서를 맨 끝으로 이동함

        if(num==1) cursor.setNext(new Line());
        if(num==2) cursor.setNext(new Rect());
        if(num==3) cursor.setNext(new Circle());

    }
    public static void delete(Shape start){ //삭제
        System.out.print("삭제할 도형의 위치>>");
        int address = sc.nextInt();


        if(start.getNext() == null){
            System.out.println("삭제할 수 없습니다.");
            return;
        }
        // 1)
        // start노드를 제외하고 아무 객체가 생성되지 않을 경우


        Shape cursor = start.getNext();
        //노드를 가리킬 첫 커서를 실질적 의미가 담긴 객체로 지정 -> start.getNext()


        if(address == 1) {
            start.setNext(cursor.getNext());
            return;
        }
        //2)
        //맨 처음 노드를 삭제해야 하는 경우


        for(int i=1; i<address-1; i++){
            cursor = cursor.getNext();
        }
        //cursor을 삭제 위치 이전 노드로 이동시킴


        if(cursor.getNext()==null){
            //3)
            //삭제 위치에 객체가 존재하지 않는 경우

            System.out.println("삭제할 수 없습니다.");
           // return;
        }
        else{
            //4)
            cursor.setNext(cursor.getNext().getNext());
        }
    }
    public static void show(Shape start){ //모두 보기
       Shape cursor = start.getNext();
       //cursor을 start의 다음 노드로 설정

       for(;cursor!=null; cursor = cursor.getNext()) cursor.draw();

    }
    public static void main(String [] args){
        int n;
       Shape start = new Line();
       //임의의 DummyNode 생성 해 연결리스트에 접근

        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            n = sc.nextInt();

            switch (n){
                case 1:
                    add(start);
                    break;
                case 2:
                    delete(start);
                    break;
                case 3:
                    show(start);
                    break;
                case 4:
                    System.out.println("beauty을 종료합니다.");
                    return;
            }
        }

    }
}
