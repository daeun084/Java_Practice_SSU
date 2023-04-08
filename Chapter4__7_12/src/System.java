//Q12
import java.util.Scanner;
public class System {
    static class func{
        public static void show(String[] arr){
            for(int i=0; i<10; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        public static void input(String name, int where, String[] arr){
            arr[where-1] = name;
        }
        public static void cancel(String name, String[] arr){
            for(int i=0; i<10; i++){
                if(arr[i].equals(name))
                    arr[i] = "---";
            }
        }
    }

    static class S extends func{
        static String[] arr = {"---", "---", "---", "---", "---",
                "---", "---", "---", "---", "---"};

    }
    static class A extends func{
        static String[] arr = {"---", "---", "---", "---", "---",
                "---", "---", "---", "---", "---"};
    }
    static class B extends func{
        static String[] arr = {"---", "---", "---", "---", "---",
                "---", "---", "---", "---", "---"};
    }
    public static void reserv(){ //예약시스템
        Scanner scan = new Scanner(System.in);
        System.out.print("좌석구분 S(1), A(2), B(3)>>");
        int num = scan.nextInt();


        switch (num) {
            case 1:
                System.out.print("S>> ");
                S.show(S.arr);

                System.out.print("이름>>");
                String name = scan.next();
                System.out.print("번호>>");
                int where = scan.nextInt();

                S.input(name,where, S.arr);
                break;
            case 2:
                System.out.print("A>> ");
                A.show(A.arr);

                System.out.print("이름>>");
                name = scan.next();
                System.out.print("번호>>");
                where = scan.nextInt();

                A.input(name,where, A.arr);
                break;
            case 3:
                System.out.print("B>> ");
                B.show(B.arr);

                System.out.print("이름>>");
                name = scan.next();
                System.out.print("번호>>");
                where = scan.nextInt();

                B.input(name,where, B.arr);
        }

    }
    public static void see(){ //조회 시스템
        S.show(S.arr);
        A.show(A.arr);
        B.show(B.arr);
        System.out.println("<<<조회를 완료하였습니다>>>");

    }
    public static void cancel(){
        Scanner scc = new Scanner(System.in);

        System.out.print("좌석 S:1, A:2, B:3>>");
        int num = scc.nextInt();


        switch (num) {
            case 1:
                S.show(S.arr);
                System.out.print("이름>>");
                String name = scc.next();
                S.cancel(name, S.arr);
                break;
            case 2:
                A.show(A.arr);
                System.out.print("이름>>");
                name = scc.next();
                A.cancel(name, A.arr);
            case 3:
                B.show(B.arr);
                System.out.print("이름>>");
                name = scc.next();
                B.cancel(name, B.arr);
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        S s = new S();
        A a = new A();
        B b = new B();

        System.out.println("명품콘서트홀 예약시스템입니다");
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int num = sc.nextInt();

            switch (num){
                case 1:
                    reserv();
                    break;
                case 2:
                    see();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    return ; //종료

            }
        }
    }
}
