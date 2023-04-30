import java.util.Scanner;

class Km2Mile extends Converter{
    public Km2Mile(double ratio){
        this.ratio = ratio;
    }
    protected String getSrcString(){
        return "Km";
    }
    protected String getDestString(){
        return "mile";
    }
    protected double convert(double src){
        return src/ratio;
    }
}
public class Q4 {
    public static void main(String [] args){
        Km2Mile toMile = new Km2Mile(1.6);
        toMile.run();

    }
}
