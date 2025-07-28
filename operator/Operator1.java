package operator;

public class Operator1{
    public static void main(String[] args) {
        // 변수 초기화.
        int a=5;
        int b=2; // b를 0으로 초기화하면 어떻게 될까? 나눗셈에서 프로그램이 실행이 안되고 아예 멈춤.

        // 덧셈

        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력 a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력 a * b = 10

        // 나눗셈
        int div = a / b ; //  -> 인트형끼리 계산해서 결과가 2.5가 아닌 2로나옴. (소수점 표현이 불가)
        System.out.println("a / b = " + div);  // 출력  a / b = 2.5

        // 나눗셈
        int mod = a % b; // 나머지 1
        System.out.println("a % b = " + mod); // 실무와 알고리즘에서 종종 사용됨. 잘 알아두기.


    }
}




