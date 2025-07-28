package Practice;

import java.util.Scanner;

public class Practice_81 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("두 변수의 값을 서로 바꾸는 프로그램임.");

        System.out.print("변수 a의 값을 입력하시오:");
        int a = input.nextInt();

        System.out.print("변수 b의 값을 입력하시오:");
        int b = input.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = " + a + " , b = " + b );

    }
}

