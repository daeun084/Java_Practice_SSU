//error
public class Q2 {
    public static void main(String[] args){

        int a [][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
        for(int i=0; i<5; i++){
            for(int j=0; j<4;j++) {
                System.out.printf("%d ", a[i][j]);
            }
            System.out.print("\n");
        }
    }
}
