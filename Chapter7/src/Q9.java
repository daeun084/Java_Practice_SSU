import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.*;

interface IStack<T> {
    T pop();

    boolean push(T ob);
}

class MyStack<T> implements IStack<T> {
    Object [] obstack = new Object[10];
    int count = 0;
    ArrayList<T> arraylist = new ArrayList<>();

    public T pop() {
        if(count==0) return null;
        else {
            count--;
            return arraylist.get(count);
        }
    }

    public boolean push(T ob) {

        if (count < 10) {
            arraylist.add(ob);
            count++;
            return true;
        }
        else return false;
    }
}

public class Q9 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        IStack<Integer> stack = new MyStack<Integer>();
        for (int i = 0; i < 10; i++) {
            System.out.print("push: ");
            stack.push(sc.nextInt());
        }
        while (true) {
            Integer n = stack.pop();
            if (n == null) break;
            System.out.print(n + " ");
        }
    }
}
