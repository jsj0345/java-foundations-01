package Practice;

import java.util.Scanner;

public class Practice_108 {
    public static void main(String[] args) {
        int item_price_sum = 0;

        while(true)
        {
            System.out.println("1: 상품 입력, 2: 결제 , 3: 프로그램 종료");
            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();
            scanner.nextLine();;

            if(option==1)
            {
                System.out.print("상품명을 입력하세요: ");
                String item_name = scanner.nextLine();
                System.out.print("상품의 가격을 입력하세요: ");
                int item_price = scanner.nextInt();
                System.out.print("구매 수량을 입력하세요: ");
                int item_quantity= scanner.nextInt();

                System.out.println("상품명:"+item_name+" 가격:"+item_price+" 수량:"+item_quantity
                +" 합계:"+item_price*item_quantity);
                scanner.nextLine();
                item_price_sum = item_price_sum + item_price*item_quantity;

            }
            else if (option==2)
            {
                System.out.println("총 비용: "+item_price_sum);
            }
            else if(option==3)
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            else
            {
                break;
            }

        }
    }
}
