import java.util.Scanner;

class Player{
    Scanner sc = new Scanner(System.in);
    String name;
    public Player(String name){
        this.name = name;
    }
    public String getWordFromUser(){
        System.out.print(name+">>");
        String input = sc.next();
        return input;
    }
    public boolean CheckSuccess(String word, String input){
        int last = word.length()-1;
        if(word.charAt(last) == input.charAt(0)) return true;
        else return false;
    }
}
public class Challenge {
    public static void main(String[] ars){
        Challenge ch = new Challenge();

        Scanner sc = new Scanner(System.in);
        System.out.println("끙말잇기 게임을 시작합니다...");
        System.out.print("게임에 참가하는 인원은 몇 명입니까>>");
        int person = sc.nextInt();
        Player arr[] = new Player[3];

        for (int i=0; i<person; i++){
            System.out.print("참가자의 이름을 입력하세요>>");
            String name = sc.next();
            arr[i] = new Player(name);
        }
        ch.run(arr);

    }

    public void run(Player arr[]){

        System.out.println("시작하는 단어는 아버지 입니다");
        String word = "아버지";

        int count =0;
        while(true){
            if (count==3) count=0;

           String input = arr[count].getWordFromUser();

           if(arr[count].CheckSuccess(word, input)) {
               word = input;
               count++;
           }
           else{
               System.out.print(arr[count].name + "이 졌습니다.");
               return;
           }

        }

    }
}
