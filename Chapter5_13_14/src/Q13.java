interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("---다시 그립니다.");
        draw();
    }

}
abstract class Circle implements Shape{

}
public class Q13 {
    public static void main(String[] args){


    }
}
