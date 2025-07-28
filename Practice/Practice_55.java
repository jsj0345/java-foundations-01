package Practice;

public class Practice_55 {

    public static void main(String[] args) {

        int sum = 0, endNum=100;

        for(int i = 1; i<=endNum ; i++)
        {

            sum = sum + i;

            if(sum>10)
            {
                System.out.println("합이 10보다 크면 종료 " + "i= "+ i +" sum = " +sum);
                break;
            }
        }




    }
}

// for( ; ; )은 무한 반복을 의미한다. for문에서 초기식, 조건식, 증감식은 선택임.

