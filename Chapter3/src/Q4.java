import java.util.Scanner;

public class Q4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");

        //char형 입력이 없어서 문자열 입력 받고 추출하기
        String s = sc.next();
        char c = s.charAt(0);

        //char형 변수 선언
        for(char i=c; i>='a'; i--){
            for(char j='a'; j<=i; j++){
                System.out.printf("%c", j);
            }
            System.out.print("\n");
        }
    }
}
