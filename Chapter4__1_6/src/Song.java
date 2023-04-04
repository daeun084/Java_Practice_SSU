//Q3
public class Song {
    String title;
    String artist;
    int year;
    String country;
    public Song(){

    }
    public Song(String title, String artist, int year, String country){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    public void show(){
        System.out.printf("%d년 %s국적의 %s가 부른 %s\n", year, country, artist, title);
    }
    public static void main(String[] args){
        Song sg = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        sg.show();

    }
}
