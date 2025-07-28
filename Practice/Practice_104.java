package Practice;

import java.util.Scanner;

public class Practice_104 {
    public static void main(String[] args) {

        int input = 0, answer = 0;

        answer = (int) (Math.random() * 100) +1; // 1~100 사이의 임의의 수를 저장.
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("1과 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt(); //사용자로부터 숫자 입력을 받음.

            if (input > answer) { // 입력받은 수와 난수를 비교한다음, 난수가 더 클때.
                System.out.println("더 작은수로 다시 시도해보세요.");
            } else if (input < answer) { // 입력받은 수와 난수를 비교한다음, 입력받은 수가 더 클때.
                System.out.println("더 큰수로 다시 시도해보세요.");
            }
        }while(input!=answer); // 서로 다를때까지 반복문을 수행. (단 맨처음은 조건식과 관계없이 무조건 한번은 수행.)

        System.out.println("정답입니다."); // 같을때 정답입니다. 출력.
    }
}
