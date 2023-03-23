import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=99; i++){
            if(i==3 || i==6 || i==9 || i/10==3 || i/10==6 || i/10==9){
                System.out.printf("%d 박수 짝\n", i);
            }
        }
    }
}
