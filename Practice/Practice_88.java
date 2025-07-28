package Practice;

import java.util.Scanner;

public class Practice_88 {

    public static void main(String[] args) {
        System.out.print("숫자를 하나 입력하세요.>");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 input에 저장.

        /*
        Scanner scanner = new Scanner(System.in);

        이 코드는 객체와 클래스를 배워야 정확히 이해할 수 있다.
        지금은 Scanner의 기능을 사용하기 위해 new를 사용해서 Scanner를 만든다 정도로 이해하면 된다.
        Scanner는 System.in을 사용해서 사용자의 입력을 편리하게 받도록 도와준다.

        Scanner scanner 코드는 scanner 변수를 선언하는 것이다.
        이제부터 scanner 변수를 통해서 scanner를 사용할 수 있다.
         */

        if(input==0)
        {
            System.out.println("입력하신 숫자는 0입니다.");
        }
        else
        {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }

    }
}

// 예제 4-3
