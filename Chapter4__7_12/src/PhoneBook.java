//Q8
//
import java.util.Scanner;
class Phone{
    String name;
    String tel;

    public Phone(String name, String tel){
        this.name =name;
        this.tel = tel;
    }
    public void show(){
        System.out.print(name+"의 번호는 "+tel+ " 입니다.\n");
    }
}
public class PhoneBook {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("인원수>>");
        int num = sc.nextInt();

        Phone[] ph = new Phone[num];

        for(int i=0; i<num; i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = sc.next();
            String tel = sc.next();
            ph[i] = new Phone(name, tel);
        }
        System.out.print("저장되었습니다...\n");

      while(true){
          System.out.print("검색할 이름>>");
          String inputname = sc.next();

          if (inputname.equals("그만")) break;

          for(int i=0; i<num; i++){
              if(ph[i].name.equals(inputname)) {
                  ph[i].show();
                  break;
              }

              if(i==num-1) System.out.printf("%s 이 없습니다.\n", inputname);
          }

      }

    }}


