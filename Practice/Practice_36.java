package Practice;

public class Practice_36 {

    public static void main(String[] args) {

        int grade = 2;

        int coupon;

        switch (grade)
        {
            case 1:
                coupon = 1000;
                break;  // break를 만나면 switch문에서 탈출.
            case 2:
            case 3:
                coupon = 3000;  // 이런식으로 코드를 작성하면 case 2로 간다음에 그 다음 라인의 코드를 수행.
                break;

            default:  // default는 case 1, 2, 3이 아닌 이외의 경우.
                coupon = 500;
        }

        System.out.println("발급받은 쿠폰 : " + coupon);

    }
}