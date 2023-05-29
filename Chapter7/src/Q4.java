import java.util.Scanner;
import java.util.Vector;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        while(true){
            System.out.print("강수량 입력 (0 입력시 종료)>> ");
            int input = sc.nextInt();
            if(input == 0) break;
            else {
                v.add(input);
                vAvg(v, vPrint(v));
                //기깔나는 방법이다 아주 똑똑해
            }
        }
    }
    static int vPrint(Vector<Integer> v){
        int sum = 0;
        for(int i=0; i<v.size(); i++){
            System.out.print(v.get(i)+" ");
            sum+=v.get(i);
        }
        System.out.println();

        return sum;
    }
    static void vAvg(Vector<Integer> v, int sum){
        System.out.print("현재 평균 "+sum/v.size());
        System.out.println();
    }
}
