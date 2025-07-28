package Practice;

import java.util.Scanner;

public class Practice_74 {

    public static void main(String[] args) {

        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("문자열을 입력하세요:");
            String str1 = scanner.nextLine();
            System.out.println("입력한 문자열:" +str1);

            if(str1.equals("exit"))
            {;
                break;
            }
        }

    }
}

