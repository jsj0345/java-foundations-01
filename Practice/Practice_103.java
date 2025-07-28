package Practice;

import java.util.Scanner;

public class Practice_103 {
    public static void main(String[] args) {

        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요.(예:12345)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장.
        num = Integer.parseInt(tmp);

        // Interger.parseInt()는 자바에서 문자열을 숫자로 변환시키는 방법임.
        /*

        ()안에 문자열이 들어갔다고 생각하자.
        숫자형의 문자열을 인자 값으로 받으면 해당 값을 10진수의 Integer 형으로 반환 해줌.

         */

        while(num!=0)
        {
            // num을 10으로 나눈 나머지를 sum에 더함.
            sum+=(num%10); //  sum = sum + (num%10)

            /*
            num%10을 이용하여 일의 자리, 십의 자리, 백의 자리, 천의 자리, 만의 자리를 추출.
             */
            System.out.printf("sum=%d num=%d%n",sum,num);

            num /=10; // num = num / 10; num을 10으로 나눈 값을 다시 num에 저장. 자릿수를 추출하기 위해 num으로 초기화 해줘야함
        }

        System.out.println("각 자리수의 합:"+sum);

    }
}
