package Practice;

public class Practice_99 {
    public static void main(String[] args) {

        int sum = 0; // 합계를 저장하기 위한 변수.

        for(int i=1; i<=5 ; i++)
        {
            sum+=i; // sum = sum +i

            /*
            i가 1일 때, sum = 0 + 1
            i가 2일 때, sum = 1 + 2
            i가 3일 때, sum = 3 + 3
            i가 4일 때, sum = 6 + 4
            i가 5일 때, sum = 10 + 5

            sum값이 누적된다.

            앞에 int sum = 0;을 선언한 이유는 for문에다가 sum을 넣어주면 누적되지 않기 때문이다.
             */

            if(i==5){
                System.out.println("1부터 "+i+" 까지의 합은 " +sum);
            }
        }

    }
}
