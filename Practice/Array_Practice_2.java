package Practice;

public class Array_Practice_2 {
    public static void main(String[] args) {

        /*int[] score = new int[5]; // 길이가 6인 int배열.

        for(int i=0 ; i<6 ; i++)
        {
            System.out.println(score[i]);
        }

         */

        /*
        배열의 길이를 줄이고 나서 for문에 배열의 길이를 생각안하고 코드를 짠 경우가 위와 같은 경우다.
        위 코드처럼 배열의 길이를 매번 생각하면서 적으면 번거로울 것이다.
        따라서, 배열이름.length를 사용하면 for문의 조건식을 일일이 변경해주지 않아도 된다.
         */

        int score[] = new int[5];

        for(int i=0; i<score.length; i++)
        {
            System.out.println(score[i]);
        }





    }
}
