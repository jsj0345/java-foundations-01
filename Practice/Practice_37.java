package Practice;

public class Practice_37 {

    public static void main(String[] args) {
        int grade = 2;

        int coupon = switch (grade)
        {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };

        System.out.println("발급받은 쿠폰 " + coupon);
        // switch문의 다른 형식.
    }
}
