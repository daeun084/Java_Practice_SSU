import java.util.Scanner;

public class Q10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[4][4];

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                    a[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        a[0][2]=0;
        a[1][0]=0;
        a[2][2]=0;
        a[3][0]=0;
        a[3][1]=0;
        a[3][2]=0;

        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.print("\n");
        }

}}
