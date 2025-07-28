package Practice;

import java.util.Scanner;

public class Practice_83 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while(true)
        {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료):");
            String name =input.nextLine(); // nextLine()은 Line까지 다 읽어옴. (1) // (3) \n이 남아있어서 이름을 입력하기도전에 넘어감.

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요:");
            int age = input.nextInt(); // 숫자만 읽어옴. 여기서 입력할때 10\n (\n은 엔터를 의미.) nextInt는 10만 가져오기 때문에 \n이 남아있음. (2)

            input.nextLine(); // \n 남아있는 enter를 가져감.

            System.out.println("입력한 이름: " +name+","+" 나이: "+age);


        }
    }
}

