//Q10

abstract class PairMap{
    protected String KeyArray [];
    protected String ValueArray[] ;
    abstract String get(String key);
    abstract void put(String key, String value);
    abstract String delete(String key);;
    abstract int length();
}
class Dictionary extends PairMap{
    private int length=0;
    public Dictionary(int x){
        KeyArray = new String[x];
        ValueArray = new String[x];
    }
    public String get(String key){
        for(int i=0; i<length; i++){
            if(KeyArray[i].equals(key)) {
                return ValueArray[i];
            }
        }
     return null;
    }
    void put(String key, String value){
        for(int i=0; i<length; i++){
            if(KeyArray[i].equals(key)) {
                if(ValueArray[i]==null){
                    length++;
                    ValueArray[i] = value;
                }
                else{
                    ValueArray[i] = value;
                }
                return;
            }
        }
        KeyArray[length] = key;
        ValueArray[length] = value;
        length++;
    }
    String delete(String key){
        String item = null;

        for(int i=0; i<length; i++){
            if(KeyArray[i].equals(key)) {
                item = ValueArray[i];
                ValueArray[i] = null;
                length--;
                break;
            }
        }
        return item;
    }
    int length(){
        return length;
    }
}
public class DictionaryApp {
    public static void main(String [] args){
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이선");
        dic.put("이재문", "C++");

        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));

        dic.delete("황기태");
        System.out.println("황기태의 값은 "+dic.get("황기태"));
    }
}
