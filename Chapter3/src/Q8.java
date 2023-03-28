import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int num = sc.nextInt();

        int[] a = new int[num];
        for(int i=0; i<num; i++){
            a[i] = (int)(Math.random()*100 + 1);

            //겹치지 않는 랜덤 구현
            for(int j=0; j<i; j++){
                if(a[i]==a[j]) i--;
            }
        }

        for(int i=0; i<num; i++) {
            System.out.printf("%d ", a[i]);
            if((i+1)%10==0) System.out.print("\n");
        }
    }
}
