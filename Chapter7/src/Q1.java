import java.util.Scanner;
import java.util.Vector;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        System.out.print("정수(-1이 입력될 때가지)>> ");

       do{
           v.add(sc.nextInt());
       }while(v.get(v.size()-1) != -1);

       int max=0;
       for(int i=0; i<v.size(); i++){
           if(v.get(i)>max) max = v.get(i);
       }
        System.out.println("가장 큰 수는 "+max);
    }
}
