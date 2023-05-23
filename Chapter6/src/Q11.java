import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(">>");
        String str = sc.nextLine();

        StringBuffer stb = new StringBuffer();
        stb.append(str);
        String replaceInput;

        do{
            System.out.print("명령: ");
            replaceInput = sc.nextLine();

            findReplace(stb, replaceInput);

        }while(!replaceInput.equals("그만"));
        System.out.println("종료합니다");
    }
    static void findReplace(StringBuffer stb, String replace){
        int index=0;
        for(int i=0; i<replace.length(); i++){
            if(replace.substring(i,i+1).equals("!")){
                index = i;
                break;
            }
        }
        if(index==0){
            System.out.println("잘못된 명령입니다!");
            return;
        }


        String origin = replace.substring(0, index);
        String newstr = replace.substring(index+1, replace.length());


        for(int i=0; i<stb.length(); i++){
            if(stb.substring(i, i+index).equals(origin)){
                stb.replace(i, i+index, newstr);
                System.out.println(stb);
                return;
            }
        }
//모든 문자열을 수정해야 하는가 흠
        //!뒤에 문자열이 없을 때 오류 발생

        System.out.println("찾을 수 없습니다!");

    }
}
