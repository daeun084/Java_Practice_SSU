//Q6
import java.util.Scanner;

class Circle2{
    public double x, y;
    public int radius;
    public Circle2(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void max(){
        System.out.printf("가장 면적이 큰 원은 (%.1f,%.1f)%d\n",x, y, radius);
    }
}
public class CircleManaager2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Circle2 c[] = new Circle2[3];

        for(int i=0; i<3; i++){
            System.out.print("x, y, radius >>");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            int radius = sc.nextInt();
            c[i] = new Circle2(x, y, radius);
        }

      int max = 0;
        for(int i=0; i<c.length; i++){
            if(c[i].radius > c[max].radius) max = i;
        }
        c[max].max();
    }

}

