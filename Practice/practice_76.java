package Practice;

import java.util.Scanner;

public class practice_76 {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("0을 입력하면 프로그램은 종료, 여태까지 입력했던 숫자들을 더하는 프로그램");

        while(true)
        {
            System.out.print("숫자를 입력하세요:");
            int num = scanner.nextInt();
            sum = sum + num;

            if(num==0)
            {
                System.out.println("입력한 모든 수의 합 : " + sum);
                break;
            }
        }

    }
}




