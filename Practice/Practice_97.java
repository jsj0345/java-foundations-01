package Practice;

import java.util.Scanner;

public class Practice_97 {
    public static void main(String[] args) {

        System.out.print("현재 월을 입력하세요>");

        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt(); // 화면을 통해 입력받은 숫자를 month에 저장.

        switch(month){ // month에 초기화 된 숫자가 어떤 것이냐에 따라 case ?로 이동한다. ( ? = 1~12 )
            case 3: // case 3에는 아무것도 없으므로 아래에 있는 case 4 실행.
            case 4: // case 4에는 아무것도 없으므로 아래에 있는 case 5 실행.
            case 5:
                System.out.println("현재의 계절은 봄입니다.");
                break; // case 5를 실행 break를 통해 switch문을 탈출한다.
            case 6: case 7: case 8:
                System.out.println("현재의 계절은 여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.println("현재의 계절은 가을입니다.");
                break;
            default: // default는 위에서 언급한 case들을 제외한  1,2,12 일 때를 의미한다.
                System.out.println("현재의 계절은 겨울입니다.");
        }
    }
}
