import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[4][4];

        a[0][0] = (int) (Math.random() * 10 + 1);
        a[0][2] = (int) (Math.random() * 10 + 1);
        a[0][3] =(int) (Math.random() * 10 + 1);
        a[1][1] =(int) (Math.random() * 10 + 1);
        a[1][2] = (int) (Math.random() * 10 + 1);
        a[1][3] = (int) (Math.random() * 10 + 1);
        a[2][0] = (int) (Math.random() * 10 + 1);
        a[2][1] = (int) (Math.random() * 10 + 1);
        a[2][3] = (int) (Math.random() * 10 + 1);
        a[3][3] = (int) (Math.random() * 10 + 1);

        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.print("\n");
        }

}}
