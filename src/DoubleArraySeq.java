public class DoubleArraySeq {
    double[] data;
    int manyItems=0;
    int currentIndex=0; //index of the current element
    //current element가 없으면 currentIndex는 manyItems와 동일
    int capacity=0;



    //Constructor_1
    public DoubleArraySeq() throws OutOfMemoryError{
        //precondition - the seq is empty and has initial capacity of 10
        //throws - OutOfMemoryError
        if(manyItems==0) {
            data = new double[10];
            capacity = 10;
        }

    }
    //Constructor_2
    public DoubleArraySeq(int initialCapacity){
        //parameter - initialCapacity is the initial capacity of this seq
        //precondition - initialCapacity is non-negative
        //postcondition - this seq is empty and has the given initial capacity
        //Throws - OutOfMemoryError / IllegalArgumentException

        if(manyItems==0) { //empty seq
            capacity = initialCapacity;
            data = new double[capacity];
        }
    }
    public void addAfter(double element){
        //add new element(parameters: element) after the current element
        //postcondition - current element가 없다면 seq 맨 끝에 element 추가, 추가된 element가 current element가 됨
        //Throws - OutOfMemoryError - 메모리부족에 의해 오류 발생
        //메모리는 Integer.MAX_VALUE 까지만 사용해야 함

        if(!(isCurrent())){ //currentelement가 없다면
            data[0] = element;
            manyItems=1;
            currentIndex=0; //추가된 element가 currentelement가 됨
        }
        else if(manyItems!=capacity){
            for(int i=manyItems; i>currentIndex+1; i--){
                data[i] = data[i-1];
            }
            data[currentIndex+1] = element;
            manyItems++;

        }


    }
    public void addBefore(double element){
        //add new element(parameters: element) before the current element
        //postcondition - current element가 없다면 seq 맨 앞에 element 추가, 추가된 element가 current element가 됨
        //Throws - OutOfMemoryError - 메모리부족에 의해 오류 발생

        if(!(isCurrent())){ //currentelement가 없다면
            data[0] = element;
            manyItems=1;
            currentIndex=0; //추가된 element가 currentelement가 됨
        }
        else if(manyItems!=capacity){
            for(int i=manyItems; i>currentIndex; i--){
                data[i] = data[i-1];
            }
            data[currentIndex] = element;
            manyItems++;

        }

    }
    public void addAll(DoubleArraySeq addend){
        //place contetnts of another seq at the end of this seq
        //parameters - addend: a seq whose contents will be placed at the end of this seq
        //precondition - the parameter is not null
        //postcondition - addend에 변화 없어야 함, this seq의 끝에 addend가 추가되어야 함
                        //this seq의 current element는 원래대로 유지
        //Throws - OutOfMemoryError / NullPointerException : addend가 null이면 오류 발생

        if(addend.manyItems!=0){ //addend가 null이 아니면
        if(capacity>=manyItems+ addend.manyItems){
            for(int i=manyItems; i< addend.manyItems+manyItems; i++){
                data[i] = addend.data[i-this.manyItems];
            }
            manyItems+= addend.manyItems;
            //currentelement 유지, manyItems 더해진 만큼 증가
        }}
        else{ //addend가 null이면 오류 발생
            throw new NullPointerException("addend is null");
        }

    }
    public void advance(){
        //current element가 seq에서 앞으로 하나 전진
        //precondition - isCurrent()는 true 반환
        //postcondition - current element가 seq의 맨 끝 요소를 가리킨다면 함수의 실행 이후 current element는 존재하지 않음
        //Throws - IllegalStateException, current element가 존재하지 않으면 함수는 호출되지 않음

        if(isCurrent()==true){//current element가 존재
            if(currentIndex+1==manyItems){ //curent element가 seq의 맨 끝 요소를 가리킴
                currentIndex=manyItems; //currentelement는 존재하지 않음
            }
            else{
                currentIndex++;
            }
        }
        else{ //current element가 존재하지 않으면
            throw new IllegalStateException("currnet Element doesn't exist");
        }

    }
    public Object clone(){
        //this seq를 복제하는 함수
        //Throws - OutOfMemoryError, clone을 형성하기에 메모리가 충분하지 않으면 에러 발생
        //seq의 복제품인 객체를 반환함
        //복제품에 가한 변화는 원래 함수에 영향을 미치지 않고 그 반대도 마찬가지임
        //반환값에 사용 전 DoubleArraySeq으로의 타입캐스팅이 필요함

        DoubleArraySeq newObject = new DoubleArraySeq(capacity);
        //this.capacity를 capacity로 가지는 새로운 객체 생성
        newObject.manyItems = manyItems;
        newObject.currentIndex = currentIndex;
        newObject.data = data;
        //this.manyItem, currentIndex, data를 newObject에 복제

    return newObject;
    }
    public static DoubleArraySeq concatenation(DoubleArraySeq s1, DoubleArraySeq s2){
        //인자로 들어오는 두 seq을 차례로 잇는 새로운 배열을 만듦
        //parameters - s1:첫 번째 배열, s2:첫 번째 배열 뒤에 이어지는 두 번째 배열
        //precondition - 두 seq 모두 null이 아님
        //current element가 없는 s1 뒤에 s2가 이어진 새로운 배열 반환
        //Throws - OutOfMemoryError / NullPointerException

        DoubleArraySeq s3 = new DoubleArraySeq(s1.capacity+s2.capacity);

        if(s1.manyItems!=0 && s2.manyItems!=0) { //두 seq가 null이 아님
            for (int i = 0; i < s1.manyItems; i++) { //s1.data의 값 복사
                s3.data[i] = s1.data[i];
            }
            for (int i = s1.manyItems; i < s1.manyItems + s2.manyItems; i++) { //s2.data의 값 복사
                s3.data[i] = s2.data[i - s1.manyItems];
            }
            s3.manyItems = s1.manyItems + s2.manyItems;
            s3.currentIndex = s3.manyItems; //current element가 없음
            return s3;
        }
        else{ //한 argument가 null이면 오류 발생
            throw new NullPointerException("the argument is null");
        }
    }
    public void ensureCapacity(int minimumCapacity){
        //현재 seq의 capacity를 바꾸는 함수
        //parameters - minimumCapaciry: seq의 새로운 capacity
        //postcondition - seq의 capacity는 최소 minimunCapacity보다 큰 수로 변경되어야 함
        //Throws - OutOfMemoryError

        double [] tmp = new double[minimumCapacity]; //minumunCapacity만큼의 크기를 가진 double형 배열 생성
        for(int i=0; i<manyItems; i++){ //data의 값 복사
            tmp[i] = data[i];
        }
        data = tmp; //data가 tmp의 레퍼런스를 참조하도록 함
        capacity = minimumCapacity; //capacity 변경

    }
    public int getCapacity(){
        //현재 seq의 capacity를 반환
        return capacity;
    }
    public double getCurrent() {
        //precondition - isCurrent() 함수가 true 반환
        //현재 seq의 current element 반환
        //Throws - IllegalStateException - current element가 없으면 error 발생
        if (isCurrent() == true) {
            //currnetelement가 존재한다면
            return data[currentIndex];
        }
        else{ //current element가 없으면
                throw new IllegalStateException("current element doesn't exist");
            }
    }
    public boolean isCurrent(){
        //current element가 존재하면 true 반환
        //current element가 존재하지 않으면 false 반환

        if(currentIndex==manyItems) return false;
            //current element가 없으면 currnetIndex==manyItems이기 때문, empty seq일 경우도 포함
        else{
            return true;
        }

    }
    public void removeCurrent(){
        //현재 seq에서 current element를 제거하는 함수
        //precondition - isCurrent()함수가 true 반환 / currnet element가 존재해야 함
        //postcondition - seq에서 current element가 제거되어야 함
                //제거된 element의 다음 element가 있으면 그 element가 current element가 됨
                //제거된 element의 다음 element가 없다면 current element는 없어짐
                //제거된 element의 뒤 element는 제거된 인덱스까지 한 자리씩 앞당겨짐
        //Throws - IllegalStateException, current element가 없으면 removeCurrent 함수가 실행되지 않음

if(isCurrent()==true){ //currentelement가 존재하면
    if(currentIndex+1==manyItems){ //currentelement 다음 원소가 없으면
        data[currentIndex] = '\0'; //currentelement 제거
        manyItems--;
        //currentIndex == manyItems 이기 때문에 currentItems는 없어짐
    }
    else{ //currentelement원소 다음에 원소가 있으면
        data[currentIndex] = '\0';
        for(int i=currentIndex; i<manyItems; i++){
            data[i] = data[i+1];
        }
        manyItems--;
        data[manyItems]='\0'; //맨 끝 요소 제거
        // 제거된 요소 다음 요소가 currentelement가 됨
    }
}
else{ //current element가 없으면
    throw new IllegalStateException("Currnet Element doesn't exist");
}
    }

    public int size(){
        //seq의 요소의 개수를 반환함
    return manyItems;
    }

    public void start(){
        //seq의 맨 앞 요소를 current element로 지정함
        //postcondition - seq의 맨 앞 요소가 current element로 지정됨 / empty seq라면 current element는 없음

    if(manyItems>0) currentIndex = 0; //empty seq가 아니라면
        else currentIndex = manyItems; //empty seq라면 currentIndex == manyItems

    }
    public void trimToSize(){
        //seq의 capacity를 현재 seq에 포함된 요소의 개수로 감소
        //postcondition - seq의 capacity가 현재 seq의 요소의 개수로 감소
        //Throws - OutOfMemoryEror

        //manyitems를 capacity로 가지는 새로운 객체 생성
        DoubleArraySeq tmp = new DoubleArraySeq(manyItems);
        for(int i=0; i<manyItems; i++){
            tmp.data[i] = data[i]; //data의 값 복사
        }
        data = tmp.data; //data를 capacity를 줄인 배열로 변경
        capacity = manyItems; //capacity를 현재 seq에 포함된 요소의 개수로 변경


    }
    public static void main(String[] args){
        //constructor1을 사용해 capacity가 10인 빈 seq 생성
        DoubleArraySeq arr1 = new DoubleArraySeq();
        //constructor2를 사용해 capacity가 5인 빈 seq 생성
        DoubleArraySeq arr2 = new DoubleArraySeq(5);



        //-----addAfter(), addBefore()-----

        arr1.addAfter(3);
        arr1.addBefore(5);
        //ManyItems ==2, currentIndex = 0, data = [5, 3]
        System.out.println("arr1 :: manyItems : "+arr1.manyItems +" currentIndex : "+arr1.currentIndex);

        arr2.addBefore(7);
        arr2.addBefore(8);
        arr2.addBefore(9);
        //ManyItems == 3, currentIndex = 0, data = [9, 8, 7];
        System.out.println("arr2 :: manyItems : "+arr2.manyItems +" currentIndex : "+arr2.currentIndex);



        //----advance(), addAll()-----

        arr1.advance(); //arr1.currentIndex = 1;
        arr2.advance();
        arr2.advance(); //arr2.currentIndex = 2;
        System.out.println("arr1.currentIndex: "+arr1.currentIndex +" and  arr2.currentIndex : "+arr2.currentIndex);

        arr1.addAll(arr2);
        //arr1.data = {5.0, 3.0, 9.0, 8.0, 7.0}, manyItems = 5, currentIndex = 1; capacity = 10;
        System.out.printf("\narr1 :: manyItems = %d, currentIndex = %d, capacity = %d\n", arr1.manyItems, arr1.currentIndex, arr1.capacity);
        for(int i=0; i< arr1.manyItems; i++){
            System.out.print(arr1.data[i]+", ");
        }



        //------size(), getCurrent(), getCapacity()-----

        System.out.println("\n\narr2.size : "+arr2.size()+", arr2.currentelement : "+ arr2.getCurrent() +", arr2.currentCapacity : " + arr2.getCapacity());
        //arr2.size : 3, arr2.currentelement : 7.0, arr2.currentCapacity : 5



        //-----start(), trintosize()-----
        arr1.start();
        arr1.trimToSize();
        System.out.println("\narr1.currentIndex : "+arr1.currentIndex + "  arr1.capacity : "+arr1.capacity +"  arr1.manyItems : " +arr1.manyItems);
        //arr1.currentIndex = 0, arr1.capacity = 5, arr1.manyItems = 5




        //-----concatenation(), removecurrent(), ensureCapacity----

        DoubleArraySeq arr3 = concatenation(arr1, arr2);
        System.out.println("\narr3.manyItems : "+arr3.manyItems + "  arr3.capacity : "+arr3.getCapacity());
        for(int i=0; i<arr3.manyItems; i++){
            System.out.printf("%f, ",arr3.data[i]);
        }
        //arr3.manyItems = 8, arr3.capacity = 10
        //5, 3, 9, 8, 7, 9, 8, 7

        arr3.start(); //currentIndex = 0;
        arr3.advance(); //currentIndex = 1;
        arr3.removeCurrent(); //remove arr3.data[1]
        arr3.ensureCapacity(8);
        System.out.println("\n\narr3.currentelement : "+arr3.getCurrent() + "  arr3.manyItems : "+arr3.manyItems + "  arr3.capacity : "+arr3.getCapacity());
        for(int i=0; i<arr3.manyItems; i++){
            System.out.printf("%f, ",arr3.data[i]);
        }
        //arr3.currentelement = 9, arr3.manyItems = 7, arr3.capacity = 8
        //5, 9, 8, 7, 9, 8, 7



        //----clone()---
        DoubleArraySeq arr4 =  (DoubleArraySeq)arr2.clone();
        System.out.println("\n\narr4.currentelement : "+arr4.getCurrent()+"  arr2.currentelement : "+arr2.getCurrent());
        System.out.println("arr4.manyItmes : "+arr4.size()+"  arr2.manyItems : "+arr2.size());
        System.out.println("arr4.capacity : "+arr4.getCapacity()+"  arr2.capacity : "+arr2.getCapacity());
        //arr4.currentelement : 7, arr2.currentelement : 7
        //arr4.manyItems : 3, arr2.manyItems : 3;
        //arr4.capacity : 5, arr2.capacity : 5


        System.out.println("\narr4.data :");
        for(int i=0; i<arr4.manyItems; i++){
            System.out.printf("%f ", arr4.data[i]);
        }
        System.out.println("\narr2.data :");
        for(int i=0; i<arr2.manyItems; i++){
            System.out.printf("%f ", arr2.data[i]);
        }
        //arr4.data : 9, 8, 7
        //arr2.data : 9, 8, 7


    }
}
