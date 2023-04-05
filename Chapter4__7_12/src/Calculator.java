//Q11
import java.util.Scanner;
class Add{
    int a, b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a+b;
    }
}
class Sub{
    int a, b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a-b;
    }
}
class Mul{
    int a, b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a*b;
    }

}
class Div{
    int a, b;
    public void setValue(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int calculate(){
        return a/b;
    }
}
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String x = sc.next();

        switch (x){
            case("+"):
                Add ad = new Add();
                ad.setValue(a, b);
                System.out.println(ad.calculate());
                break;
            case("-"):
                Sub sb = new Sub();
                sb.setValue(a,b);
                System.out.println(sb.calculate());
                break;
            case("*"):
                Mul ml = new Mul();
                ml.setValue(a, b);
                System.out.println(ml.calculate());
                break;
            case("/"):
                Div dv = new Div();
                dv.setValue(a, b);
                System.out.println(dv.calculate());
                break;
        }

    }
}
