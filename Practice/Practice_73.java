package Practice;

import java.util.Scanner;

public class Practice_73 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("숫자를 입력하세요: ");
        int num2 = scanner.nextInt();

        if(num1==num2)
        {
            System.out.println("두 숫자는 같습니다.");
        }
        else{

            int max = (num1 > num2) ? num1 :num2;

            System.out.println("더 큰 수 = " + max);

        }

    }
}




