import java.util.Scanner;

class Person{
    private String name;
   public void setname(String name){
      this.name = name;
   }
   public String getName(){
       return name;
   }
   int a, b, c;
   int win(){
       if(a==b& b==c) {
           System.out.println("\t"+name+"님이 이겼습니다!");
           return 1;
       }
       else {
           System.out.println("\t아쉽군요!");
           return 0;
       }
   }

}
public class Q10 {
    static Scanner sc = new Scanner(System.in);
    static void run(Person [] parr){
        int index = -1;
        sc.nextLine();
        String ent;
        int win=0;

        while(true){
            index++;
          System.out.print("["+parr[index].getName()+"] : ");
          ent = sc.nextLine();

          win = makerandom(parr[index]);

            if(win==1) return;
          if(index==1) index = -1;
        }
    }

    static int makerandom(Person p){
        p.a = (int)(Math.random()*3 + 1);
        p.b = (int)(Math.random()*3 + 1);
        p.c = (int)(Math.random()*3 + 1);

        System.out.print("\t\t"+p.a +"\t"+p.b+"\t"+p.c);

        return p.win();
    }
    public static void main(String[] args) {

        Person a = new Person();
        Person b = new Person();
        Person[] parr = {a, b};

        System.out.print("1번째 선수 이름>>");
        a.setname(sc.next());
        System.out.print("2번째 선수 이름>>");
        b.setname(sc.next());

        run(parr);
    }
}
