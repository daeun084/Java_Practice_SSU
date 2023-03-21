import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오. >> ");
        int num = sc.nextInt();

        int fifthousand = num/50000;
        int tenthousand = num/10000%5;
        int thousand = num/1000%10;
        int hundred = num/100%10;
        int fift = num%100/50;
        int ten = num%100%50/10;
        int one = num%10;

        System.out.printf("오만원권 %d매\n만원권 %d매\n천원권 %d매\n백원권 %d매\n오십원 %d매\n십원권 %d매\n일원권 %d매\n",
                fifthousand, tenthousand, thousand, hundred, fift, ten, one);
    }
}
