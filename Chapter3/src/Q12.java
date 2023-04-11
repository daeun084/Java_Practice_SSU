

public class Q12 {
    public static void main(String[] args) {
    int sum=0;

    for(int i=0; i<args.length; i++){
        try{
            int input = Integer.parseInt(args[i]);
            sum += input;
        }
        catch (NumberFormatException n){
        }
    }
    System.out.print(sum);
    }
}