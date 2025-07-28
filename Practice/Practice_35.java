package Practice;

public class Practice_35 {

    public static void main(String[] args) {

        int grade = 2;

        int coupon;

        switch (grade)
        {
            case 1:
                coupon = 1000;
                break;  // break를 만나면 switch문에서 탈출.
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;

            default:  // default는 case 1, 2, 3이 아닌 이외의 경우.
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 : " + coupon);

    }
}
