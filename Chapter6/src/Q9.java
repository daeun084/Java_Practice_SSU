import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        do{
            System.out.print("철수[가위(1), 바위(2), 보(3), 끝내기(4)]>>");
            input = sc.nextInt();
            int computer = (int)(Math.random()*2 +1);

            if(input == 4)break;

            specInput(input);
            specComp(computer);
            gameresult(input, computer);

        }while(true);
    }
    static void specInput(int input){
        switch (input){
            case 1:
                System.out.print("철수(가위) : ");
                break;
            case 2:
                System.out.print("철수(바위) : ");
                break;
            case 3:
                System.out.print("철수(보) : ");

        }
    }
    static void specComp(int computer){
        switch (computer){
            case 1:
                System.out.println("컴퓨터(가위)");
                break;
            case 2:
                System.out.println("컴퓨터(바위)");
                break;
            case 3:
                System.out.println("컴퓨터(보)");

        }

    }

    static void gameresult(int inp, int comp){
        if(inp == comp){
            System.out.println("비겼습니다.");
        }
        else if(inp ==1){
            if(comp == 2) System.out.println("컴퓨터가 이겼습니다.");
            else if(comp == 3) System.out.println("철수가 이겼습니다.");
        }
        else if(inp == 2){
            if(comp == 3) System.out.println("컴퓨터가 이겼습니다.");
            else if(comp == 1) System.out.println("철수가 이겼습니다.");
        }
        else if(inp == 3){
            if(comp == 1) System.out.println("컴퓨터가 이겼습니다.");
            else if(comp == 2) System.out.println("철수가 이겼습니다.");
        }
    }
}
