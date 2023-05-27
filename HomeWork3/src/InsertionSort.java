import java.util.Arrays;

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

        printState(arr, 0);
        Insertion(arr, 0);
    }

    static void printState(int [] arr, int num){
        System.out.print("State "+num+": ");
        for(int i=0; i<32; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Insertion(int [] arr, int first){

        int [] success = new int[32];
        for(int i=0; i<32; i++){
            success[i] = i;
        }
        //정렬 완료를 비교할 배열 생성


        for(int i=1; i<arr.length; i++){
            for(int j = first; j<=first+i-1; j++){
                if(arr[first+i]<arr[j]){
                    //해당 값을 arr[first] ~ arr[first+i-1] 사이 구간 중 적절한 위치에 넣음

                    //해당 요소의 위치 변경, 다른 요소들 위치 변경
                    int tmp = arr[first+i];
                    for(int k = first+i; k>j; k--){
                        arr[k] = arr[k-1];
                    }
                    arr[j] = tmp;
                    break;
                    //arr[first+i]에 대한 정렬을 마치면 해당 반복문 탈출
                }
            }
            printState(arr, i);
            //배열의 상태 출력

            if(Arrays.equals(arr, success)){
                System.out.println("--InsertionSort Success--");
                break;
                //success 배열과 비교해서 정렬이 완료되면 완료문을 출력하고 종료
            }

        }

    }
}
