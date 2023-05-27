public class MergeSort {

    public static void main(String[] args) {
        int arr[] = new int[32];
        for (int i = 0; i < 32; i++) {
            arr[i] = (int) (Math.random() * 32);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) i--;
            }
        }//랜덤으로 중복 없이 0~31을 arr 배열에 추가

        mergesort(arr, 0, 32);
    }

    static void printState(int[] arr, String str) {
        System.out.print(str+": ");
        for (int i = 0; i < 32; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void merge(int[] arr, int first, int n1, int n2) {
        int[] tmp = new int[n2+n1];
        //정렬을 위한 추가 배열 생성
        int l = first, h = first + n1, index = 0;
        //first부터 n1개의 arr의 인덱스를 가리킬 변수 l -> l<first+n1
        //n1부터 n2개의 arr의 인덱스를 기리킬 변수 h -> h < first+n1+n2
        //tmp 배열의 인덱스를 가리킬 변수 index -> 0부터 n1+n2-1 까지


        //l과 h를 이용해 두 개의 배열을 차례대로 비교한 후 작은 값부터 tmp에 저장함
        while (l < first + n1 && h < first+ n1+n2) {
            if (arr[l] < arr[h]) tmp[index++] = arr[l++];
            else tmp[index++] = arr[h++];
        }
        //arr[l]과 arr[h] 중 작은 값을 tmp[index]에 저장
        //index와 l, h중 사용한 변수의 값을 1씩 증가시킴


        //두 배열 중 한 배열의 정렬이 먼저 끝난 경우,
        //나머지 배열은 그대로 tmp에 복사
        while (l < first+ n1) { //h를 이용하는 배열의 정렬 완료
            tmp[index++] = arr[l++];
        }
        while (h < first + n1 + n2) {//l을 이용하는 배열의 정렬 완료
            tmp[index++] = arr[h++];
        }

        //arr에 tmp배열의 요소들을 해당 인덱스에 복사
        for(int i = first; i<first+n1+n2; i++){
            arr[i] = tmp[i-first];
        }

        System.out.printf("%d ~ %d ", first, first+n1+n2-1);
        printState(arr, "Merge");
        //상태 출력

    }

    static void mergesort(int[] arr, int first, int n) {
        printState(arr, "Divided"); //Divided 전 상태 출력

        int n1, n2;
        if (n > 1) { //arr의 요소 개수가 1개 이상이면
            n1 = n / 2; //arr의 중간 -> 왼쪽 배열의 원소 개수
            n2 = n - n1; //arr의 오른쪽 배열의 원소 개수

            //System.out.println("[ first: " + first + ", n: " + n + ", n1: " + n1 + ", n2: " + n2 + " ]\n");
            mergesort(arr, first, n1);
            mergesort(arr, first + n1, n2);
            //두 개의 배열로 나눔

            merge(arr, first, n1, n2);
            //두 배열을 정렬
        }

    }

}
