

public class Q12 {
    public static void main(String[] args) {
    int sum=0;

    for(int i=0; i<args.length; i++){
        if(args[i].getClass().getName().equals("Int")){  //변수의 자료형 확인 -> .getClass().getName()
            sum+=Integer.parseInt(args[i]);
        }
    }
    System.out.print(sum);
    }
}