import java.util.Scanner;

public class Q7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        for(int i=0; i<10; i++){
            a[i] = (int)(Math.random()*10 + 1);
        }

        double avg = 0;
        System.out.print("랜덤한 정수들>>");
        for(int i=0; i<10; i++) {
            System.out.printf("%d ", a[i]);
            avg+=a[i];
        }

        System.out.printf("\n평균은 %.2f", avg/10);
    }
}
