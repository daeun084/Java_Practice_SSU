import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        System.out.println("문자열을입력하세요. 빈칸이나 있어도 되고 영어 한글 모두 됩니다.");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String subStr1, subStr2;

        
        for(int i=1; i<=str.length(); i++){
            subStr1 = str.substring(i, str.length());
            subStr2 = str.substring(0, i);
            System.out.println(subStr1+subStr2);
        }

    }
}
