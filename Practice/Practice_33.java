package Practice;

public class Practice_33 {

    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");

    }
}

/*
위 코드는 상품의 가격이 10000원 이상 이거나 나이가 10살 이하면 가격을 각 조건마다 가격을 1000원씩 깎아주는 코드다.
이렇게 조건이 여러가지가 있을 땐 다중 if 문을 쓰는게 코드의 효율성이 더 있을 수도 있다.
 */
