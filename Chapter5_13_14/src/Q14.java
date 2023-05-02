class Oval implements Shape{
    private int weight, height;
    public Oval(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
    public void draw(){
        System.out.println(weight+"x"+height+"에 내접하는 타원입니다.");
    }
    public double getArea(){
    //타원의 넓이는 (가로길이/2)*(세로길이/2)*파이
        return weight*height*PI;
    }
}
class Rect implements Shape{
    private int weight, height;
    public Rect(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
    public void draw(){
        System.out.println(weight+"x"+height+"크기의 사각형 입니다.");
    }
    public double getArea(){
        return weight*height;
    }
}
public class Q14 {
    public static void main(String[] args){
        Shape [] list = new Shape[3];
        list[0] = new Circle(10);
        list[1] = new Oval(20, 30);
        list[2] = new Rect(10, 40);

        for(int i=0; i<list.length; i++) list[i].redraw();
        for(int i=0; i<list.length; i++) System.out.println("면적은 "+list[i].getArea());

    }
}
