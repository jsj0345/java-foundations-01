package Practice;

public class Practice_19 {

    public static void main(String[] args) {
    // 변수 초기화.
    int a=5;
    int b=2; // b를 0으로 초기화하면 어떻게 될까? 나눗셈에서 프로그램이 실행이 안되고 아예 멈춤.

    // 덧셈

    int sum = a + b;
    System.out.println("a + b = " + sum); // 출력 a + b = 7

    /*
    "a + b = "은 문자열이고 sum은 int형이다.
    문자열과 int형을 원래 합칠수는 없으나 java에서는 문자열과 더하려는 대상을 문자열로 바꿔주는 기능이 있어서 에러가 없는것이다.
     */

    // 뺄셈
    int diff = a - b;
    System.out.println("a - b = " + diff); // 출력 a - b = 3

    // 곱셈
    int multi = a * b;
    System.out.println("a * b = " + multi); // 출력 a * b = 10

    // 나눗셈
    int div = a / b ; //  -> 인트형끼리 계산해서 결과가 2.5가 아닌 2로나옴. (소수점 표현이 불가)
    System.out.println("a / b = " + div);  // 출력  a / b = 2

    // 나눗셈
    int mod = a % b; // 나머지 1
    System.out.println("a % b = " + mod); // 실무와 알고리즘에서 종종 사용됨. 잘 알아두기.

    }
}
