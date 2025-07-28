package Practice;

import java.util.Scanner;

public class Practice_72 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자1을 입력하세요: ");
        int intValue1 = scanner.nextInt();

        System.out.print("숫자2를 입력하세요: ");
        int intValue2 = scanner.nextInt();

        int sum = intValue1 + intValue2;

        System.out.println("두 수의 합은 = " + sum);

    }
}

