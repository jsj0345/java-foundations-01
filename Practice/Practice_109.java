package Practice;

import java.util.Scanner;

public class Practice_109 {

    public static void main(String[] args) {

        String a = "";

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        a = convertBinary(n);

        System.out.println(a);

    }


    public static String convertBinary(int n) {
        // 이곳에 여러분의 알고리즘을 구현해주세요!
        int portion = 0 , remainder = 0;
        String a_memory ="";

        while(true)
        {
            portion = (n/2);
            remainder= (n%2);

            a_memory =  remainder + a_memory;

            n = portion ;


            if(n==1)
            {
                a_memory = n + a_memory;
                break;
            }



        }

        return a_memory;
     }
}
