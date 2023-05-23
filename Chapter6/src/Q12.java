import java.util.Scanner;

public class Q12 {
    static Scanner sc = new Scanner(System.in);

    static void run(Person[] parr, int num){
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
            if(index==num-1) index = -1;
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

        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = sc.nextInt();

        Person[] parr = new Person[num];
        for(int i=0; i<num; i++){
            parr[i] = new Person();
            System.out.print(i+1 +"번째 선수 이름>>");
            parr[i].setname(sc.next());
        }

        run(parr, num);
    }
}





