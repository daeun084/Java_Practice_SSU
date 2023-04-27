//Q10
import java.util.Scanner;
class Dictionary{
    private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
    public static String[] eng = {"love", "baby", "money", "future", "hope"};
    public static String kor2Eng(String word){
        for(int i=0; i<5; i++){
            if(kor[i].equals(word)) {
                return "은 "+eng[i];
            }
        }
        return "는 저의 사전에 없습니다.";
    }
}
public class DicApp {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Dictionary dic = new Dictionary();
        System.out.println("한영 단어 검색 프로그램입니다.");

        while(true){
            System.out.print("한글 단어?");
            String input = sc.next();

            if(input.equals("그만")) break;

            System.out.print(input+ +dic.kor2Eng(input)+"\n");
        }
    }
}
