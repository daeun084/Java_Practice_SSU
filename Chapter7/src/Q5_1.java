import java.util.ArrayList;
import java.util.Scanner;

class Student<Integer> {
    String name;
    private String major;
    private int num;
    private double avg;

    public Student(String name, String major, int num, double avg) {
        this.name = name;
        this.major = major;
        this.num = num;
        this.avg = avg;
    }
    public void Print(){
        System.out.print(name+", "+major+", "+num+", "+avg);
    }
    public String toString(){
        return "이름:"+name+"\n학과:"+major+"\n학번:"+num+"\n학점평균:"+avg;
    }
}

public class Q5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>(4);
        System.out.println("학생 이름, 학과, 학번, 학점 평균 입력하세요.");
        for (int i = 0; i < 4; i++) {
            System.out.print(">> ");
            arrayList.add(new Student(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble()));
            //, 으로 구분하는 기능 넣어야 함
        }
        System.out.println("--------------------");

        for (int i = 0; i < 4; i++) {
            System.out.println(arrayList.get(i));
            System.out.println("--------------------");
        }

        String search;
        while(true){
            System.out.print("학생 이름 >> ");
            search = sc.next();
            if(search.equals("그만")) return;

            for(int i=0; i<4; i++){
                if(arrayList.get(i).name.equals(search)){
                    //arrayList의 요소(Student 객체)중에서 name이 search와 동일한 객체를 찾음
                    arrayList.get(i).Print();
                    System.out.println();
                }
            }
        }

    }
}
