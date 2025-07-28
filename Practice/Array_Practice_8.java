package Practice;

public class Array_Practice_8 {
    public static void main(String[] args) {

        int[] score = {79, 88, 91, 33, 100, 55, 95};
        int max =score[0];
        int min =score[0];

        for (int i=1; i<score.length ; i++) // 0 번째 요소는 이미 변수 선언 및 초기화에서 지정 했기 때문에 1 번째 요소부터 본다.
        {
            if(score[i] > max)
            {
                max = score[i]; // 요소마다 비교를 하고 비교했을 때, max보다 크면 max를 초기화한다. (이렇게 하다 보면 결국 max는 최댓값으로.)
            }
            else if(score[i]<min)
            {
                min = score[i]; // 위에랑 똑같은 원리
            }

        }

        System.out.println("최대값 :"+max);
        System.out.println("최소값 :"+min);
    }
}
