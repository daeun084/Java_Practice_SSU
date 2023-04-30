//Q9
//미완성
import java.util.Scanner;

interface Stack{
    int length();
    int capacity();
    String pop();
    boolean push(String val);

}

class StringStack implements Stack{
    Scanner sc = new Scanner(System.in);
    private int length;
    private int capacity;
    String input;

    public int length(){return length;}
    public int capacity(){return capacity;}
    public String pop(){
        return input;
    }
    public boolean push(String val){
        if(length<capacity) return true;
        else return false;
    }

    public void run(){
        System.out.print("총 스택 저장 공간의 크기 입력 >>");
        capacity = sc.nextInt();

        while(true){


            System.out.print("문자열 입력 >> ");
            input = sc.next();

            if(input.equals("그만")) break;


            if(push(input)){
                length++;
            }
            else{
                //capacity == length
                System.out.println("스택이 꽉 자서 푸시 불가!");
            }

        }

        System.out.print("스택에 저장된 모든 문자열 팝 : ");

    }
}
public class StackApp {
    public static void main(String [] args){
        StringStack s = new StringStack();
        s.run();

    }
}
