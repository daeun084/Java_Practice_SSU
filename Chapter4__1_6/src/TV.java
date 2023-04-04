//Q1
public class TV {
    String where;
    int when;
    int size;
    public TV(String where, int when, int size){
        this.where = where;
        this.when = when;
        this.size = size;
    }
    public void show(){
        System.out.printf("%s에서 만든 %d년형 %d인지 TV\n", where, when, size);
    }
    public static void main(String[] args){
        TV myTV = new TV("LG", 2017, 32);
        myTV.show();
    }
}
