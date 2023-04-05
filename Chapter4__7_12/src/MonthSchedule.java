//Q7
//뭐라는거야
import java.util.Scanner;

class Day{
    private String work;
    public void set(String work){this.work =work;}
    public String get() {return work;}
    public void show(){
        if(work==null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
        }
public class MonthSchedule {
    Scanner sc = new Scanner(System.in);
    int day;
    public MonthSchedule(int day){
        this.day = day;
    }
    public void input(){
        System.out.print("날짜(1~30)?");
        int day = sc.nextInt();
    }
    public void view(){

    }
    public void finish(){
    System.out.println("프로그램을 종료합니다.");
    return;
    }
    public void run(){
        System.out.println("이번달 스케쥴 관리 프로그램.");
        System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
        int num = sc.nextInt();
        if(num==1) input();
        if(num==2) view();
        if(num==3) finish();

    }
    public static void main(String[] args){

        MonthSchedule april = new MonthSchedule(30);
        april.run();


    }

}
