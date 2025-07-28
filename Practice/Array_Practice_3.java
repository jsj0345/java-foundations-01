package Practice;

public class Array_Practice_3 {
    public static void main(String[] args) {

        // for문을 이용한 배열의 초기화.

       /* int[] score = new int[5];  // 길이가 5인 배열 생성.

        for(int i=0 ; i<score.length ; i++){
            score[i] = i * 10 +50; // 초기화.
            System.out.println(score[i]);
        }

        */

        int[] score = new int[]{50,60,70,80,90}; // 생성 및 초기화를 동시에함.

        for(int i=0; i<score.length ; i++)
        {
            System.out.println(score[i]);
        }

        // score = new int[]{50,60,70,80,90}은 가능함.

        // 주의사항 : score = {50,60,70,80,90}은 불가능.



    }
}
