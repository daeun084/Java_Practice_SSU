import java.util.Scanner;
public class Q11 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.print("달을 입력하세요(1~12)>>");
       int month = sc.nextInt();

       //if-else문
        /*
        if(month>=3 && month<=5){
            System.out.println("봄");
        }
        else  if(month>=6 && month<=8) {
            System.out.println("여름");
        }
        else  if(month>=9 && month<=11) {
            System.out.println("가을");
        }
        else{
            System.out.println("겨울");
        }

         */


        //switch문
        switch (month){
            case(11):
                System.out.println("가을");
                break;
            case(10):
                System.out.println("가을");
                break;
            case(9):
                System.out.println("가을");
                break;
            case(8):
                System.out.println("여름");
                break;
            case(7):
                System.out.println("여름");
                break;
            case(6):
                System.out.println("여름");
                break;
            case(5):
                System.out.println("봄");
                break;
            case(4):
                System.out.println("봄");
                break;
            case(3):
                System.out.println("봄");
                break;
            default:
                System.out.println("겨울");
        }
    }
}
