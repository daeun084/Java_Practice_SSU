//error
public class Q2 {
    public static void main(String[] args){

        int a [][] = {{1}, {1, 2, 3}, {1}, {1, 2, 3, 4}, {1, 2}};
        for(int i=0; i<5; i++){
            for(int j=0; j<a[i].length;j++) {  //2차원 배열 다룰 때 각 행의 열 개수 확인하기
                System.out.printf("%d ", a[i][j]);
            }
            System.out.print("\n");
        }
    }
}
