import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
//casting 이슈

interface IStack<T>{
    T pop();
    boolean push(T ob);
}
class MyStack<T> implements IStack<T>{
    static Scanner sc = new Scanner(System.in);
    int count = 0;
    ArrayList<T> arraystack = new ArrayList<>();
    public T pop(){
        count--;
    return arraystack.get(count);
    }
    public boolean push(T ob){
        if(count<10){
            System.out.print("push: ");
            arraystack.add((T) sc.next());
            count++;
            return true;
        }
        else return false;
    }
}
public class Q9 {
    public static void main(String[] args) {
        IStack<Integer> stack = new MyStack<Integer>();
        for(int i=0; i<10; i++) stack.push(i);
        while(true){
            Integer n = stack.pop();
            if(n==null) break;
            System.out.print(n+" ");
        }
    }
}
