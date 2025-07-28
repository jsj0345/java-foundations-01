package Practice;

import java.util.Scanner;

public class Practice_85 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int a=0;
        double average;
        while(true)
        {

            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
            int num = input.nextInt();


            if(num == -1) {
                average = (double) sum / a; // sum과 a가 int형이라 소수까지 표현하려면 형변환을 해줘야함.
                System.out.println("입력한 숫자들의 합계: " +sum);
                System.out.println("입력한 숫자들의 평균: " +average);

                break;
            }

            sum = sum + num;
            a++;

        }

    }
}
