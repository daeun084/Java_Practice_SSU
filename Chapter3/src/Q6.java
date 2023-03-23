import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        System.out.print("금액을 입력하시오>>");
        int num = sc.nextInt();

        for(int i=0; i<8; i++){
            if(num/unit[i]!=0) {
            System.out.printf("%d원 짜리: ", unit[i]);
            System.out.printf("%d개\n", num/unit[i]);

            num%=unit[i];
        }}

    }
}
