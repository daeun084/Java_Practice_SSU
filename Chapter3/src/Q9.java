import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] a= new int[4][4];

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                a[i][j] = (int)(Math.random()*10+1);
                System.out.printf("%d ", a[i][j]);
            }
            System.out.print("\n");
        }

    }
}
