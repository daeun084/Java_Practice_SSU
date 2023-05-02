import java.util.Scanner;

//Challenge
class Bear extends GameObject{
    public Bear(){
        super(0, 0, 1);
    }

    @Override
    protected void move() {

    }

    @Override
    protected char getShape() {
        return 0;
    }
}
class Fish extends GameObject{
    public Fish(){
        super(0, 0, 1);
    }
    @Override
    protected void move() {

    }

    @Override
    protected char getShape() {
        return 0;
    }
}
public class Game {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        while(true){
            System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >>");
            int input = sc.nextInt();

        }

    }
}
