public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = new int[32];
        for(int i=0; i<32; i++){
            arr[i] = (int)(Math.random()*32);
            for(int j = 0; j<i; j++){
                if(arr[i]==arr[j]) i--;
            }
        }
        //랜덤으로 중복 없이 0~31을 arr 배열에 추가


    }
}
