import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Shape {
    void draw() {
        System.out.println("Shape");
    }
}

class Line extends Shape {
    void draw() {
        System.out.println("Line");
    }

}

class Rect extends Shape {
    void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle");
    }
}

public class Q10 {
    static Scanner sc = new Scanner(System.in);

    static void add(Vector v) {
        System.out.print("Line(1), Rect(2), Circle(3)>>");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                v.add(new Line());
                break;
            case 2:
                v.add(new Rect());
                break;
            case 3:
                v.add(new Circle());
                break;
        }
    }

    static void delete(Vector v) {
        System.out.print("삭제할 도형의 위치>>");
        int num = sc.nextInt();
        if (num >= v.size()) {
            System.out.println("삭제할 수 없습니다");
            return;
        }
        v.remove(num);
    }

    static void show(Vector v) {
        Iterator<Shape> it = v.iterator();
        while (it.hasNext()) {
            Shape current = it.next();
            current.draw();
        }
    }

    public static void main(String[] args) {

        System.out.println("그래픽 에디터 beauty을 실행합니다.");

        Vector<Shape> v = new Vector<>();
        while (true) {
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    add(v);
                    break;
                case 2:
                    delete(v);
                    break;
                case 3:
                    show(v);
                    break;
                case 4:
                    System.out.print("beauty을 종료합니다.");
                    return;
            }
        }

    }
}
