package Practice;

public class Practice_52 {

    public static void main(String[] args) {
        int i = 1 , sum = 0;

        while(true)  // while(true)는 무한 반복을 의미한다.
        {
            sum = sum + i;

            if(sum>10){
                System.out.println("합계가 10보다 처음으로 큰 값은 "+ sum + "입니다.");
                break; // sum의 값이 10보다 클 때, while문을 탈출 한다.
            }

            i++;
        }

    }
}

