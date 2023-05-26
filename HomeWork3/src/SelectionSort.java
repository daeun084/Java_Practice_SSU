//자료구조 HomeWork3_SelectionSort 사용 배열 정렬
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int data[] = new int[32];

        for(int i=0; i<32; i++){
            data[i] = (int)(Math.random()*32);
            for(int j = 0; j<i; j++){
                if(data[i]==data[j]) i--;
            }
        }
        //랜덤으로 중복 없이 0~31을 arr 배열에 추가
        printState(data, 0);
        selectionsort(data, 0, 32);


    }
    static void printState(int [] arr, int num){
        System.out.print("State "+num+": ");
        for(int i=0; i<32; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void selectionsort(int [] data, int first, int n)
    {
        int [] success = new int[32];
        for(int i=0; i<32; i++){
            success[i] = i;
        }
        //정렬 완료를 비교할 배열 생성


        int big, tmp;
        for( int i = n-1; i>0; i--){
            big = first;

            for(int j = first+1; j<=first+i ; j++){
                if(data[big] < data[j])
                    big = j;
            }

            tmp = data[first+i];
            data[first+i] = data[big];
            data[big] = tmp;

            printState(data, 32-i);
            //상태 출력


            if(Arrays.equals(data, success)) {
                System.out.println("--SelectionSort Success--");
                return;
            } //success 배열과 같으면 정렬 완료로 간주하고 return

        }
    }
}
