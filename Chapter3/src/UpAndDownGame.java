import java.util.Scanner;
public class UpAndDownGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while(true) {
            int answer = (int) (Math.random() * 100);

            System.out.println("수를 결정하였습니다. 맞추어 보세요\n0-99");
            int num = 1;
            int min = 1;
            int max = 99;
            while (true) {
                System.out.print(num + ">>");
                int input = sc.nextInt();
                if(input==answer){
                    System.out.print("맞았습니다.\n다시 하시겠습니까 (y/n>>");
                    String again = sc.next();

                    if(again.equals("y")) break;
                    else return;
                }
                else if(answer>input){
                    min = input;
                    System.out.print("더 높게\n");
                    System.out.printf("%d-%d\n",min, max);
                }
                else{
                    max = input;
                    System.out.print("더 낮게\n");
                    System.out.printf("%d-%d\n", min, max);
                }
                num++;

            }
        }
    }
}
