//2장 open challenge

import java.util.Scanner;
public class RockScissorPaperGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("가위바위보게임입니다. 가위, 바위, 보 중에서 입력하세요");
        System.out.print("철수 >> ");
        String chulsu = sc.nextLine();
        System.out.print("영희 >> ");
        String younghee = sc.nextLine();

        if(chulsu.equals("가위")){
            if(younghee.equals("바위")) System.out.println("영희가 이겼습니다.");
            else if(younghee.equals("보")) System.out.println("철수가 이겼습니다.");
            else System.out.println("비겼습니다");
        }
        else if(chulsu.equals("바위")){
            if(younghee.equals("보")) System.out.println("영희가 이겼습니다.");
            else if(younghee.equals("가위")) System.out.println("철수가 이겼습니다.");
            else System.out.println("비겼습니다");
        }
        else if(chulsu.equals("보")){
            if(younghee.equals("가위")) System.out.println("영희가 이겼습니다.");
            else if(younghee.equals("바위")) System.out.println("철수가 이겼습니다.");
            else System.out.println("비겼습니다");
        }


    }
}
