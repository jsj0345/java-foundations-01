package Practice;

public class Practice_69 {

    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int 최고값 , 리터럴에 아무런 표시도 없으면 int형으로 취급.
        long maxIntOver = 2147483648L; // int 최고값 + 1 (초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환.
        System.out.println("maxIntValue Casting = " + intValue);

        intValue = (int) maxIntOver; // 형변환.
        System.out.println("maxIntOver Casting = " + intValue); // Overflow 발생.
    }
}



/*
보통 오버플로우가 발생하면 마치 시계가 한바퀴 돈 것 처럼 다시 처음부터 시작한다.
참고로 -2147483648 숫자는 int의 가장 작은 숫자이다.

 */


