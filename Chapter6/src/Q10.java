import java.util.Scanner;

class Person{
    private String name;
   public void getname(String name){
      this.name = name;
   }

}
public class Q10 {

    static void run(Person a, Person b){
        while(true){
           // System.out.print();
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Person a = new Person();
        Person b = new Person();

        System.out.print("1번째 선수 이름>>");
        a.getname(sc.next());
        System.out.print("2번째 선수 이름>>");
        b.getname(sc.next());

        run(a, b);
    }
}
