public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[32];
        for (int i = 0; i < 32; i++) {
            arr[i] = (int) (Math.random() * 32);
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) i--;
            }
        }
        //랜덤으로 중복 없이 0~31을 arr 배열에 추가

        printState(arr, "First");
        quicksort(arr, 0, 32);
        printState(arr, "Success");

    }

    static void printState(int[] arr, String str) {
        System.out.print(str + ": ");
        for (int i = 0; i < 32; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    static void quicksort(int[] arr, int first, int n) {
        int pivotIndex;
        int n1;
        int n2;
        if (n > 1) {
            pivotIndex = partition(arr, first, n);
            //pivotIndex를 선정

            n1 = pivotIndex - first;
            //first부터 pivotIndex까지의 원소 개수
            n2 = n - n1 - 1;
            //n부터 n1+1까지의 원소 개수

            quicksort(arr, first, n1);
            //first부터 n1까지의 배열을 다시 정렬
            quicksort(arr, pivotIndex + 1, n2);
        }

    }

    static int partition(int[] arr, int first, int n) {
        int pivot = arr[first];
        //pivot은 arr의 첫번째 원소
        System.out.println("[ Pivot ]: " + pivot + ", [ n ]: " + n);

        int toosmall = first + 1, toobig = first + n - 1;
        //toosmall은 pivot 바로 뒤 인덱스로, toobig은 first에서 n번 이동한 인덱스로 지정


        while (true) {
            if (toobig < toosmall) break;
            //toobig과 toosmall이 교차하면 break


            if (pivot > arr[toosmall] && toosmall <= toobig && toosmall <= 30) toosmall++;
            //pivot이 arr[toosmall]보다 크면 toosmall에 1을 더해 다음 인덱스로 진행
            if (pivot < arr[toobig] && toobig >= toosmall) toobig--;
            //pivot이 arr[toobig]보다 작으면 toobig에 1을 빼 전 인덱스로 진행시킴


            if (toobig > toosmall && pivot < arr[toosmall] && pivot > arr[toobig]) {
                //toobig이 toosmall보다 크고
                //pivot<arr[toosmall] && pivot>arr[toobig]이면
                //arr[toobig]와 arr[toosmall] 교환
                int tmp = arr[toobig];
                arr[toobig] = arr[toosmall];
                arr[toosmall] = tmp;

                //swap관련 정보와 arr의 현재 상태 출력
                System.out.println("Swap -> " + arr[toobig] + ", " + arr[toosmall]);
                printState(arr, "Swap State");

            }
            if(pivot == 31) break;
            //pivot이 31이면 while문 탈출을 못해 무한루프에 걸리기 때문에
            //while문을 탈출한 후
            //ar[[first], 31은 항상 arr[toobig]보다 크므로 둘의 위치 교환
            //-> 31이 arr의 맨 마지막에 위치

        }
        //toobig<toosmall이고 엇갈렸다면,
        //또한 pivot이 arr[toobig]보다 크다면,
        //pivot이 arr의 가운데에 오도록 함
        if (arr[first] > arr[toobig]) {
            int tmp = arr[toobig];
            arr[toobig] = arr[first];
            arr[first] = tmp;
        }


        //swap관련 정보와 arr의 현재 상태 출력
        printState(arr, "State");
        System.out.println();


        //pivot값의 위치 반환
        return toobig;
    }
}
