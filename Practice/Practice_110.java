package Practice;

import java.util.Scanner;

public class Practice_110 {
    public static void main(String[] args) {
        int starDistance = 0;
        Scanner scan = new Scanner(System.in);

        starDistance = scan.nextInt();

        for (int i = 1; i <= 3; i++) {
            System.out.print("*");
            for (int j = 1; j <= starDistance; j++) {
                System.out.print(" ");
            }

        }

        System.out.println();

        if(starDistance%2!=0)
        {
            for (int i = 1; i <= starDistance - 1; i++) {
                System.out.print(" ");
            }
        }

        if(starDistance %2 ==0) {

            for (int i = 1; i <= starDistance - 2; i++) {
                System.out.print(" ");
            }
        }

        if (starDistance % 2 == 0) {
            for (int i = 1; i <= 2 ; i++) {
                System.out.print("*");
                for (int j = 1; j <= starDistance; j++) {
                    System.out.print(" ");
                }

            }
        } else {
            for (int i = 1; i <= 2; i++) {
                System.out.print("*");
                for (int j = 1; j <= starDistance; j++) {
                    System.out.print(" ");
                }

            }

            System.out.println();

        }
    }
}
