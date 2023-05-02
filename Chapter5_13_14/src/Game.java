import java.util.Random;
import java.util.Scanner;

//Challenge
class Bear extends GameObject{
    public Bear(){
        super(0, 0, 1);
    }

    @Override
    protected void move(String input) {
        switch (input){
            case "a":
                this.x -= distance;
                break;
            case "s":
                this.y += distance;
                break;
            case "d":
                this.y -= distance;
                break;
            case "f":
                this.x+= distance;
                break;
        }
    }

    @Override
    protected char getShape() {
        return 'B';
    }
}
class Fish extends GameObject{
    String[] where = {"a", "s", "d", "f"};


    public Fish(){
        super((int)(Math.random()*20), (int)(Math.random()*10), 1);
        //처음 시작 위치 랜덤
    }
    @Override
    protected void move(String input) {
        int wherenumber = (int)(Math.random()*4);
        //0부터 4까지의 난수 생성

        switch (where[wherenumber]){
            case "a":
                this.x -= distance;
                break;
            case "s":
                this.y += distance;
                break;
            case "d":
                this.y -= distance;
                break;
            case "f":
                this.x+= distance;
                break;
        }
    }

    @Override
    protected char getShape() {
        return '@';
    }
}
public class Game {

    static void show(GameObject bear, GameObject fish){
        for(int i=0; i<10; i++){
            for(int j = 0; j<20; j++){
                if(bear.getX() == j && bear.getY() == i) System.out.print(bear.getShape());
                else if(fish.getX() == j&& fish.getY() == i)
                    System.out.print(fish.getShape());
                    else System.out.print("-");
            }
            System.out.println();
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다. **");
        GameObject bear = new Bear();
        GameObject fish = new Fish();

        int count = 0;

        while(true){
            show(bear, fish);

            count++;
            System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >>");
            String input = sc.next();
            bear.move(input);

            if(count==6) count=0;
            else if(count >= 4) fish.move(input);


            if(bear.collide(fish)) {
                show(bear, fish);
                break;
            }
        }
        System.out.println("Bear Wins!!");
    }
}
