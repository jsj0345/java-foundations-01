package Practice;

import java.util.Scanner;

public class Practice_107 {
    public static void main(String[] args) {

        int menu = 0;
        int num = 0;

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");
            System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

            String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장.
            menu = Integer.parseInt(tmp); // 입력받은 문자열(tmp)를 숫자로 반환.

            if(menu==0)
            {
                System.out.println("프로그램을 종료합니다.");
                break; // menu==0이면 while문 탈출. 
            } else if(!(1<=menu && menu>=3)){ // 1번,2번,3번을 제외한 나머지 번호를 고르면 잘못 선택했다고 만든 코드.
                System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
                continue; //1~3번이외의 숫자를 입력하면 다시 while문 조건식으로 돌아가서 반복 실행.
            }

            System.out.println("선택하신 메뉴는 "+ menu +"번입니다.");



        }

    }
}
