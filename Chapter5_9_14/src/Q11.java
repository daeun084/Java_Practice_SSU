//완성은 했는데 코드 반복성이나 예외처리 측면에서 재검토 필요

import java.util.Scanner;
abstract class Calc{
    void setValue(int a, int b){};
    abstract int calculate();
}
class Add extends Calc{
    int a, b;
    void setValue(int a, int b){ this.a = a; this.b = b;}
    int calculate(){return a+b;}

}
class Sub extends Calc{
    int a, b;
    void setValue(int a, int b){ this.a = a; this.b = b;}
    int calculate(){return a-b;}

}
class Mul extends Calc{
    int a, b;
    void setValue(int a, int b){ this.a = a; this.b = b;}
    int calculate(){return a*b;}

}
class Div extends Calc{
    int a, b;
    void setValue(int a, int b){ this.a = a; this.b = b;}
    int calculate(){
        if(b!=0) return a/b;
        else return 0;
        //재검토
    }

}

public class Q11 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("두 정수와 연산자를 입력하시오>>");
        int a = sc.nextInt();
        int b = sc.nextInt();
        String x = sc.next();
        Calc c;

        switch (x) {
            case "+":
                c = new Add();
                break;
            case "-":
                c = new Sub();
                break;
            case "*":
                c = new Mul();
                break;
            case "/":
                c = new Div();
                break;
            default:
                c = new Add();
                //예외로 봄
                //반복을 줄이기 위함 재검토 필요

        }
        c.setValue(a, b);
        System.out.println(c.calculate());
    }
}
