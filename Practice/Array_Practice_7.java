package Practice;

public class Array_Practice_7 {
    public static void main(String[] args) {
        int sum = 0;
        float average = 0.0f;

        int[] score ={100,88,100,100,90};

        for(int i=0; i<score.length ; i++)
        {
            sum+=score[i];
        }

        average = sum / (float) score.length; // 형 변환.

        System.out.println("총합 : "+sum);
        System.out.println("평균 : "+ average);


    }
}
