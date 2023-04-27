import java.util.Scanner;
public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");

        String str[] = {"가위", "바위", "보"};

        while(true){
            System.out.print("가위 바위 보!>>");
            String input = sc.next();

            //컴퓨터가 내는 방식 랜덤으로 -> 수를 랜덤으로 뽑아 str에 랜덤한 수 전달
            int n = (int)(Math.random()*3);
            String comp = str[n];

            if(input.equals("그만")) break;

            System.out.print("사용자 = "+input+", 컴퓨터 = "+comp);

            if(comp.equals(input))
                System.out.println(", 비겼습니다");
            else if(comp.equals("가위")){
                if(input.equals("바위")) System.out.println(", 사용자가 이겼습니다");
                else if(input.equals("보")) System.out.println(", 컴퓨터가 이겼습니다");
            }
            else if(comp.equals("바위")){
                if(input.equals("보")) System.out.println(", 사용자가 이겼습니다");
                else if(input.equals("가위")) System.out.println(", 컴퓨터가 이겼습니다");
            }
            else if(comp.equals("보")){
                if(input.equals("가위")) System.out.println(", 사용자가 이겼습니다");
                else if(input.equals("바위")) System.out.println(", 컴퓨터가 이겼습니다");
            }

        }
        System.out.print("게임을 종료합니다 ...");
}}
