package Practice;

public class Practice_67 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue); // longValue = 10

        doubleValue = intValue ; // int -> double
        System.out.println("doubleValue1 = " +doubleValue); // doubleValue1=10.0

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue); // doubleValue2= 20.0

    }
}




/*
정리하면 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용한다.
쉽게 이야기하면 큰 그릇은 작은 그릇에 담긴 내용물을 담을 수 있다.
 */

/*

자동 형 변환 : 대입하는 형(타입)을 맞추어야 하기 때문에 개념적으로 다음과 같이 동작한다.
// intValue = 10
doubleValue = intValue
doubleValue = (double) intValue // 형 맞추기
doubleValue = (double) 10 // 변수 값 읽기
doubleValue = 10. 0 // 형 변환.

이렇게 앞에 (double) 과 같이 적어주면 int 형이 double 형으로 형이 변한다.
이렇게 형이 변경되는 것을 형변환이라 한다.
작은 범위 숫자 타입에서 큰 범위 숫자 타입으로의 대입은 개발자가 이렇게 직접 형변환을 하지 않아도 된다.
이런 과정이 자동으로 일어나기 때문에 자동 형변환, 또는 묵시적 형변환이라 한다.

 */